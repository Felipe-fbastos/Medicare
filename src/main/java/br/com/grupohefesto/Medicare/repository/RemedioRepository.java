package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Integer>
{

}
