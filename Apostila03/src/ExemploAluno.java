public class ExemploAluno {

    public static void main(String[] args) {
        //Criar um objeto do tipo aluno
        Aluno estudante = new Aluno();

        //Atribuir valores para todos os atributos do alunos
        estudante.id = 123;
        estudante.matriculado = true;
        estudante.idade = 18;
        estudante.nome = "Matheus";
        estudante.nomeCurso = "ADS";
        estudante.turma = 'V';
        estudante.valorMensalidade = 300;

        //Exibir os valores dos atributos do objeto aluno
        System.out.println("Id: " + estudante.id);
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Curso: " + estudante.nomeCurso + ", Turma: 1TDSP" + estudante.turma);
        System.out.println("Matriculado: " + estudante.matriculado);
        System.out.println("Mensalidade: " + estudante.valorMensalidade);

        //Criar um outro objeto aluno, atribuir valores para 2 propriedades e exibir os valores
        Aluno maria = new Aluno();
        maria.nomeCurso = "Analise e Desenvolvimento de Sistemas";
        maria.idade = 20;
        System.out.println("--------------------------------");
        System.out.println("Nome do curso: " + maria.nomeCurso);
        System.out.println("Idade: "  + maria.idade);

    }
}

