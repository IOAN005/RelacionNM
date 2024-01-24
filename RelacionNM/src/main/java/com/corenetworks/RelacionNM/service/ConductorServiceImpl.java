package com.corenetworks.RelacionNM.service;

import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.repository.IConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConductorServiceImpl implements IConductorService{
    @Autowired
    private IConductorRepo repoConductor;
    @Override
    public Conductor insert(Conductor c) {
        return repoConductor.save(c);
    }

    @Override
    public Conductor modificar(Conductor c) {
        return repoConductor.save(c);
    }

    @Override
    public void eliminar(String dni) { repoConductor.deleteById(dni);

    }

    @Override
    public List<Conductor> obtenerTodos() {
        return repoConductor.findAll();
    }

    @Override
    public Conductor obtenerUno(String dni) {
        return repoConductor.findById(dni).orElse(new Conductor());
    }
}
