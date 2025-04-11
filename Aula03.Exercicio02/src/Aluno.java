public class Aluno {

    //Atributos
    String nome;
    String rm;
    double cp1;
    double cp2;
    double cp3;
    double challenge;
    double gs;

    //Métodos
    double calcularMediaCp(){
        return (cp1 + cp2 + cp3) / 3;
    }

    double calcularMediaSemestre(){
        return calcularMediaCp() * 0.2 + challenge * 0.2 + gs * 0.6;
    }

}
