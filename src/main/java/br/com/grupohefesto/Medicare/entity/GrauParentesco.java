package br.com.grupohefesto.Medicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "GRAUPARENTESCO")
public class GrauParentesco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTGRAUPARENTESCO")
    private int id;

    @Column(name = "DSGRAUPARENTESCO")
    private int descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "parentesco")
    private List<Responsavel> Reponsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
}
