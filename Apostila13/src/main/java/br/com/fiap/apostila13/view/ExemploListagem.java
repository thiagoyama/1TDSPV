package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;
import java.util.List;

public class ExemploListagem {

    static void main(String[] args) {

        try {
            //Recuperar todos os carros do banco
            CarroDao carroDao = new CarroDao();
            List<Carro> lista = carroDao.listar();
            //Exibir os dados dos carros (laço de repetição)
            for (Carro carro : lista)
                System.out.println(carro);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
