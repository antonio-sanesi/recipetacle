package it.asanesi.recipetacle.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        var mapper = new ModelMapper();

        // Add custom mappings here

        return mapper;
    }

}
