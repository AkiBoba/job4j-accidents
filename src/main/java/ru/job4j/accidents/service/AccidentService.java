package ru.job4j.accidents.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.Accident;
import ru.job4j.accidents.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AccidentService {
    private final AccidentRepository accidentsRepository;

    public void create(Accident accident) {
        accidentsRepository.save(accident);
    }

    public void delete(Accident accident) {
        accidentsRepository.delete(accident);
    }

    public List<Accident> getAll() {
        var result = new ArrayList<Accident>();
        for (var accident : accidentsRepository.findAll()) {
            result.add(accident);
        }
        return result;
    }

    public Accident getById(int id) {
        return accidentsRepository.findById(id).orElseGet(null);
    }
}