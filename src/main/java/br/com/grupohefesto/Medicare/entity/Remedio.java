package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private Laboratorio idLaboratorio;

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

    @OneToMany(mappedBy = "IDREMEDIO")
    private List<Alarme> alarmes;

    @OneToMany(mappedBy = "IDREMEDIO")
    private List<Promocao> promocoes;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnotação() {
        return anotação;
    }

    public void setAnotação(String anotação) {
        this.anotação = anotação;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    public String getNmlaboratorio() {
        return nmlaboratorio;
    }

    public void setNmlaboratorio(String nmlaboratorio) {
        this.nmlaboratorio = nmlaboratorio;
    }

    public LocalDateTime getDtRegistroRemedio() {
        return dtRegistroRemedio;
    }

    public void setDtRegistroRemedio(LocalDateTime dtRegistroRemedio) {
        this.dtRegistroRemedio = dtRegistroRemedio;
    }

    public int getQuantidadeAlerta() {
        return quantidadeAlerta;
    }

    public void setQuantidadeAlerta(int quantidadeAlerta) {
        this.quantidadeAlerta = quantidadeAlerta;
    }

    public Laboratorio getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Laboratorio idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
}
