package br.com.grupohefesto.Medicare.exceptions;

import br.com.grupohefesto.Medicare.entity.RelCuidadorUtilizadorID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdFoundException extends RuntimeException{

    public IdFoundException(String campo, int valor) {
        super(campo + " Utilizador não encontrado " + valor);
    }

    public IdFoundException(int valor, String message) {
        super(message + valor);
    }

    public IdFoundException(String message) {
        super(message);
    }



}
