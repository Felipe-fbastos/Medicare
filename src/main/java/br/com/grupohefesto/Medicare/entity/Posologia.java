package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "POSOLOGIA")
public class Posologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPOSOLOGIA")
    private int id;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @JoinColumn(name = "IDREMEDIO")
    private Remedio idRemedio;

    @ManyToOne
    @JoinColumn(name = "UTILIZADOR")
    private Utilizador idUtilizador;

    @OneToMany(mappedBy = "IDPOSOLOGIA")
    private List<Alarme> alarmes;

    @Column(name = "DIPOSOLOGIA")
    private LocalDateTime dtInicio;

    @Column(name = "DFPOSOLOGIA")
    private LocalDateTime dtFim;

    @Column(name = "INPOSOLOGIA")
    private int intervaloPosologia;

    @Column(name = "QTDPOSOLOGIA")
    private int qtdRemedioPosologia;
}
