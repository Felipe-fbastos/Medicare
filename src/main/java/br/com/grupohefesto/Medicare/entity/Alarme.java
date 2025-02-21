package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
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
