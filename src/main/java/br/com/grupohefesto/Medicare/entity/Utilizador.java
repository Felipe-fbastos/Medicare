package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "UTILIZADOR")
public class Utilizador
{
    @Id
    @Column(name = "IDUTILIZADOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDTIPOUTILIZADOR")
    private TipoUtilizador tipoUtilizador;

    @OneToMany(mappedBy = "IDUTILIZADOR")
    private List<Posologia> posologias;


    @Column(name = "NMUTILIZADOR")
    private String nome;

    @Column(name = "SBUTILIZADOR")
    private String sobrenome;

    @Column(name = "CPF")
    private String CPF;

    @Column(name = "EMUTILIZADOR")
    private String email;

    @Column(name = "TELUTILIZADOR")
    private String telefone;

    @OneToMany(mappedBy = "IDCOLABORADOR")
    private List<Promocao> promocoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getNomeUtilizador() {
        return nome;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nome = nomeUtilizador;
    }

    public String getCNPJ_CPF() {
        return CPF;
    }

    public void setCNPJ_CPF(String CNPJ_CPF) {
        this.CPF = CNPJ_CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
