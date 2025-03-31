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
        System.out.println("Digite o nome do fornecedor");
        String nomeFornecedor = leitor.next() + leitor.nextLine();

        System.out.println("Digite o telefone do fornecedor");
        String telefone = leitor.next() + leitor.nextLine();

        System.out.println("Digite o cnpj do fornecedor");
        String cnpj = leitor.next() + leitor.nextLine();

        //Criar o objeto Fornecedor
        Fornecedor f1 = new Fornecedor();

        //Colocar os dados no objeto fornecedor
        f1.cnpj = cnpj;
        f1.nome = nomeFornecedor;
        f1.telefone = telefone;

        //Criar um objeto Produto
        Produto produto = new Produto();

        //Colocar os dados no objeto
        produto.codigo = codigo;
        produto.nome = nome;
        produto.preco = preco;
        produto.disponivel = disponivel;

        //Atributir o objeto fornecedor dentro do objeto produto
        produto.fornecedor = f1;

        //Exibir os dados do objeto produto
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Código do produto: " + produto.codigo);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Disponível? " + produto.disponivel);
        System.out.println("Nome do fornecedor: " + produto.fornecedor.nome);
        System.out.println("CNPJ Fornecedor: " + produto.fornecedor.cnpj);
        System.out.println("Telefone do fornecedor " + produto.fornecedor.telefone);

        //Pedir para o usuario a porcentagem de aumento
        System.out.println("Qual o valor em % do aumento?");
        float aumento = leitor.nextFloat();

        //Aumentar o preço do produto em 20
        produto.aumentarPreco(aumento);

        //Exibir o preço do produto
        System.out.println("Preço atualizado " + produto.preco);

        //Calcular o desconto do produto em 7%
        float churros = produto.calcularDesconto(8);

        //Exibir o valor do produto com o desconto
        System.out.println("Preço com desconto: " + churros);

    }
}
