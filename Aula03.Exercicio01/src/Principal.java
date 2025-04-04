import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Instanciar o aluno (transformar a classe em um objeto)
        Aluno aluno = new Aluno();

        //Ler os dados do aluno
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        aluno.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o RM");
        aluno.rm = leitor.next();

        System.out.println("Digite a nota da CP1");
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP2");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da CP3");
        aluno.cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge");
        aluno.challenge = leitor.nextDouble();

        System.out.println("Digite a nota da GS");
        aluno.gs = leitor.nextDouble();

        //Chamar os métodos
        double mediaCheckpoint = aluno.calcularMediaCp();
        double mediaSemestre = aluno.calcularMediaSemestral();

        //Exibir a média do aluno
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média CP: " + mediaCheckpoint + " Média Semestral: " + mediaSemestre);

        System.out.printf("Média Aluno: %.2f", mediaCheckpoint); //Formata com duas casas decimais
        System.out.printf("Média Aluno: %.2f", mediaSemestre);
    }
}
