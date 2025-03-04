package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabelax
    @ManyToOne
    @MapsId("cuidadorId")
    @JoinColumn(name = "CUIDADORID")
    private Utilizador cuidador;

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

    public RelCuidadorUtilizadorID getId() {
        return id;
    }

    public void setId(RelCuidadorUtilizadorID id) {
        this.id = id;
    }

    public Utilizador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Utilizador cuidador) {
        this.cuidador = cuidador;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public LocalDate getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(LocalDate dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public LocalDate getDtUltimaAtualizacao() {
        return dtUltimaAtualizacao;
    }

    public void setDtUltimaAtualizacao(LocalDate dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }

    public LocalDate getStatus() {
        return status;
    }

    public void setStatus(LocalDate status) {
        this.status = status;
    }
}