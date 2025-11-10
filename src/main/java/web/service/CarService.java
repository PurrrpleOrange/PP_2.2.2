package web.service;

import web.models.Car;

import java.util.LinkedList;
import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
