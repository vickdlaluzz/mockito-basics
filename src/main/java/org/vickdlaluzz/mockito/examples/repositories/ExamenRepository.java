package org.vickdlaluzz.mockito.examples.repositories;

import org.vickdlaluzz.mockito.examples.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
