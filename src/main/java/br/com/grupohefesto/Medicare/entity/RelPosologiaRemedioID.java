package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelPosologiaRemedioID implements Serializable {
    private Integer poslogiaId;  // Responsável
    private Integer remedioId;   // Paciente

    // Getters, Setters, Equals & HashCode

    public Integer getposlogiaId() {
        return poslogiaId;
    }

    public void setposlogiaId(Integer poslogiaId) {
        this.poslogiaId = poslogiaId;
    }

    public Integer getremedioId() {
        return remedioId;
    }

    public void setremedioId(Integer remedioId) {
        this.remedioId = remedioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelPosologiaRemedioID that = (RelPosologiaRemedioID) o;
        return poslogiaId.equals(that.poslogiaId) && remedioId.equals(that.remedioId);
    }

    @Override
    public int hashCode() {
        return 31 * poslogiaId.hashCode() + remedioId.hashCode();
    }
}
