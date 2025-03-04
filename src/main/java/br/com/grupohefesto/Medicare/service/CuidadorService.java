
package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Cuidador;
import br.com.grupohefesto.Medicare.entity.RelCuidadorUtilizadorID;
import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.exceptions.IdFoundException;
import br.com.grupohefesto.Medicare.repository.CuidadorRepository;
import br.com.grupohefesto.Medicare.repository.UtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CuidadorService {
    @Autowired
    private CuidadorRepository repository;

    @Autowired
    private UtilizadorRepository repositoryUtilizador;

    public List<Cuidador> listar(){
        return repository.findAll();
    }

    public Cuidador getAssociation(Integer pacienteId, Integer cuidadorId){
        RelCuidadorUtilizadorID id = new RelCuidadorUtilizadorID(cuidadorId,pacienteId);

        return (Cuidador) repository.findById(id).orElseThrow(() -> new IdFoundException("Relação não encontrada"));
    }

    public Cuidador associationCuidadorUtilizador(int pacienteId, int cuidadorId, LocalDate dtInicio, LocalDate dtFim){
        Utilizador paciente = repositoryUtilizador.findById(pacienteId)
                .orElseThrow(() -> new IdFoundException("ID do paciente não encotrado",pacienteId ));

        Utilizador cuidador = repositoryUtilizador.findById(cuidadorId)
                .orElseThrow(() -> new IdFoundException("ID do Cuidador não encontrado", cuidadorId));

        RelCuidadorUtilizadorID idRelacao = new RelCuidadorUtilizadorID(cuidadorId,pacienteId);

        // Criação do objeto Cuidador (entidade de relacionamento)
        Cuidador cuidadorRelacao = new Cuidador();
        cuidadorRelacao.setId(idRelacao);  // Atribui a chave composta
        cuidadorRelacao.setCuidador(cuidador);  // Define o cuidador
        cuidadorRelacao.setUtilizador(paciente);  // Define o paciente
        cuidadorRelacao.setDtInicio(dtInicio);  // Define a data de início do relacionamento
        cuidadorRelacao.setDtFim(dtFim);  // Define a data de fim (caso tenha)
        cuidadorRelacao.setDtCadastro(LocalDate.now());  // Define a data de cadastro
        cuidadorRelacao.setStatus(LocalDate.now());  // Define o status (você pode ajustar conforme necessário)

        // Salva a relação no banco de dados
        return repository.save(cuidadorRelacao);

    }
//
//    public Cuidador alterar(Cuidador cuidador) {
//
//        var existe = buscarPorId(cuidador.getId());
//        if (existe != null){
//            System.out.println("Cuidador alterado.");
//            return repository.save(cuidador);
//        }
//        else {
//            System.out.println("Cuidador não encontrado.");
//            return null;
//        }
//    }
//
//    public void excluir(int id){
//        var existe = buscarPorId(id);
//        if(existe != null)
//            repository.deleteById(id);
//    }
}
