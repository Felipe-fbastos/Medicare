package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

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

    @NotEmpty(message = "Promocao não pode estar vazia")
    @Column(name = "DSPROMOCAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio remedio;

    @Column(name = "DTINICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DTFIM")
    private LocalDateTime dataFim;

    @Size(message = "O valor da promoção não pode ser zero")
    @Column(name = "VLRPROMOCAO")
    private double valor;



}
