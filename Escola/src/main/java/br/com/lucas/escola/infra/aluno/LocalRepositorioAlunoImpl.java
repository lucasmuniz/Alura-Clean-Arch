package br.com.lucas.escola.infra.aluno;

import br.com.lucas.escola.dominio.aluno.Aluno;
import br.com.lucas.escola.dominio.aluno.AlunoNaoEncontradoException;
import br.com.lucas.escola.dominio.aluno.CPF;
import br.com.lucas.escola.dominio.aluno.IRepositoioAluno;

import java.util.ArrayList;
import java.util.List;

public class LocalRepositorioAlunoImpl implements IRepositoioAluno {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
