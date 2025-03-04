
package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Remedio;
import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.exceptions.IdFoundException;
import br.com.grupohefesto.Medicare.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RemedioService {
  @Autowired
  private RemedioRepository repository;

  //Listar remedios
  public List<Remedio> getAll() {
    return repository.findAll();
  }

  //Buscar por Id
  public Remedio getId(int id) {

    return repository.findById(id)
            .orElseThrow(() -> new IdFoundException("Remedio não cadastrado", id));

  }

  //Cadastrar Remedio
  public Remedio singUp(Remedio remedio) {

      return repository.save(remedio);
  }

  //Alterar remedio
  public Remedio update(int id, String novoNome, int novaDosagem, String novaAnotacao, int novaQuantidadeAlerta) {


      Remedio remedioExistente = repository.findById(id)
              .orElseThrow(() -> new IdFoundException("Remédio não cadastrado", id));

      if (novoNome != null && !novoNome.isEmpty()) {
          // Atualiza o nome do remédio
          remedioExistente.setNome(novoNome);
      }

      if (novaDosagem > 0) {
          // Atualiza a dosagem do remédio
          remedioExistente.setDosagem(novaDosagem);
      }

      if (novaAnotacao != null && !novaAnotacao.isEmpty()) {
          // Atualiza a anotação do remédio
          remedioExistente.setAnotacao(novaAnotacao);
      }

      if (novaQuantidadeAlerta > 0) {
          // Atualiza a quantidade de alerta do remédio
          remedioExistente.setQuantidadeAlerta(novaQuantidadeAlerta);
      }


      return repository.save(remedioExistente);



  }

  //Deletar Remedio
  public void excluir(int id)
  {
    repository.findById(id).orElseThrow(() -> new IdFoundException("ID", id));

    repository.deleteById(id);
  }


}
