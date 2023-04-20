package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(required = false) Integer count) {
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
