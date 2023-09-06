package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pilha;

public class ProgramPilha {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 172;
        Pilha p = new Pilha();
        int resto;

        while (numero != 0){
            resto = numero % 2;
            p.push(resto);
            numero = numero / 2;
        }

        while (!p.isEmpty()){
            resto = p.pop();
            System.out.print(resto);
        }
        System.out.println();
        System.out.println("----------------");


        sc.close();

    } 
} 