package br.com.lucas.escola.infra.aluno;

import br.com.lucas.escola.dominio.aluno.CifradorSenha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorSenhaMD5 implements CifradorSenha {

    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(senha.getBytes(), 0, senha.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
        return senhaCifrada.equals(cifrarSenha(senhaAberta));
    }
}
