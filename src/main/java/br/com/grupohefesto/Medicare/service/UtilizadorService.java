package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.exceptions.EmailJaCadastrado;
import br.com.grupohefesto.Medicare.exceptions.IdFoundException;
import br.com.grupohefesto.Medicare.repository.TiposUtilizadorRepository;
import br.com.grupohefesto.Medicare.repository.UtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizadorService
{
    @Autowired
    private UtilizadorRepository repository;

    @Autowired
    private TiposUtilizadorRepository repositoryTipoUtilizador;

    //Listar Utilizadores
    public List<Utilizador> listar()
    {
        return repository.findAll();
    }

    //Buscar por Id
    public Utilizador getId(int id)
    {
        Utilizador utilizador = new Utilizador();

       return repository.findById(id).
               orElseThrow(() -> new IdFoundException("ID", utilizador.getId()));

    }

    //Cadastra utilizador
    public ResponseEntity<Utilizador> singUp (Utilizador utilizador)
    {
        repository.existsEmail(utilizador.getEmail())
                .orElseThrow(() -> new EmailJaCadastrado("E-mail já cadastrado"));

        Utilizador utilizadorsalvo = repository.save(utilizador);
        return ResponseEntity.status(201).body(utilizadorsalvo);
    }

    //Alterar utilizador
    public Utilizador update(Utilizador utilizador,int id)
    {
        Utilizador utilizadorExistente = repository.findById(utilizador.getId())
                .orElseThrow(() -> new IdFoundException("ID", utilizador.getId()));



        if (utilizador.getNome() != null && !utilizador.getNome().isEmpty()) {
            utilizadorExistente.setNome(utilizador.getNome());
        }

        if (utilizador.getSobrenome() != null && !utilizador.getSobrenome().isEmpty()) {
            utilizadorExistente.setSobrenome(utilizador.getSobrenome());
        }

        if (repository.existsEmail(utilizador.getEmail()).isPresent()) {
            return repository.existsEmail(utilizador.getEmail())
                    .orElseThrow(() -> new EmailJaCadastrado("Email já cadastrado"));
        }
        else if(utilizador.getEmail() != null &&
                !utilizador.getEmail().isEmpty()) {
            utilizadorExistente.setEmail(utilizador.getEmail());
        }

        if (utilizador.getTelefone() != null && !utilizador.getTelefone().isEmpty()) {
            utilizadorExistente.setTelefone(utilizador.getTelefone());
        }

        return repository.save(utilizadorExistente);

    }





}