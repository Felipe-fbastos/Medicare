package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "UTILIZADORES_CUIDADOR")
public class Cuidador
{

    @EmbeddedId
    private RelCuidadorUtilizadorID id;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @ManyToOne
    @MapsId("cuidadorID")
    @JoinColumn(name = "CUIDADORID")
    private int cuidador;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela

    @ManyToOne
    @MapsId("pacienteCuidadorId")
    @JoinColumn(name = "IDUTILIZADOR")
    private Utilizador utilizador;

    @Column(name = "DTINICIO")
    private LocalDate dtInicio;

    @Column(name = "DTFIM")
    private LocalDate dtFim;

    @Column(name = "DCCUIDADOR")
    private LocalDate dtCadastro;

    @Column(name = "DUCUIDADOR")
    private LocalDate dtUltimaAtualizacao;

    @Column(name = "STCUIDADOR")
    private LocalDate status;


}