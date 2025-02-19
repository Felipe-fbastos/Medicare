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
    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCUIDADOR")
    private int id;

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @ManyToOne
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






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}