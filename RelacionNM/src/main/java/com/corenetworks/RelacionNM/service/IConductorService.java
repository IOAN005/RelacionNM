package com.corenetworks.RelacionNM.service;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Conductor;

import java.util.List;

public interface IConductorService {
    Conductor insert (Conductor c);
    Conductor modificar(Conductor c);
    void eliminar (String dni);
    List<Conductor> obtenerTodos();
    Conductor obtenerUno(String dni);
}
