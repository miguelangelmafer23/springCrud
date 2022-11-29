package com.indra.curso.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.indra.curso.controller")
public class ConfiguracionMVC {

	public ConfiguracionMVC() {
		super();
		
	}
	
	@Bean
	public ViewResolver vierResolver() {
		System.out.println("Instanaciando el VR");
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/paginas/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
