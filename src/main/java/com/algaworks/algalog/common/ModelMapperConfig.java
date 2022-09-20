package com.algaworks.algalog.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Classe responsavel por configurar bean spring*/
@Configuration
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	
}
