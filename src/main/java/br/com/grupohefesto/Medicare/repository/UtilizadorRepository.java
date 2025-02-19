package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilizadorRepository extends JpaRepository<Utilizador,Integer>
{
    List<Utilizador> findByTipoUtilizador (String tipoUtilizador);
}