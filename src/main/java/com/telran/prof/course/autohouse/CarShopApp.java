package com.telran.prof.course.autohouse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class CarShopApp {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        CreateRecommendation rec = context.getBean("createRecommendation",
                CreateRecommendation.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose param of filtration ( 1 - Fabric, 2 - Year of manufacture, 3 - max price)");
        int type = sc.nextInt();
        System.out.println("Print param");
        String filter = new Scanner(System.in).nextLine();

        List<Car> cars = rec.getCar(filter, type);
        System.out.println("Car list with your wishes");
        cars.forEach(System.out::println);

        context.close();

    }
}
