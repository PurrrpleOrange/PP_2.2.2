package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public class CarService {
    public List<Car> countCars(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
