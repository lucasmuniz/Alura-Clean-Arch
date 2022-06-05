package br.com.lucas.escola.dominio.aluno;

import java.util.List;

public interface IRepositoioAluno {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();

}
