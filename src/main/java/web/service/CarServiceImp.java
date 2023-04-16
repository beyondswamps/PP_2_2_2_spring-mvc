package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    public List<Car> cars = new ArrayList<>();
    Integer quantity = 5;
    public CarServiceImp() {
        for (int i = 0; i < quantity; i++) {
            cars.add(new Car(
                    "CarModel#" + i,
                    "CarColor#" + i,
                    (int) (Math.random() * 8) + 1));
        }
    }

    public List<Car> getCarsList() {
        return cars;
    }
}
