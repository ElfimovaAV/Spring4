package ru.gb.SpringHome4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.SpringHome4.domain.Animal;
import ru.gb.SpringHome4.service.AnimalService;

@Controller
@AllArgsConstructor
@RequestMapping("/animals")
public class AnimalController {
    private AnimalService animalService;
    @GetMapping()
    public String RedList(Model model){
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }
    @PostMapping()
    public String addAnimal(Animal animal, Model model){
        animalService.addAnimal(animal);
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }
}
