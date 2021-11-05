package com.fillswim.spring.Introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Конфигурация приложения с помощью Java кода
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            Cat cat = context.getBean("cat", Cat.class);
            cat.say();
            System.out.println();

            Person person = context.getBean("person", Person.class);
            person.callPet();
        }
    }
}
