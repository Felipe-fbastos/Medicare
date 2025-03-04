package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RelCuidadorUtilizadorID implements Serializable {

    private Integer cuidadorId;  // Responsável
    private Integer pacienteCuidadorId;   // Paciente

    // Construtor padrão (sem parâmetros) necessário para JPA
    public RelCuidadorUtilizadorID() {
    }

    // Construtor com parâmetros para facilitar a criação do ID
    public RelCuidadorUtilizadorID(Integer cuidadorId, Integer pacienteCuidadorId) {
        this.cuidadorId = cuidadorId;
        this.pacienteCuidadorId = pacienteCuidadorId;
    }

    // Getters e Setters
    public Integer getCuidadorId() {
        return cuidadorId;
    }

    public void setCuidadorId(Integer cuidadorId) {
        this.cuidadorId = cuidadorId;
    }

    public Integer getPacienteCuidadorId() {
        return pacienteCuidadorId;
    }

    public void setPacienteCuidadorId(Integer pacienteCuidadorId) {
        this.pacienteCuidadorId = pacienteCuidadorId;
    }

    // Métodos equals e hashCode para garantir a comparação correta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelCuidadorUtilizadorID that = (RelCuidadorUtilizadorID) o;
        return Objects.equals(cuidadorId, that.cuidadorId) &&
                Objects.equals(pacienteCuidadorId, that.pacienteCuidadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuidadorId, pacienteCuidadorId);
    }
}
