package ru.gb.SpringHome4.repository;

import org.springframework.stereotype.Repository;
import ru.gb.SpringHome4.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AnimalRepository {
    private Map<Long, Animal> animals = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong();

    public List<Animal> findAll(){
        return new ArrayList<>(animals.values());
    }
    public Animal save(Animal animal){
        if(animal.getId() == null){
            animal.setId(counter.incrementAndGet());
        }
        animals.put(animal.getId(), animal);
        return animal;
    }
}
