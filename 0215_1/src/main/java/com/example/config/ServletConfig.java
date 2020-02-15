package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.example"})
public class ServletConfig implements WebMvcConfigurer {
//에러가 안나는 이유는 자바 1.8부터 'default method'가 추가되었기 때문
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	InternalResourceViewResolver bean = new InternalResourceViewResolver();
	bean.setViewClass(JstlView.class);
	bean.setPrefix("/WEB-INF/views/");
	bean.setSuffix(".jsp");
	registry.viewResolver(bean);
	}
}
