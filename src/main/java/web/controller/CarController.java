package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;
import web.service.CarServiceImplementation;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService CarService = new CarServiceImplementation();

    @GetMapping("/{count}")
    public String GetCarsByCount(@PathVariable int count, ModelMap model) {
        if (count >= 5) {
            return "redirect:/cars/";
        }

        model.addAttribute("msg", "ООООО, а вот так мне нравится!");

        model.addAttribute("cars", CarService.GetCarsByCount(count));

        return "cars";
    }

    @GetMapping("/")
    public String GetCarsAll(ModelMap model) {
        model.addAttribute("msg", "ООООО, а вот так мне нравится!");

        model.addAttribute("cars", CarService.GetCarsAll());

        return "cars";
    }


    //Мне так не нравится, но вот.
    @GetMapping("")
    public String Test(ModelMap model, int count) {
        model.addAttribute("msg", "Мне так не нравится, но вот.\nЕсть варинат через cars/{count}.");

        if (count < 5) {
            model.addAttribute("cars", CarService.GetCarsByCount(count));
        } else {
            model.addAttribute("cars", CarService.GetCarsAll());
        }

        return "cars";
    }
}
