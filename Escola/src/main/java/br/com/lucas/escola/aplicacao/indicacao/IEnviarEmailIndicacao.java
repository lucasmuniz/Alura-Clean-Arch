package br.com.lucas.escola.aplicacao.indicacao;

import br.com.lucas.escola.dominio.aluno.Aluno;

public interface IEnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
