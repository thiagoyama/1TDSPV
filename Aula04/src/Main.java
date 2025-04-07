import br.com.fiap.banco.model.Cliente;

public class Main {
    public static void main(String[] args) {
        //Instanciar um cliente
        Cliente cliente = new Cliente();

        //Colocar um nome e senha para o cliente
        cliente.setUsername("roberto");
        cliente.setSenha("123");

        System.out.println("Username: " + cliente.getUsername());
        System.out.println("Senha: " + cliente.getSenha());

        //Chamar o método para logar
        boolean churros = cliente.logar("roberto", "1253");
        System.out.println("Logou?: " + churros);

    }
}