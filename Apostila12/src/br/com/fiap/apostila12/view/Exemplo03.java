package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.exception.SenhaInvalidaException;
import br.com.fiap.apostila12.model.Login;

import java.util.Scanner;

public class Exemplo03 {

    static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Pedir o usuário e senha
        System.out.println("Digite o usuário");
        String usuario = leitor.next();

        System.out.println("Digite a senha");
        String senha = leitor.next();

        try {
            //Criar o Login com o usuário e senha
            Login login = new Login(usuario, senha);
            //Exibir uma mensagem de sucesso com o nome do usuário
            System.out.println("Usuário registrado! " + login.getUsuario());
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        } finally {
            leitor.close();
        }
    }
}
