package org.vickdlaluzz.mockito.examples.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.vickdlaluzz.mockito.examples.models.Examen;
import org.vickdlaluzz.mockito.examples.repositories.ExamenRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    @DisplayName("Testing find an examen by name")
    void findExamenByName() {
        List<Examen> data = Arrays.asList(
                new Examen(5L, "Matematicas"),
                new Examen(12L, "Espanol"),
                new Examen(212L, "Ciencias Naturales"),
                new Examen(434L, "Geografia")
        );
        ExamenRepository repository = mock(ExamenRepository.class);
        when(repository.findAll()).thenReturn(data);
        ExamenService service = new ExamenServiceImpl(repository);
        Optional<Examen> examen = service.findExamenByName("Matematicas");
        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matematicas", examen.orElseThrow().getName());
    }

    @Test
    @DisplayName("Testing find an examen by name with empty list")
    void findExamenByNameWithEmptyList() {
        List<Examen> data = Collections.emptyList();
        ExamenRepository repository = mock(ExamenRepository.class);
        when(repository.findAll()).thenReturn(data);
        ExamenService service = new ExamenServiceImpl(repository);
        Optional<Examen> examen = service.findExamenByName("Matematicas");
        assertFalse(examen.isPresent());
    }
}