package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelCuidadorUtilizadorID implements Serializable {

    private Integer cuidadorId;  // Responsável
    private Integer pacienteCuidadorId;   // Paciente

    // Getters, Setters, Equals & HashCode

    public Integer setCuidadorId() {
        return cuidadorId;
    }

    public void getCuidadorId(Integer cuidadorId) {
        this.cuidadorId = cuidadorId;
    }

    public Integer getpacienteCuidadorId() {
        return pacienteCuidadorId;
    }

    public void setpacienteCuidadorId(Integer pacienteCuidadorId) {
        this.pacienteCuidadorId = pacienteCuidadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelCuidadorUtilizadorID that = (RelCuidadorUtilizadorID) o;
        return cuidadorId.equals(that.cuidadorId) && pacienteCuidadorId.equals(that.pacienteCuidadorId);
    }

    @Override
    public int hashCode() {
        return 31 * cuidadorId.hashCode() + pacienteCuidadorId.hashCode();
    }
}
