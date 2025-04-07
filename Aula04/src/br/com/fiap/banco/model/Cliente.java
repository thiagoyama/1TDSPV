package br.com.fiap.banco.model;

public class Cliente {

    private String username;
    private String senha;

    //Criar os getters e setters
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean logar(String login, String senha){
        return login.equals(username) && senha.equals(this.senha);
    }

}
