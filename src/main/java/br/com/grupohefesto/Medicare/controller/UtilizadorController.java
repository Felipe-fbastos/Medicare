package br.com.grupohefesto.Medicare.controller;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.exceptions.EmailJaCadastrado;
import br.com.grupohefesto.Medicare.exceptions.IdFoundException;
import br.com.grupohefesto.Medicare.service.UtilizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> buscarPorId(@PathVariable("id") int id)
    {
        try {
            return ResponseEntity.ok().body(service.getId(id));
        }
        catch (IdFoundException e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PostMapping("/sinUp")
    public ResponseEntity<?> singUp(@RequestBody Utilizador utilizador)
    {
        try{
            return ResponseEntity.ok().body(service.singUp(utilizador));
        } catch (EmailJaCadastrado e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody Utilizador utilizador,
                               @PathVariable ("id") int id)
    {
        try {
            return ResponseEntity.ok().body(service.update(utilizador,id));
        } catch (EmailJaCadastrado e) {
            return ResponseEntity.badRequest().body(e);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }




}
