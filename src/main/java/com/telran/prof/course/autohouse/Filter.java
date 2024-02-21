package com.telran.prof.course.autohouse;

import java.util.List;

public interface Filter {

    List<Car> getCar(String filterParam);

    boolean canFilter(int type);
}
