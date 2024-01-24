package com.corenetworks.RelacionNM.service;

import com.corenetworks.RelacionNM.modelo.Autobus;

import java.util.List;

public interface IAutobusService {
    Autobus insert (Autobus a);
    Autobus modificar(Autobus a);
    void eliminar (String matricula);
    List<Autobus>obtenerTodos();
    Autobus obtenerUno(String matricula);
}
