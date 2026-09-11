package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.MontadoraDao;
import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.model.Montadora;

import java.sql.SQLException;
import java.util.Scanner;

public class ExemploMontadora {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        try {
            MontadoraDao dao = new MontadoraDao();
            do {
                try {
                    System.out.println("Escolha uma opção: \n1-Cadastrar\n2-Pesquisar pod ID\n0-Sair");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome");
                            String nome = leitor.next() + leitor.nextLine();
                            System.out.println("Digite o cnpj");
                            String cnpj = leitor.next() + leitor.nextLine();
                            Montadora montadora = new Montadora(cnpj, nome);
                            dao.cadastrar(montadora);
                            System.out.println("Montadora cadastrada! " + montadora);
                            break;
                        case 2:
                            System.out.println("Digite o ID");
                            int id = leitor.nextInt();
                            montadora = dao.buscarPorId(id);
                            System.out.println(montadora);
                            break;
                        case 0:
                            System.out.println("Finalizando o sistema");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } while (opcao != 0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//main
}//class
