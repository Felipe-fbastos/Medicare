package br.com.grupohefesto.Medicare.controller;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.service.UtilizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/utilizador")
@RestController
public class UtilizadorController
{
    @Autowired
    private UtilizadorService service;

    @GetMapping
    public List<Utilizador> listar()
    {
        return service.listar();
    }

    @GetMapping("/{id")
    public Utilizador buscarPorId(@PathVariable("id") int id)
    {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Utilizador cadastrar(@RequestBody Utilizador utilizador)
    {
        return service.cadastrar(utilizador);
    }

    @PutMapping("/{id}")
    public Utilizador alterar (@RequestBody Utilizador utilizador,
                               @PathVariable ("id") int id)
    {
        if (id == utilizador.getId())
            return service.alterar(utilizador);
        else return null;
    }

    @DeleteMapping("/{id}")
    public void excluir (@PathVariable ("id") int id)
    {
        service.excluir(id);
    }


}
