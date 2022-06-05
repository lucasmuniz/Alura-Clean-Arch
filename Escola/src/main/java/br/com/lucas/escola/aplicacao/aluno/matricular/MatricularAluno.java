package br.com.lucas.escola.aplicacao.aluno.matricular;

import br.com.lucas.escola.dominio.aluno.Aluno;
import br.com.lucas.escola.dominio.aluno.IRepositoioAluno;

public class MatricularAluno {

    private final IRepositoioAluno repositoioAluno;

    public MatricularAluno(IRepositoioAluno repositoioAluno) {
        this.repositoioAluno = repositoioAluno;
    }

    public void matricular(MatricularAlunoDTO dados) {
        Aluno aluno = dados.criarAluno();
        repositoioAluno.matricular(aluno);
    }
}
