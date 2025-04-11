import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Instanciar 1 aluno
        Aluno aluno = new Aluno();

        //Ler os dados do aluno e atribuir nos atributos do objeto
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome");
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

        System.out.println("Digite da Global Solution");
        aluno.gs = leitor.nextDouble();

        //Realizar o calculo da média
        double mediaCp = aluno.calcularMediaCp();;
        double mediaFinal = aluno.calcularMediaSemestre();

        //Exibir o nome e as médias do aluno
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média CP: " + mediaCp + " Média Semestre: " + mediaFinal);

        System.out.printf("Média CP formatado: %.2f", mediaCp);
        System.out.printf("\nMédia Semestre com duas casas decimais: %.2f", mediaFinal);
    }
}
