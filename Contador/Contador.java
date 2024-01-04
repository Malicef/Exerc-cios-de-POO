package Contador;

public class Contador {
   private int conta;

   public Contador(){
    conta = 0;
   }
   /* metodos */

    public void zerar(){
        conta = 0;
    }

    public int incrementa(){
        return conta = conta + 1;
    }

    public void imprime(){
        System.out.printf("O valor do contador é: %2d\n", conta);
    }
}

