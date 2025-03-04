package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Cuidador;
import br.com.grupohefesto.Medicare.entity.RelCuidadorUtilizadorID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuidadorRepository extends JpaRepository<Cuidador, Integer> {
    Optional<Object> findById(RelCuidadorUtilizadorID id);
}
