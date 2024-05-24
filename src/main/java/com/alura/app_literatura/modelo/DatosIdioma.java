package com.alura.app_literatura.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosIdioma(
        @JsonAlias("lenguajes") List<Idioma> idiomas
) {

}
