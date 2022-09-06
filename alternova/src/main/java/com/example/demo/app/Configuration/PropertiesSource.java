package com.example.demo.app.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:system.properties")
public class PropertiesSource {

}
