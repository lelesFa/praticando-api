package com.projects.praticandoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@SpringBootApplication
@EnableSwagger2
public class PraticandoApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PraticandoApiApplication.class, args);
		
	}
	
	@RequestMapping ("/")
	@ResponseBody
	String home()
	{
		return "Rodando a aplicacao";
		}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PraticandoApiApplication.class);
	}

}
