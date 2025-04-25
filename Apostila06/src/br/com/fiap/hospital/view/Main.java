package br.com.fiap.hospital.view;
import br.com.fiap.hospital.model.Medico;

public class Main {

    public static void main(String[] args) {
        //Instanciar um Médico
        Medico medico = new Medico("Drauzio", 123, "Geral", true);

        //Exibir os valores dos atributos do médico
        System.out.println("Nome: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Ativo: " + medico.isAtivo());
    }
}
