package com.alura.app_literatura.service;

public interface IConvierteDatos {
    //Definimos un metodo de tipo generico donde "T" significa que puede recibir cualquier dato
    //Osea no recibe una entidad especifica.
    //No está limitado a una entidad especifica.

    <T> T obtenerDatos(String json, Class<T> clase);
}
