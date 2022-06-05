package br.com.lucas.escola.aplicacao.aluno.matricular;

import br.com.lucas.escola.dominio.aluno.Aluno;
import br.com.lucas.escola.dominio.aluno.CPF;
import br.com.lucas.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }


    public Aluno criarAluno() {
        return new Aluno(
                new CPF(this.cpfAluno),
                this.nomeAluno,
                new Email(this.emailAluno));
    }
}
