package ma.fstg.car.controllers;

import ma.fstg.car.entities.Car;
import ma.fstg.car.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car findById(@PathVariable Long id) throws Exception {
        return carService.findById(id);
    }
}
