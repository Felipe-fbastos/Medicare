package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Alarme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmeRepository extends JpaRepository<Alarme, Long> {
}
