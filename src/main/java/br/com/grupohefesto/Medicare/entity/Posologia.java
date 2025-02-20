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

    @ManyToOne
    @MapsId("remedioId")
    @JoinColumn(name = "IDREMEDIO")
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
