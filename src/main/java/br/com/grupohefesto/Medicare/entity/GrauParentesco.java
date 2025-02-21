package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "GRAUPARENTESCO")
public class GrauParentesco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTGRAUPARENTESCO")
    private int id;

    @Column(name = "DSGRAUPARENTESCO")
    private int descricao;

    @OneToMany(mappedBy = "parentesco")
    private List<Responsavel> Reponsavel;


}
