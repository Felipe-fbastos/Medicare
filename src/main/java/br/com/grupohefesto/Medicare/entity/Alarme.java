package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ALARMES")
public class Alarme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDALARME")
    private int id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "IDPOSLOGIA", referencedColumnName = "IDPOSOLOGIA", insertable = false, updatable = false),
            @JoinColumn(name = "IDREMEDIO", referencedColumnName = "IDREMEDIO", insertable = false, updatable = false)
    })
    private Posologia posologia;

    @Column(name = "DTHORAALARME")
    private LocalDateTime dtHoraALarme;

    @Column(name = "STALARME")
    private String status;
}

