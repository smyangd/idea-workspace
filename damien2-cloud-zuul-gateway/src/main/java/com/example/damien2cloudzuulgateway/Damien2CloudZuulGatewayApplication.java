package com.example.damien2cloudzuulgateway;

import com.example.damien2cloudzuulgateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@EnableZuulProxy    //并使用@EnableZuulProxy注解开启Zuul的功能。
@SpringBootApplication
public class Damien2CloudZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudZuulGatewayApplication.class, args);
	}

	/**
	 * 对接口进行过滤
	 * */
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}


	@Component
	@Primary
	class DocumentationConfig implements SwaggerResourcesProvider {

		@Override
		public List<SwaggerResource> get() {
			List resources = new ArrayList<>();
			resources.add(swaggerResource("cloud-student", "/cloud-student/v2/api-docs", "2.0"));
			resources.add(swaggerResource("cloud-teacher", "/cloud-teacher/v2/api-docs", "2.0"));
			return resources;
		}

		private SwaggerResource swaggerResource(String name, String location, String version) {
			SwaggerResource swaggerResource = new SwaggerResource();
			swaggerResource.setName(name);
			swaggerResource.setLocation(location);
			swaggerResource.setSwaggerVersion(version);
			return swaggerResource;
		}
	}

}
