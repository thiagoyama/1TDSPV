import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o Scanner para ler os dados
        Scanner leitor = new Scanner(System.in);

        //Ler o nome, preco, codigo e disponivel
        System.out.println("Digite o nome do produto");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o código do produto");
        int codigo = leitor.nextInt();

        System.out.println("Digite o preço do produto");
        float preco = leitor.nextFloat();

        System.out.println("Está disponível? true/false");
        boolean disponivel = leitor.nextBoolean();

        //Ler os dados do fornecedor

        //Criar um objeto Produto
        Produto produto = new Produto();

        //Colocar os dados no objeto
        produto.codigo = codigo;
        produto.nome = nome;
        produto.preco = preco;
        produto.disponivel = disponivel;

        //Exibir os dados do objeto
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Código do produto: " + produto.codigo);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Disponível? " + produto.disponivel);

    }
}
