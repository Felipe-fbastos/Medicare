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
    @JoinColumn(name = "IDPOSOLOGIA")
    private Posologia idPosologia;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio idRemedio;

    @Column(name = "DTHORAALARME")
    private LocalDateTime dtHoraALarme;

    @Column(name = "STALARME")
    private String status;


}
