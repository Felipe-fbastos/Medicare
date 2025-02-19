package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FORMAS_PAGAMENTO")
public class Forma_Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="IDFORMADEPAGAMENTO")
    private int id;

    @OneToMany(mappedBy = "IDFORMADEPAGAMENTO")
    private List<Promocao> promocoes;

    @Column(name = "DSFORMADEPAGAMENTO")
    private String descricao;

    @Column(name = "QTDPARCELAS")
    private int quantidade;

    @Column(name = "QTDMINIMAPARCELA")
    private int qtdMinParcelas;




}
