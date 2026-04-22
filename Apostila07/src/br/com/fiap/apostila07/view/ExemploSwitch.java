package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitch {

    public static void main(String[] args) {
        //Ler dois numeros
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
        //Ler a operação (somar, dividir, subtrair e multiplicar)
        String op = JOptionPane.showInputDialog("Operação? (+,-,/,*)");

        //Realizar a operação e exibir o resultado
        switch (op) {
            case "+" :
                JOptionPane.showMessageDialog(null, n1 + n2);
                break;
            case "-":
                JOptionPane.showMessageDialog(null, n1 - n2);
                break;
            case "/":
                //Não permitir a divisão por zero
                if (n2 == 0)
                    JOptionPane.showMessageDialog(null,"Não é possível dividir por zero");
                else
                    JOptionPane.showMessageDialog(null, n1 / n2);
                break;
            case "*":
                JOptionPane.showMessageDialog(null, n1 * n2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }//main
}//class
