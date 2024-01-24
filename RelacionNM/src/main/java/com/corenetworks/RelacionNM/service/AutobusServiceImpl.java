package com.corenetworks.RelacionNM.service;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.repository.IAutobusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusServiceImpl implements IAutobusService{
    @Autowired
    private IAutobusRepo repoAutobus;
    @Override
    public Autobus insert(Autobus a) {
        return repoAutobus.save(a);
    }

    @Override
    public Autobus modificar(Autobus a) {
        return repoAutobus.save(a);
    }

    @Override
    public void eliminar(String matricula) {
        repoAutobus.deleteById(matricula);

    }

    @Override
    public List<Autobus> obtenerTodos() {
        return repoAutobus.findAll();
    }

    @Override
    public Autobus obtenerUno(String matricula) {
        return repoAutobus.findById(matricula).orElse(new Autobus());
    }
}
