package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RESPONSAVEL")
public class Responsavel {

    @EmbeddedId
    private RelResponsavelUtilizadorID id;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela

    @ManyToOne
    @MapsId("pacienteId")
    @Column(name = "IDUTILIZADOR")
    private int utilizador;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @ManyToOne
    @MapsId("responsavelId")
    @Column(name = "IDRESPONSAVEL")
    private int responsavel;

    @ManyToOne
    @JoinColumn(name = "IDGRAUPARENTESCO")
    private GrauParentesco parentesco;

    @Column(name = "DCRESPONSAVEL")
    private LocalDateTime dtCadastro;

    @Column(name = "DURESPONSAVEL")
    private LocalDateTime dtUltimaAtualizacao;

    @Column(name = "STRESPONSAVEL")
    private String status;

}
