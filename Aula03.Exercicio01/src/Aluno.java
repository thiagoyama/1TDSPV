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
    //retorno | nome do método | (lista de parâmetros)
    double calcularMediaCp(){
        //Média aritmética
        double mediaCp = (cp1 + cp2 + cp3) / 3;
        return mediaCp;
        //return (cp1 + cp2 + cp3) / 3;
    }

    double calcularMediaSemestral(){
        double churros = calcularMediaCp();
        double media =  churros * 0.2 + challenge * 0.2 + gs * 0.6;
        return media;
        //return calcularMediaCp() * 0.2 + challenge * 0.2 + gs * 0.6;
    }

}
