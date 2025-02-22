package br.com.grupohefesto.Medicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "LABORATORIOS")
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDLABORATORIO")
    private int id;

    @Size(min = 3, max = 20, message = "Nome inválido")
    @Column(name = "NMLABORATORIO")
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "laboratorio")
    private List<Remedio> remedio;
}
