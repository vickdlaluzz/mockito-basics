package org.vickdlaluzz.mockito.examples.services;

import org.vickdlaluzz.mockito.examples.models.Examen;

public interface ExamenService {
    Examen findExamenByName(String name);
}
