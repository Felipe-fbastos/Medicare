package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "PROMOCOES")
public class Promocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROMOCOES")
    private int id;

    private int idFormaPagamento;

    @ManyToOne
    @JoinColumn(name = "IDCOLABORADOR")
    private Utilizador idColaborador;

    @Column(name = "DSPROMOCAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio idRemedio;

    @Column(name = "DTINICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DTFIM")
    private LocalDateTime dataFim;

    @Column(name = "VLRPROMOCAO")
    private double valor;



}
