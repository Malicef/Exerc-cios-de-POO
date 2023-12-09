/*1
2. Escreva um programa que calcule a soma e a média aritmética de 3 números. 
Os 3 valores reais serão informados pelo usuário */

package Lista;
import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, media, soma;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = input.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = input.nextInt();

        soma = n1 + n2 + n3;

        media = (n1 + n2 + n3) / 3;

        System.out.printf(" A soma da suas notas é %d, e a sua media é %d ", soma, media);

        input.close();
    }
}
