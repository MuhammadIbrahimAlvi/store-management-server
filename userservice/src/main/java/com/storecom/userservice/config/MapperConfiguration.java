package com.storecom.userservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class MapperConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
