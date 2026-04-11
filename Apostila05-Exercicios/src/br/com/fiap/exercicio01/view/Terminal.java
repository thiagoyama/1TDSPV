package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Carro;
import br.com.fiap.exercicio01.model.Cor;

public class Terminal {

    public static void main(String[] args) {
        //Criar o objeto Cor
        Cor branco = new Cor();
        //Definir os valores dos atributos da Cor
        branco.alterarCor(255, 255, 255, "Branco");

        //Criar o objeto Carro
        Carro celta = new Carro();

        //Definir os valores dos atributos do carro
        celta.setAnoFabricacao(2005);
        celta.setComprimento(4.5);
        celta.setNome("Celta");
        celta.setMotor(1);
        celta.setQuantidadeLugares(5);
        celta.setPlaca("ABC-1234");
        celta.setQuantidadePortas(2);
        celta.setCor(branco);

        //Exibir os dados do carro (e da cor)
        System.out.println("Carro: " + celta.getNome());
        System.out.println("Ano: " + celta.getAnoFabricacao());
        System.out.println("Placa: " + celta.getPlaca());
        System.out.println("Comprimento: " + celta.getComprimento() + ", Portas " + celta.getQuantidadePortas());
        System.out.println("Motor: " + celta.getMotor() + ", Lugares: " + celta.getQuantidadeLugares());
        System.out.println("Cor: " + celta.getCor().getNome());
    }
}
