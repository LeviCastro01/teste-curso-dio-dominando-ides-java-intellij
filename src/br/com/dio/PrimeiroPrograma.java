package br.com.dio;

import model.Gato;
import model.Livro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
/*        int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a+b));*/


        }
    }
