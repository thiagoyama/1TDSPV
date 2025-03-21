public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //Declarar variáveis para armazenar a nota da cp, challenge e gs
        double cp = 10;
        double challenge = 6;
        double gs = 7;

        //Calcular a média (Global 60%, CP 20%, Challenge 20%)
        double media = gs * 0.6 + cp * 0.2 + challenge * 0.2;

        //Exibir a média
        System.out.println(media);

        //Incremento
        int x = 10;
        x++; //x = x + 1;
        System.out.println(x); //imprime 11
        x--;
        System.out.println(x); //imprime 10

        x += 2; // x = x + 2;
        System.out.println(x); //imprime 12
        x -= 4;
        System.out.println(x); //imprime 8
        x *= 2;
        System.out.println(x); //imprime 16
        x /= 3;
        System.out.println(x); //imprime 5
        x %= 2;
        System.out.println(x); //imprime 1

    }
}
