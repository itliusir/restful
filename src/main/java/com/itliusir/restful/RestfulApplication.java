package com.itliusir.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 启动类
 *
 * @author itliusir
 * @see
 * @since 2017-10-16
 */

@SpringBootApplication
public class RestfulApplication{

	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}
}

/*@SpringBootApplication
public class RestfulApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new RestfulApplication()
				.configure(new SpringApplicationBuilder(RestfulApplication.class))
				.run(args);

	}
}*/
