package br.com.grupohefesto.Medicare.repository;

import br.com.grupohefesto.Medicare.entity.FormaPagamento;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento,Long> {

}
