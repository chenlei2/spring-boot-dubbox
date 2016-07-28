package org.spring.boot.dubbox.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

@Configuration
@EnableConfigurationProperties
public class DubboAutoConfiguration {	

	@Bean
	@ConfigurationProperties(prefix = "spring.dubbo.applicationConfig")
	public ApplicationConfig applicationConfig() {
		return new ApplicationConfig();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.dubbo.registryConfig")
	public RegistryConfig registryConfig() {
		return new RegistryConfig();
	}
	 
	
	@Bean
	@ConfigurationProperties(prefix = "spring.dubbo.protocolConfig")
	public ProtocolConfig protocolConfig() {
		return new ProtocolConfig();
	}

	@Bean
	public AnnotationBean annotationBean(@Value("${spring.dubbo.basePackages}") String packages) {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setPackage(packages);
		return annotationBean;
	}
	
}
