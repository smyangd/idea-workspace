package com.example.damien2cloudspecialty.service;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "cloud-class", configuration = UploadService.MultipartSupportConfig.class)
public interface UploadService {
 
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestPart(value = "file") MultipartFile file);
 
    @Configuration
    class MultipartSupportConfig {
        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }
 
}