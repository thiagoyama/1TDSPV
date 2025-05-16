package br.com.fiap.esporte.view;

import br.com.fiap.esporte.model.Endereco;
import br.com.fiap.esporte.model.Pessoa;
import br.com.fiap.esporte.model.PessoaFisica;
import br.com.fiap.esporte.model.PessoaJuridica;

public class Teste {

    public static void main(String[] args) {
        //Instanciar uma Pessoa Fisica
        //Atribuir valores aos atributos (fixo)
        PessoaFisica pf = new PessoaFisica("Matheus", "12132231321321");

        pf.setEmail("matheus@fiap.com.br");
        pf.setIdade(18);
        pf.setAposentado(false);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Av Paulista");
        endereco.setNumero("1100");
        pf.setEndereco(endereco);

        //Exibir os valores do objeto
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
        System.out.println(pf.getEmail());
        System.out.println(pf.getIdade());
        System.out.println(pf.isAposentado());
        System.out.println(pf.getEndereco().getLogradouro() + ", " + pf.getEndereco().getNumero());
    }
}
