package ru.job4j.accidents.service;

import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.AccidentType;
import ru.job4j.accidents.repository.TypeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class AccidenTypeService {
    private final TypeRepository typeRepository;

    public AccidenTypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<AccidentType> getAll() {
        var result = new ArrayList<AccidentType>();
        for (var type : typeRepository.findAll()) {
            result.add(type);
        }
        return result;
    }

    public Optional<AccidentType> getById(int typeId) {
        return typeRepository.findById(typeId);
    }
}
        