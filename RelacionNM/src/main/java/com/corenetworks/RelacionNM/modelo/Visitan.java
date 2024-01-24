package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visitas")
public class Visitan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;




    @ManyToOne
    @JoinColumn(name="matricula",nullable = false,foreignKey = @ForeignKey(name="FK_visitas_autobuses"))
    private Autobus autobus;

    @ManyToOne
    @JoinColumn(name = "dni",nullable = false,foreignKey = @ForeignKey(name = "FK_visitas_conductores"))
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "id_Lugar",nullable = false,foreignKey = @ForeignKey(name = "FK_visitas_lugares"))
    private Lugar lugar;

    private LocalDate fVisita;

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setfVisita(LocalDate fVisita) {
        this.fVisita = fVisita;
    }

    @Override
    public String toString() {
        return "Visitan{" +
                "idVisita=" + idVisita +
                ", fVisita=" + fVisita +
                '}';
    }

    public Visitan(int idVisita, LocalDate fVisita) {
        this.idVisita = idVisita;
        this.fVisita = fVisita;
    }
}
