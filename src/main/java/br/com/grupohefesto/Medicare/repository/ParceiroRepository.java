package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {
}
