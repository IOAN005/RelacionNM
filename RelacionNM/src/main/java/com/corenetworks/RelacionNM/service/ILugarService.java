package com.corenetworks.RelacionNM.service;

import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.modelo.Lugar;

import java.util.List;

public interface ILugarService {
    Lugar insert (Lugar l);
    Lugar modificar(Lugar l);
    void eliminar (int idLugar);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int idLugar);
}
