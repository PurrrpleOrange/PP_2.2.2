package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("model1", "red", 1));
        cars.add(new Car("model2", "blue", 2));
        cars.add(new Car("model3", "green", 3));
        cars.add(new Car("model4", "yellow", 4));
        cars.add(new Car("model5", "purple", 5));
    }

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
