//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa leandro = new Pessoa();
        leandro.nome = "Leandro";
        leandro.cpf = "123.123.123-21";
        leandro.idade = 18;
        leandro.altura = 1.70;

        Pessoa churros = new Pessoa();
        churros.nome = "Daniel";
        churros.cpf = "123.985.789-88";
        churros.idade = 79;
        churros.altura = 1.9;

        System.out.println(leandro);
        System.out.println(churros);

        System.out.println(leandro.nome);
        System.out.println(leandro.altura);
        System.out.println(churros.nome);

    }
}