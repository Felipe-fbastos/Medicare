package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
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



}
