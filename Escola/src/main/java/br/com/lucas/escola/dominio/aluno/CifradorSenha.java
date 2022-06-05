package br.com.lucas.escola.dominio.aluno;

public interface CifradorSenha {

    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta);


}
