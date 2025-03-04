package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "POSOLOGIA")
public class Posologia {

    //É o IdPosologia, não s esqueça
    @EmbeddedId
    private RelPosologiaRemedioID id;

    // Relacionamento com Remedio usando a chave composta
    @ManyToOne
    @MapsId("remedioId")  // Mapeia o campo 'remedioId' da chave composta
    @JoinColumns({
            @JoinColumn(name = "IDPOSOLOGIA", referencedColumnName = "IDPOSOLOGIA", insertable = false, updatable = false),
            @JoinColumn(name = "IDREMEDIO", referencedColumnName = "IDREMEDIO", insertable = false, updatable = false)
    })
    private Remedio remedio;

    @ManyToOne
    @JoinColumn(name = "UTILIZADOR")
    private Utilizador utilizador;

    @OneToMany(mappedBy = "posologia")
    private List<Alarme> alarmes;

    @OneToMany(mappedBy = "posologia")
    private List<HistoricoPosologia> historicoPosologias;

    @Column(name = "DIPOSOLOGIA")
    private LocalDateTime dtInicio;

    @Column(name = "DFPOSOLOGIA")
    private LocalDateTime dtFim;

    @Column(name = "INPOSOLOGIA")
    private int intervaloPosologia;

    @Column(name = "QTDPOSOLOGIA")
    private int qtdRemedioPosologia;
}
