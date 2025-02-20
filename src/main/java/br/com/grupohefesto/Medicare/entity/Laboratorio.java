package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LABORATORIOS")
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDLABORATORIO")
    private int id;

    @Column(name = "NMLABORATORIO")
    private String nome;

    @OneToMany(mappedBy = "laboratorio")
    private List<Remedio> remedio;
}
