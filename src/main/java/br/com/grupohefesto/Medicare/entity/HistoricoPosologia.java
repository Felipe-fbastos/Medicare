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
        @JoinColumn(name = "IDPOSLOGIA", referencedColumnName = "IDPOSOLOGIA", insertable = false, updatable = false)  // Ordem correta
        private Posologia posologia;

        @ManyToOne
        @MapsId("remedioId")
        @JoinColumn(name = "IDREMEDIO", referencedColumnName = "IDREMEDIO", insertable = false, updatable = false)  // Ordem correta
        private Remedio remedio;


        @Column(name = "SDPOSOLOGIA")
        private int saldoRemedio;
}
