package com.telran.prof.course.autohouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CreateRecommendation {

    @Autowired
    private List<Filter> filterList = Collections.emptyList();

    public List<Car> getCar(String filterParam, int type) {
        for (Filter filter : filterList) {
            if (filter.canFilter(type)) {
                return filter.getCar(filterParam);
            }
        }
        return new ArrayList<>();
    }
}

