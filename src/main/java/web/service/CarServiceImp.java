package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    public List<Car> cars = new ArrayList<>();

    public List<Car> listCars(Integer count) {
        for (int i = 0; i < count; i++) {
            cars.add(new Car(
                    "CarName#" + i,
                    "CarColor#" + i,
                    (int) (Math.random() * 8) + 1));
        }
        return cars;
    }
}
