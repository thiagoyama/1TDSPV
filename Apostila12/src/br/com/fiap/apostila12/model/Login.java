package br.com.fiap.apostila12.model;

import br.com.fiap.apostila12.exception.SenhaInvalidaException;

public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha){
        this.usuario = usuario;
        setSenha(senha); //chama o setSenha para utilizar a validação
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        //Validar a senha com pelo menos 8 caracteres
        if (senha == null || senha.length() < 8)
            throw new SenhaInvalidaException("Senha inválida");
        this.senha = senha;
    }
}
