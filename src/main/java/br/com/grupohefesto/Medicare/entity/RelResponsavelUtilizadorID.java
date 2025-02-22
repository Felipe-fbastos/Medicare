package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelResponsavelUtilizadorID implements Serializable {

    private Integer responsavelId;  // Responsável
    private Integer pacienteId;   // Paciente

    // Getters, Setters, Equals & HashCode

    public Integer getUtilizadorId() {
        return responsavelId;
    }

    public void setUtilizadorId(Integer responsavelId) {
        this.responsavelId = responsavelId;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelResponsavelUtilizadorID that = (RelResponsavelUtilizadorID) o;
        return responsavelId.equals(that.responsavelId) && pacienteId.equals(that.pacienteId);
    }

    @Override
    public int hashCode() {
        return 31 * responsavelId.hashCode() + pacienteId.hashCode();
    }
}
