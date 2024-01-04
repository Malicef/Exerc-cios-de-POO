package Contador.Lampada;

import Contador.Contador;

public class Lampada {
    /*atributos */
   private boolean estadoDaLampada;
   private int vezesAcessas;
   private Contador contador;

   /*construtor */
   public Lampada(){
    estadoDaLampada = false;
    vezesAcessas = 0;
    contador = new Contador();
   }

   /*métodos acende, apaga e mostraEstado */

   public void acende(){
    estadoDaLampada = true;
    vezesAcessas ++;
    contador.incrementa();
   }

   public void apaga(){
    estadoDaLampada = false;
   }

   public void mostraEstado(){
    if (estadoDaLampada) {
        System.out.printf("LIGADA");
    } else {
        System.out.printf("APAGADA");
    }
   }

   public boolean estaLigada(){
    return estadoDaLampada;
    
    }
   public int getvezesAcessas(){
    return vezesAcessas;
   } 
}
