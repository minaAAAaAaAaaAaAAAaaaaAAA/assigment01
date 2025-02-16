package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    Dog dog(){
        Dog dog = new Dog();
        dog.setName("Napaleon");
        return dog;
    }

    @Bean
    public Owner owner() {
        Owner owner = new Owner();
        owner.setName("Aizana");
        return owner;
    }
}
