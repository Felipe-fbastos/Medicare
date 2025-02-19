package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "PARCEIROS")
public class Parceiros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NMPARCEIRO")
    private String nome;

    @Column(name = "APPARCEIRO")
    private String apelido;

    @Column(name = "CNPJPARCEIRO")
    private String cnpj;

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
