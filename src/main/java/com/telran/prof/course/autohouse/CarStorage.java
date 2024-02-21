package com.telran.prof.course.autohouse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarStorage {

    Map<String, Car> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        List<Car> cars = Arrays.asList(
                new Car("Mazda", "CX-3", "Black", "gasoline",
                        203, 2019, 76000),
                new Car("Mazda", "CX-5", "White", "diesel",
                        175, 2019, 93000),
                new Car("Mazda", "CX-7", "Brown", "gasoline",
                        215, 2020, 96000),
                new Car("Volvo", "XC-40", "Grey", "hybrid",
                        160, 2021, 73000),
                new Car("Volvo", "XC-60", "Black", "gasoline",
                        190, 2019, 91000),
                new Car("Volvo", "XC-90", "White", "diesel",
                        230, 2022, 105000),
                new Car("Toyota", "CH-R", "White", "hybrid",
                        150, 2022, 41000),
                new Car("Toyota", "RAV-4", "Black", "hybrid",
                        175, 2021, 81000)
        );
        cars.forEach(car -> storage.put(car.getModel(), car));
    }

    public Map<String, Car> getStorage() {
        return storage;
    }
}
