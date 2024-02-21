package com.telran.prof.course.autohouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class FabricFilter implements Filter {

    @Autowired
    private CarStorage storage;

    public List<Car> getCar(String filterParam) {
        List<Car> carList = new ArrayList<>();
        Map<String, Car> storage = this.storage.getStorage();
        storage.forEach(((carModel, car) -> {
            if (car.getFabric().equalsIgnoreCase(filterParam)) {
                carList.add(car);
            }
        }));
        return carList;
    }

    @Override
    public boolean canFilter(int type) {
        return 1 == type;
    }
}
