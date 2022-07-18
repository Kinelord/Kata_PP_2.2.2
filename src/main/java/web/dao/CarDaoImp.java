package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Black", "Focus", 10000));
        cars.add(new Car("Red", "Mustang", 23000));
        cars.add(new Car("Purple", "Priora", 2000));
        cars.add(new Car("Yellow", "Dodge", 25000));
        cars.add(new Car("azure", "Cayman", 37000));
    }

    @Override
    public List<Car> getCars(int quantity) {
        return quantity > 5 ? cars.subList(0, 5) : cars.subList(0, quantity);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
