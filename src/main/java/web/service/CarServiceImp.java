package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDao carDao;
    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCarsList(Integer count) {
        if (count > 0 && count < 5) return carDao.getCarsList(count);
        return carDao.getCarsList();
    }
}
