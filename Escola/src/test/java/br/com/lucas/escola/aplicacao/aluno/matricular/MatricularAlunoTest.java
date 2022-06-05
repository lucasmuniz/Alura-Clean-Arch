package br.com.lucas.escola.aplicacao.aluno.matricular;

import br.com.lucas.escola.dominio.aluno.Aluno;
import br.com.lucas.escola.dominio.aluno.CPF;
import br.com.lucas.escola.dominio.aluno.IRepositoioAluno;
import br.com.lucas.escola.infra.aluno.LocalRepositorioAlunoImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito
        IRepositoioAluno repositorio = new LocalRepositorioAlunoImpl();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");
        useCase.matricular(dados);

        Aluno encontrado = repositorio.buscarPorCPF(
                new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }

}
