package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Owner owner = context.getBean(Owner.class);
        Dog dog = context.getBean(Dog.class);

        System.out.println("Owner's name: " + owner.getName());
        System.out.println("Dog's name: " + dog.getName());
        System.out.println(owner.getName() + "'s dog: " + owner.getDog());
    }
}