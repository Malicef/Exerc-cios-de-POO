package Lista;
/*Escreva um programa que recebe um valor inteiro representando um intervalo 
em minutos e imprime o equivalente a esse período expresso em 
valores inteiros para dias, horas e minutos. 
Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

import java.util.Scanner;

public class ValorInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valor, d, h, m;

        System.out.println("Digite um intervalo em minutos: ");
        valor = input.nextInt();

        m = valor; 
        d = m / 1440;
        h = (m % 1440) / 60;
        
        System.out.printf("%d dias, %d horas e %d minutos.", valor, d, h, m % 60);
        
        input.close();

    
    }
}
