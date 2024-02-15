package ru.gb.SpringHome4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.SpringHome4.domain.Animal;
import ru.gb.SpringHome4.repository.AnimalRepository;

import java.util.List;

@Service

public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    public void addAnimal(Animal animal){
        animalRepository.save(animal);
    }
}
