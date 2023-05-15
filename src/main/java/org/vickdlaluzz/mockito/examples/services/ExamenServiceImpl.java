package org.vickdlaluzz.mockito.examples.services;

import org.vickdlaluzz.mockito.examples.models.Examen;
import org.vickdlaluzz.mockito.examples.repositories.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService{

    private ExamenRepository examenRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenByName(String name) {
        Optional<Examen> result = examenRepository.findAll().stream()
                .filter((ex) -> ex.getName().contains(name))
                .findFirst();

        return result.isPresent()?result.orElseThrow():null;
    }
}
