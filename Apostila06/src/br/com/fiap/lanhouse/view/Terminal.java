package br.com.fiap.lanhouse.view;

import br.com.fiap.lanhouse.model.Computador;

public class Terminal {

    public static void main(String[] args) {
        Computador pc = new Computador("Intel i7", 1,
                "RTX 5060",512, false,
                12);

        //Criar um novo objeto Computador
        Computador pichau = new Computador("I9", 2);

    }

}
