package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "consultas2_analiticas_2")
public class ConsultaAnaliticaPK implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name="id_consulta",nullable = false,foreignKey = @ForeignKey(name="FK_consulta2_analitica_consulta2"))
    private Consulta2 consulta;
    @ManyToOne
    @JoinColumn(name = "id_analitica",nullable = false,foreignKey = @ForeignKey(name = "FK_consulta2_analitica2_analitica2"))
    private Analitica2 analitica;
}
