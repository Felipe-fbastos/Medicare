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
    private Posologia posologia;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio remedio;

    @Column(name = "DTHORAALARME")
    private LocalDateTime dtHoraALarme;

    @Column(name = "STALARME")
    private String status;


}
