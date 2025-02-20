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

    @ManyToOne
    @JoinColumn(name = "IDFORMADEPAGAMENTO")
    private int formaPagamento;

    @ManyToOne
    @JoinColumn(name = "IDCOLABORADOR")
    private Utilizador colaborador;

    @Column(name = "DSPROMOCAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio remedio;

    @Column(name = "DTINICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DTFIM")
    private LocalDateTime dataFim;

    @Column(name = "VLRPROMOCAO")
    private double valor;



}
