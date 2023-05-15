package org.vickdlaluzz.mockito.examples.services;

import org.vickdlaluzz.mockito.examples.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenByName(String name);
}
