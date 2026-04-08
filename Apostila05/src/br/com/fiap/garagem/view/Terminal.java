package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto carro
        Carro onix = new Carro();
        onix.setPlaca("ABC123");
        onix.setHoraEntrada("10:00");
        onix.setHoraSaida("11:00");
        onix.setSetor('A');
        onix.setPreferencial(false);
        onix.setNumeroVaga(123);
        onix.setValor(15);

        //Exibir os dados do carro
        System.out.println("Placa: " + onix.getPlaca());
        System.out.println("Entrada: " + onix.getHoraEntrada());
        System.out.println("Saída: " + onix.getHoraSaida());
        System.out.println("Setor: " + onix.getSetor() + " Vaga: " + onix.getNumeroVaga());
        System.out.println("Preferencial: " + onix.isPreferencial());
        System.out.println("Valor a Pagar: " + onix.getValor());


    }
}
