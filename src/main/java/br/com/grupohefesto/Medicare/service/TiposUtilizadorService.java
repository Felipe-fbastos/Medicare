package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.TipoUtilizador;
import br.com.grupohefesto.Medicare.exceptions.IdFoundException;
import br.com.grupohefesto.Medicare.repository.TiposUtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposUtilizadorService {
    @Autowired
    private TiposUtilizadorRepository repository;


    public List<TipoUtilizador> getAll() {
        return repository.findAll();
    }

    public TipoUtilizador getId(int id){
        return repository.findById(id)
                .orElseThrow(() -> new IdFoundException("Tipo inexistente", id));

    }

}