package br.com.lucas.escola;

import br.com.lucas.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.lucas.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.lucas.escola.dominio.aluno.CPF;
import br.com.lucas.escola.dominio.aluno.Email;
import br.com.lucas.escola.infra.aluno.LocalRepositorioAlunoImpl;

public class Aplicacao {

    public static void main(String[] args) {
        String nome = "Fulano";
        CPF cpf = new CPF("123.456.789-00");
        Email email = new Email("fulano@gmail.com");

        MatricularAluno matricularAluno = new MatricularAluno(new LocalRepositorioAlunoImpl());
        matricularAluno.matricular(new MatricularAlunoDTO(nome, cpf.getNumero(), email.getEndereco()));
    }
}
