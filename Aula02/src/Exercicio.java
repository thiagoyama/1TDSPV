import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        //Criar o objeto para ler os dados do usuário
        Scanner leitor = new Scanner(System.in);

        //Ler as notas dos 3 cps
        System.out.println("Digite a nota da cp1");
        float cp1 = leitor.nextFloat();

        System.out.println("Digite a nota da cp2");
        float cp2 = leitor.nextFloat();

        System.out.println("Digite a nota da cp3");
        float cp3 = leitor.nextFloat();

        //Ler a nota do challenge
        System.out.println("Digite a nota do challenge");
        float challenge = leitor.nextFloat();

        //Ler a nota da global solution
        System.out.println("Digite a nota da GS");
        float gs = leitor.nextFloat();

        //Ler o nome do aluno
        System.out.println("Digite o nome do aluno");
        String nome = leitor.next() + leitor.nextLine(); //Para receber um texto mais de uma palavra

        //Calcular a média do semestre (média aritmética das cps) somar os 3 cps e dividir por 3
        double mediaCp = (cp1 + cp2 + cp3) / 3;
        double media = mediaCp * 0.2 + challenge * 0.2 + gs *0.6;

        //Exibir a média
        System.out.println("Aluno (a): " + nome);
        System.out.println("A média é " + media);

    }
}
