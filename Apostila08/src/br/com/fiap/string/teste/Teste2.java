package br.com.fiap.string.teste;

public class Teste2 {

    public static void main(String[] args) {
        String email = "profthiagoy@fiap.com.br";
        String confirmarEmail = new String("churros@fiap.com.br");

        //Validar se os e-mails são iguais:
        //O equals verifica o valor da String e não o endereço de memória
        if (email.equalsIgnoreCase(confirmarEmail)){
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println(email);
        System.out.println(confirmarEmail);

        //Exibir a quantidade de caracteres do e-mail:
        int qtd = email.length();
        System.out.println("Email possui: " + qtd + " caracteres");

        //Exibir a posição do @ do e-mail
        int posicao = email.indexOf("@");
        System.out.println("Posição do @ é: " + posicao);

        //Exibir o e-mail (sem o dominio, sem o @xxxxxxx)
        System.out.println(email.substring(0, email.indexOf("@")));
        //Exibir o dominio do e-mail
        System.out.println(email.substring(email.indexOf("@")));
    }
}
