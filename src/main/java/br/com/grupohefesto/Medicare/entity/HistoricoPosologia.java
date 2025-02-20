package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HISORICO_POSOLOGIA")
public class HistoricoPosologia {

        //idPosologia e idRemedio concatenados
        @EmbeddedId
        private RelPosologiaRemedioID id;

        @ManyToOne
        @MapsId("poslogiaId")
        @JoinColumn(name = "IDPOSLOGIA")
        private Posologia posologia;

        @ManyToOne
        @MapsId("remedioId")
        @JoinColumn(name = "IDREMEDIO")
        private Remedio remedio;

        @Column(name = "SDPOSOLOGIA")
        private int saldoRemedio;
}
