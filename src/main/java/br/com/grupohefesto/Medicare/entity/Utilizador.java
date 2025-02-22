package br.com.grupohefesto.Medicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.beans.XMLEncoder;
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


    @NotNull
    @ManyToOne
    @JoinColumn(name = "IDTIPOUTILIZADOR")
    private TipoUtilizador tipoUtilizador;


    @OneToMany(mappedBy = "utilizador")
    private List<Posologia> posologias;

    @NotEmpty(message = "O nome não pode estar vazio")
    @NotNull
    @Size(min = 3, max = 20, message = "Quantidade de Caracteres inválida")
    @Column(name = "NMUTILIZADOR")
    private String nome;

    @NotEmpty(message = "O sobrenome não pode estar vazio")
    @NotNull
    @Size(min = 3, max = 20, message = "Quantidade de Caracteres inválida")
    @Column(name = "SBUTILIZADOR")
    private String sobrenome;

    @NotEmpty(message = "O CPF não pode estar vazio")
    @NotNull
    @Size(min = 11,max = 11, message = "CPF inválido")
    @Column(name = "CPF")
    private String CPF;

    @NotEmpty(message = "O Email não pode estar vazio")
    @Email(message = "Email inválido")
    @NotNull
    @Column(name = "EMUTILIZADOR")
    private String email;

    @Column(name = "TELUTILIZADOR")
    private String telefone;

    @JsonIgnore
    @OneToMany(mappedBy = "colaborador")
    private List<Promocao> promocoes;

    @JsonIgnore
    @OneToMany(mappedBy = "colaborador")
    private List<ParceirosUtilizadores> colaborador;

    //Se der errp foi aqui

    @JsonIgnore
    @OneToMany(mappedBy = "cuidador")
    private List<Cuidador> cuidador;

    @JsonIgnore
    @OneToMany(mappedBy = "responsavel")
    private List<Responsavel> responsavel;

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
