package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length = 7,nullable = false)
    private String matricula;
    @Column(nullable = false)
    private int aFabricacion;
    @OneToMany(mappedBy = "autobus",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
     private List<Visitan> visitas;

    public Autobus(String matricula, int aFabricacion) {
        this.matricula = matricula;
        this.aFabricacion = aFabricacion;
    }
}
