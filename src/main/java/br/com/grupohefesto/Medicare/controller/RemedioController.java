/*
package br.com.grupohefesto.Medicare.controller;

import br.com.grupohefesto.Medicare.entity.Remedio;
import br.com.grupohefesto.Medicare.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/remedio")
@RestController
public class RemedioController
{
    @Autowired
    private RemedioService service;

    @GetMapping
    public List<Remedio> listar()
    {
        return service.listar();
    }

    @GetMapping("/{id")
    public Remedio buscarPorId(@PathVariable("id") int id)
    {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Remedio cadastrar(@RequestBody Remedio remedio)
    {
        return service.cadastrar(remedio);
    }

    @PutMapping("/{id}")
    public Remedio alterar (@RequestBody Remedio remedio,
                            @PathVariable ("id") int id)
    {
        if (id == remedio.getId())
            return service.alterar(remedio);
        else return null;
    }

    @DeleteMapping("/{id}")
    public void excluir (@PathVariable ("id") int id)
    {
        service.excluir(id);
    }

}
*/