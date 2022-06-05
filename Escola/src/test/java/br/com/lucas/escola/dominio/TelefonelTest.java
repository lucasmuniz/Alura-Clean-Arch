package br.com.lucas.escola.dominio;

import br.com.lucas.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefonelTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

}
