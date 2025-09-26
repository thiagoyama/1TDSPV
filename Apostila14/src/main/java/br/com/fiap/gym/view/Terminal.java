package br.com.fiap.gym.view;

import br.com.fiap.gym.dao.ClienteDao;
import br.com.fiap.gym.exception.EntidadeNaoEncontradaException;
import br.com.fiap.gym.model.Cliente;
import java.util.List;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Ler os dados do cliente
        Scanner leitor = new Scanner(System.in);
        try {
            //Criar o ClienteDao
            ClienteDao dao = new ClienteDao();
            int opcao;
            do {
                System.out.println("Escolha: \n1-Cadastrar \n2-Atualizar \n3-Pesquisar por Id \n4-Listar \n5-Remover \n0-Sair");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        Cliente cliente = lerCliente(leitor);
                        dao.cadastrar(cliente);
                        System.out.println("Cliente cadastrado com sucesso!");
                        break;
                    case 2:
                        try {
                            cliente = lerCliente(leitor);
                            dao.atualizar(cliente);
                            System.out.println("Cliente atualizado com sucesso!");
                        } catch (EntidadeNaoEncontradaException e){
                            System.out.println("Cliente não encontrado para atualizar");
                        }
                        break;
                    case 3:
                        System.out.println("Digite o codigo do cliente");
                        int codigo = leitor.nextInt();
                        try {
                            cliente = dao.buscar(codigo);
                            System.out.println(cliente);
                        } catch (EntidadeNaoEncontradaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        List<Cliente> clientes = dao.listar();
                        for (Cliente c : clientes){
                            System.out.println(c);
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Digite o codigo do cliente que será removido");
                            codigo = leitor.nextInt();
                            dao.remover(codigo);
                            System.out.println("Cliente removido!");
                        } catch (EntidadeNaoEncontradaException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Finalizando o sistema");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } while (opcao != 0);

        } catch (Exception e){
            e.printStackTrace();
        }

    }//main

    private static Cliente lerCliente(Scanner leitor) {
        System.out.println("Digite o código do cliente:");
        int codigo = leitor.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = leitor.next() + leitor.nextLine();

        System.out.println("Digite o telefone do cliente:");
        String telefone = leitor.next() + leitor.nextLine();

        System.out.println("Digite o peso do cliente:");
        double peso = leitor.nextDouble();

        System.out.println("O cliente está ativo? (true/false)");
        boolean ativo = leitor.nextBoolean();

        //Criar o Cliente com os dados (criar o construtor no cliente)
        Cliente cliente = new Cliente(codigo, nome, telefone, cpf, ativo, peso );
        return cliente;
    }
}//class
