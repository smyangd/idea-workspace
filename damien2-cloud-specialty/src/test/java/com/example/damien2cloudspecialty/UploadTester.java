package com.example.damien2cloudspecialty;

import com.example.damien2cloudspecialty.service.UploadService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UploadTester {

    @Autowired
    private UploadService uploadService;

    @Test
    @SneakyThrows
    public void testHandleFileUpload() {

        File file = new File("upload.txt");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try (InputStream input = new FileInputStream(file); OutputStream os = fileItem.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi = new CommonsMultipartFile(fileItem);

        //log.info(uploadService.handleFileUpload(multi));
        System.out.print("dsadsadsadsadsadsaasd111111111111111111111111111111111111111    "+uploadService.handleFileUpload(multi)+"   ");
    }

}