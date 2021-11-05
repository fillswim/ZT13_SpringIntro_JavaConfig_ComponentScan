package com.fillswim.spring.Introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.fillswim.spring.Introduction")// Указание по пакет для сканирования и поиск бинов
//@PropertySource("classpath:myApp.properties") // Указание property файла для подгрузки значений в поля объектов
public class AppConfig {

}
