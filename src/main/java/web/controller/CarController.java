package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    List<Car> cars = new CarServiceImp().listCars(5);
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model){
        model.addAttribute("cars", cars);
        return "cars";
    }
}
