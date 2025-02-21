package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class RelResponsavelUtilizadorID implements Serializable {

    private Integer responsavelId;  // Responsável
    private Integer pacienteId;   // Paciente

    //Equals & HashCode

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
