package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Posologia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosologiaRepository extends JpaRepository<Posologia, Long> {
}
