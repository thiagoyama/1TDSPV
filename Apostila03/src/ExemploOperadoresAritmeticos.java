public class ExemploOperadoresAritmeticos {

    public static void main(String[] args) {
        //Declarar uma variavel do tipo int e atribuir um valor
        int x = 12;
        int y = 32;

        x++; //Aumentou o x em 1 unidade, é a mesma coisa que x = x + 1;
        System.out.println("X é " + x); //13

        x--; //Decrementou o x em 1 unidade, é a mesma coisa que x = x - 1;
        System.out.println("X agora é " + x); //12

        x += 2; //x = x + 2; (Aumentar o x em 2 unidades)
        System.out.println("X é " + x); //14
        x -= 10; //x = x-10;
        System.out.println("X é " + x); //4
        x *= 3; // x = x * 3;
        System.out.println("X é " + x); //12
        x /= 2; // x = x / 2;
        System.out.println("X é " + x); //6
        x %= 4; // x = x % 4;
        System.out.println("X é " + x); //2
        y *= x; // y = y * x;
        System.out.println("Y é " + y); //64
    }//main
}//class
