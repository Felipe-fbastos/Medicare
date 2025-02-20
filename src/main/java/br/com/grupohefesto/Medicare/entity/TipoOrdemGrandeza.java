package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TIPO_ORDEMGRANDEZA")
public class TipoOrdemGrandeza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDGRANDEZA")
    private int id;

    @Column(name = "DSGRANDEZA")
    private String descricao;

    @OneToMany(mappedBy = "tipoOrdemGrandeza")
    private List<Remedio> remedio;

}
