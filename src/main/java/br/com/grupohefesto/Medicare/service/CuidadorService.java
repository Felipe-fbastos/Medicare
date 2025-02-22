/*
package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Cuidador;
import br.com.grupohefesto.Medicare.repository.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {
    @Autowired
    private CuidadorRepository repository;

    public List<Cuidador> listar(){
        return repository.findAll();
    }

    public Cuidador buscarPorId(int id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    public Cuidador cadastrar(Cuidador cuidador){
        return repository.save(cuidador);
    }

    public Cuidador alterar(Cuidador cuidador) {

        var existe = buscarPorId(cuidador.getId());
        if (existe != null){
            System.out.println("Cuidador alterado.");
            return repository.save(cuidador);
        }
        else {
            System.out.println("Cuidador não encontrado.");
            return null;
        }
    }

    public void excluir(int id){
        var existe = buscarPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }
}
*/