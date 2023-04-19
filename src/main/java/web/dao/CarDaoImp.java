package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class CarDaoImp implements CarDao {
    public List<Car> cars = new ArrayList<>();
    Integer quantity = 5;
    public CarDaoImp() {
        for (int i = 0; i < quantity; i++) {
            cars.add(new Car(
                    "CarModel#" + i,
                    "CarColor#" + i,
                    (int) (Math.random() * 8) + 1));
        }
    }

    public List<Car> getCarsList() {
        return Collections.unmodifiableList(cars);
    }

    public List<Car> getCarsList(Integer count) {
        return Collections.unmodifiableList(cars.subList(0, count));
    }

}
