package Contador.Lampada;

import java.util.Scanner;
public class testLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        Scanner input = new Scanner(System.in);
        String situacao = "";

        System.out.println("A lâmpada está " + (lamp.estaLigada() ? "LIGADA" : "APAGADA"));
        lamp.apaga();
        System.out.println("Deseja acender a lampada? digite 'SIM', caso queira apagar, digite 'NAO'");
        situacao = input.nextLine();
        if ( situacao.equals("SIM")) {
            lamp.acende();
            System.out.println("A lampada está acessa");
        } else if (situacao.equals("NAO")){
            lamp.apaga();
            System.out.println("A lampada esta apagada");
        } else {
            System.out.println("Opçao INVALIDA");
        }
        System.out.println("A lâmpada foi acessa " + (lamp.getvezesAcessas() + " vezes" ));

         input.close();

        /*sem interação com o usuario */
        /*System.out.println("A lâmpada está " + (lamp.estaLigada() ? "LIGADA" : "APAGADA"));
        lamp.acende();
        System.out.println("A lâmpada está " + (lamp.estaLigada() ? "LIGADA" : "APAGADA"));
        lamp.apaga();
        System.out.println("A lâmpada está " + (lamp.estaLigada() ? "LIGADA" : "APAGADA"));
        System.out.println("A lâmpada foi acessa " + (lamp.getvezesAcessas() + " vezes" ));*/  

    }
}
