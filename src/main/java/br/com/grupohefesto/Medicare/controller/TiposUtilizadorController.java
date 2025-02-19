package br.com.grupohefesto.Medicare.controller;

import br.com.grupohefesto.Medicare.entity.TipoUtilizador;
import br.com.grupohefesto.Medicare.service.TiposUtilizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("tiposutilizador")
public class TiposUtilizadorController
{
    @Autowired
    private TiposUtilizadorService service;

    @GetMapping
    public List<TipoUtilizador> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public TipoUtilizador buscarPorId(@PathVariable("id") int id){
        return service.buscarPorId(id);
    }
}
