package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RESPONSAVEL")
public class Responsavel {
    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUTILIZADOR")
    private int idUtilizador;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDRESPONSAVEL")
    private int idResponsavel;

    @ManyToOne
    @JoinColumn(name = "IDGRAUPARENTESCO")
    private GrauParentesco idParentesco;

    @Column(name = "DCRESPONSAVEL")
    private LocalDateTime dtCadastro;

    @Column(name = "DURESPONSAVEL")
    private LocalDateTime dtUltimaAtualizacao;

    @Column(name = "STRESPONSAVEL")
    private String status;

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public GrauParentesco getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(GrauParentesco idParentesco) {
        this.idParentesco = idParentesco;
    }

    public LocalDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(LocalDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public LocalDateTime getDtUltimaAtualizacao() {
        return dtUltimaAtualizacao;
    }

    public void setDtUltimaAtualizacao(LocalDateTime dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
