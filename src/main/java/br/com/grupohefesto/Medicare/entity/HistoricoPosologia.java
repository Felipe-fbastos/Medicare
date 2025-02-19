package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "HISORICO_POSOLOGIA")
public class HistoricoPosologia {

        //idPosologia e idRemedio concatenados

        @Column(name = "SDPOSOLOGIA")
        private int saldoRemedio;
}
