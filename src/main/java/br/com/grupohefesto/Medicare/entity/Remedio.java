package br.com.grupohefesto.Medicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
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
    private Laboratorio laboratorio;

    @Size(min = 3, max = 20, message = "Nome do medicamento inválido")
    @Column(name="NMREMEDIO")
    private String nome; //Nome mínimo de 3 caracteres

    @NotEmpty(message = "A anotação não pode estar vazia")
    @Column(name="NTREMEDIO")
    private String anotação; //Anotação de um Remédio: Para dor, gripe, etc.

    @ManyToOne
    @JoinColumn(name = "IDGRANDEZA")
    private TipoOrdemGrandeza tipoOrdemGrandeza;

    @NotEmpty
    @Column(name="DOSAGEM")
    private int dosagem;

    @NotEmpty
    @Column(name = "DTREGISTROREMEDIO")
    private LocalDateTime dtRegistroRemedio;

    @NotEmpty(message = "A quantidade de alerta não pode estar vazia")
    @Size(min = 1, message = "A quantidade não pode ser zero")
    @Column(name = "QTDALERTA")
    private int quantidadeAlerta;

    @JsonIgnore
    @OneToMany(mappedBy = "remedio")
    private List<Alarme> alarmes;

    @JsonIgnore
    @OneToMany(mappedBy = "remedio")
    private List<Promocao> promocoes;

    @JsonIgnore
    @OneToMany(mappedBy = "remedio")
    private List<Posologia> posologias;

    @JsonIgnore
    @OneToMany(mappedBy = "remedio")
    private List<HistoricoPosologia> historicoPosologias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
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

    public TipoOrdemGrandeza getTipoOrdemGrandeza() {
        return tipoOrdemGrandeza;
    }

    public void setTipoOrdemGrandeza(TipoOrdemGrandeza tipoOrdemGrandeza) {
        this.tipoOrdemGrandeza = tipoOrdemGrandeza;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
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

    public List<Alarme> getAlarmes() {
        return alarmes;
    }

    public void setAlarmes(List<Alarme> alarmes) {
        this.alarmes = alarmes;
    }

    public List<Promocao> getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(List<Promocao> promocoes) {
        this.promocoes = promocoes;
    }

    public List<Posologia> getPosologias() {
        return posologias;
    }

    public void setPosologias(List<Posologia> posologias) {
        this.posologias = posologias;
    }

    public List<HistoricoPosologia> getHistoricoPosologias() {
        return historicoPosologias;
    }

    public void setHistoricoPosologias(List<HistoricoPosologia> historicoPosologias) {
        this.historicoPosologias = historicoPosologias;
    }
}
