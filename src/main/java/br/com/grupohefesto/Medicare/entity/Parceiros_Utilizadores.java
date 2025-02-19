package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PARCEIROS_UTILIZADORES")
public class Parceiros_Utilizadores {

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPARCEIRO")
    private int id;

    @Column(name = "IDCOLABORADOR")
    private int idColaborador;

}
