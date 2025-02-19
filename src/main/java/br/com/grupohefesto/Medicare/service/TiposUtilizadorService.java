package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.TipoUtilizador;
import br.com.grupohefesto.Medicare.repository.TiposUtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposUtilizadorService
{
    @Autowired
    private TiposUtilizadorRepository repository;


    public List<TipoUtilizador> listar(){
        return repository.findAll();
    }

    public TipoUtilizador buscarPorId(int id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;}
}