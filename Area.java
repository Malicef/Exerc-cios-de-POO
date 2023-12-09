/*1. Escreva um programa que calcule a área de um quadrado. 
O valor do lado de um quadrado deverá ser informado pelo usuário. */

package Lista;
import java.util.Scanner; // importando o Scanner para ler 

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //permite que aplicativos leiam bytes de informações digitadas pelo usuário
        int valor, r; // declaração de variaveis 

        System.out.println("Digite o valor do lado do quadrado: ");
        valor = input.nextInt(); //lendo um inteiro

        r = valor * 2; // calculando a area 

        System.out.printf("O valor da area do quadrado é: %d ", r);
        input.close(); 
    }
}
