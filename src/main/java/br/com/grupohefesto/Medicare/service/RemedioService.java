package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Remedio;
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
  public List<Remedio> listar() {
    return repository.findAll();
  }

  //Buscar por Id
  public Remedio buscarPorId(int id) {
    var existe = repository.findById(id);
    if (existe.isPresent())
      return existe.get();
    return null;
  }

  //Cadastrar Remedio
  public Remedio cadastrar(Remedio remedio) {

    var existeRemedio = repository.findById(remedio.getId());
    if (existeRemedio != null)  {
      System.out.println("Remédio já cadastrado"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
      return null;
    } else
      if (remedio.getVldRemedio().isBefore(LocalDateTime.now())) {
        System.out.println("Remédio está vencido");  //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
        return null;
      }
      else if (remedio.getVldRemedio() == LocalDateTime.now()) {
        System.out.println("Remédio prestes à vencer"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
        return null;
      }
      else if (remedio.getQtdRemedio() == 0)
      {
        System.out.println("Quantidade de medicamento não pode ser 0"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
        return null;
      }
      else if(remedio.getNome().length() < 3)
      {
        System.out.println("Nome inválido"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
        return null;
      }
      return repository.save(remedio);
  }

  //Alterar remedio
  public Remedio alterar(Remedio remedio) {
    var existe = buscarPorId(remedio.getId());
    if (existe != null)
      return repository.save(remedio);
    else {
      System.out.println("Remedio não encontrado"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
      return null;
    }
  }

  //Deletar Remedio
  public void excluir(int id)
  {
    var existe = buscarPorId(id);
    if(existe != null)
      repository.deleteById(id);
  }



























}
