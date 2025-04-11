import br.com.fiap.banco.model.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciar um cliente
        Cliente cliente = new Cliente();

        Scanner leitor = new Scanner(System.in);

        //Colocar um nome e senha para o cliente
        System.out.println("Digite o username");
        cliente.setUsername(leitor.next());

        System.out.println("Digite a senha");
        cliente.setSenha(leitor.next());

        System.out.println("Username: " + cliente.getUsername());
        System.out.println("Senha: " + cliente.getSenha());

        //Chamar o método para logar
        System.out.println("Digite o usuário para logar");
        String usuario = leitor.next();
        System.out.println("Digite a senha para logar");
        String senha = leitor.next();
        boolean churros = cliente.logar(usuario, senha );
        System.out.println("Logou?: " + churros);

    }
}