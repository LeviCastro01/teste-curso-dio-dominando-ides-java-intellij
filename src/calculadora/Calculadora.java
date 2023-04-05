package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a= scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b= scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multiplicar= multiplicar (a,b);
        double divisao= divisao (a,b);


        System.out.println("soma: " + soma);
        System.out.println("Subtração:  " + subtracao);
        System.out.println("divisao: " + divisao);
        System.out.println("Multiplicação: "+ multiplicar);
    }

        public static int soma(int a, int b){
        return a + b;
    }        public static int subtracao(int a, int b){
        return a - b;
    }        public static double divisao(double a, double b){
        return a / b;
    }        public static int multiplicar(int a, int b){
        return a * b;
    }
}
