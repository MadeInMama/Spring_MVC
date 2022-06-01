package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService CarService = new CarServiceImpl();

    @GetMapping("")
    public String Test(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", CarService.GetCarsAll());

        } else {
            model.addAttribute("cars", CarService.GetCarsByCount(count));
        }

        return "cars";
    }
}
