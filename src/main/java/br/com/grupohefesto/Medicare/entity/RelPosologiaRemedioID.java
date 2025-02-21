package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class RelPosologiaRemedioID implements Serializable {
    private Integer poslogiaId;  // Responsável
    private Integer remedioId;   // Paciente


    //Equals & HashCode
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
