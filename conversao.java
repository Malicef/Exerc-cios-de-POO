package Lista;

import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperatura, conversao;

        System.out.println("Digite a temperatura em graus Celsius: ");
        temperatura = input.nextDouble();

        /*Celsius → Fahrenheit
    Multiplicamos a temperatura em ºC por 1,8 e somamos 32 ao resultado. */

        conversao = 1.8 * temperatura + 32;

        System.out.printf("O resultado dessa conversão é: %f", conversao);

        input.close();
    }
}
