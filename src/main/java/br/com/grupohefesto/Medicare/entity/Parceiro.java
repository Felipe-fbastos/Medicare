package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "PARCEIROS")
public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPARCEIRO")
    private int id;

    @Column(name = "NMPARCEIRO")
    private String nome;

    @Column(name = "APPARCEIRO")
    private String apelido;

    @Column(name = "CNPJPARCEIRO")
    private String cnpj;

    @OneToMany(mappedBy = "parceiro")
    private List<ParceirosUtilizadores> parceirosUtilizadores;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
