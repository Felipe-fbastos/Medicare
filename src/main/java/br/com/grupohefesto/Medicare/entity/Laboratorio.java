package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
