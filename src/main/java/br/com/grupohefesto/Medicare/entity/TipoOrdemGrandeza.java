package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
