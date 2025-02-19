package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.repository.UtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizadorService
{
    @Autowired
    private UtilizadorRepository repository;

    //Listar Utilizadores
    public List<Utilizador> listar()
    {
        return repository.findAll();
    }

    //Buscar por Tipo de Utilizador
    public List<Utilizador> listarPorTipo(String tipo)
    {
        var existe = repository.findByTipoUtilizador(tipo);
        if(existe == null)
        {
            System.out.println("Utilizador não encontrado"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
            return null;
        }
            else
                return existe;
    }

    //Buscar por Id
    public Utilizador buscarPorId(int id)
    {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    //Cadastra utilizador
    public Utilizador cadastrar (Utilizador utilizador)
    {
       var tamanhoNome =  utilizador.getNomeUtilizador().length();
       if(tamanhoNome<2)
       {
           System.out.println("Nome não pode ter menos de 2 caracteres"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
           return null;
       }
       else if (utilizador.getTipoUtilizador() == null)
       {
           System.out.println("Impossível registrar usuário sem tipo.");
           return null;
       }
       else
       return repository.save(utilizador);
    }



    //Alterar utilizador
    public Utilizador alterar(Utilizador utilizador)
    {
        var existe = buscarPorId(utilizador.getId());
        if ( existe != null)
            return repository.save(utilizador);
        else
        {
            System.out.println("Usuário não encontrado"); //Posteriormente, alterar os SOUTs por exceções, para poderem ser exibidar na tela.
            return null;
        }
    }

    //Deletar um Utilizador
    public void excluir(int id)
    {
        var existe = buscarPorId(id);
        if (existe != null)
            repository.deleteById(id);
    }




}