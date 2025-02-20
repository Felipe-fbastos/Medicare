package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "REMEDIOS")
public class Remedio
{
    @Id
    @Column(name = "IDREMEDIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDLABORATORIO")
    private Laboratorio laboratorio;

    @Column(name="NMREMEDIO")
    private String nome; //Nome mínimo de 3 caracteres

    @Column(name="NTREMEDIO")
    private String anotação; //Anotação de um Remédio: Para dor, gripe, etc.

    @ManyToOne
    @JoinColumn(name = "IDGRANDEZA")
    private TipoOrdemGrandeza tipoOrdemGrandeza;

    @Column(name="DOSAGEM")
    private int dosagem;

    //Criar tabela
    @Column(name="NMLABOLATORIO")
    private String nmlaboratorio;

    @Column(name = "DTREGISTROREMEDIO")
    private LocalDateTime dtRegistroRemedio;

    @Column(name = "QTDALERTA")
    private int quantidadeAlerta;

    @OneToMany(mappedBy = "remedio")
    private List<Alarme> alarmes;

    @OneToMany(mappedBy = "remedio")
    private List<Promocao> promocoes;

    @OneToMany(mappedBy = "remedio")
    private List<Posologia> posologias;

    @OneToMany(mappedBy = "remedio")
    private List<HistoricoPosologia> historicoPosologias;

}
