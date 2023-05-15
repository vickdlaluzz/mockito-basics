package org.vickdlaluzz.mockito.examples.repositories;

import org.vickdlaluzz.mockito.examples.models.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{

    @Override
    public List<Examen> findAll() {
        return Arrays.asList(
                new Examen(5L, "Matematicas"),
                new Examen(12L, "Espanol"),
                new Examen(212L, "Ciencias Naturales"),
                new Examen(434L, "Geografia")
        );
    }
}
