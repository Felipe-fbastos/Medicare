package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PARCEIROS_UTILIZADORES")
public class ParceirosUtilizadores {

    //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
    @Id
    @Column(name = "IDPARCEIRO")
    private int id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "IDPARCEIRO")
    private Parceiro parceiro;

    @ManyToOne
    @JoinColumn(name = "IDCOLABORADOR")
    private int colaborador;

}
