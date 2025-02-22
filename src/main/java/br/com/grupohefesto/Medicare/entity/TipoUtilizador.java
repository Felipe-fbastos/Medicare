package br.com.grupohefesto.Medicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TIPO_UTILIZADOR")
public class TipoUtilizador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTIPOUTILIZADOR")
    private int id;

    @Column(name = "DSTIPOUTILIZADOR")
    private String descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoUtilizador")
    private List<Utilizador> Utilizadores;

}