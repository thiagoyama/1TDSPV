import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {
        //Objeto responsável por ler os dados inseridos através do teclado do usuário
        Scanner leitor = new Scanner(System.in);

        //Ler um número do tipo float e colocar na variável "nota"
        System.out.println("Digite uma nota");
        float nota = leitor.nextFloat();
        //Exibir a nota
        System.out.println("Sua nota é " + nota);
    }
}
