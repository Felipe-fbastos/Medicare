package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelPosologiaRemedioID implements Serializable {

    @Column(name = "IDPOSLOGIA")
    private Integer poslogiaId;

    @Column(name = "IDREMEDIO")
    private Integer remedioId;

    public RelPosologiaRemedioID(Integer poslogiaId, Integer remedioId) {
        this.poslogiaId = poslogiaId;
        this.remedioId = remedioId;
    }

    public RelPosologiaRemedioID() {
    }

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
