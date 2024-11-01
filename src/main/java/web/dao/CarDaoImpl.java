package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    List<Car> cars;
    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "red", 200));
        cars.add(new Car("Mazda", "brown", 220));
        cars.add(new Car("Kia", "black", 210));
        cars.add(new Car("Renault", "white", 250));
        cars.add(new Car("Toyota", "blue", 280));
    }
    @Override
    public List<Car> getCars(int count) {
        if(count < 0) return cars;
        return cars.subList(0, Math.min(count, 5));
    }
}
