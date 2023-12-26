package Fatura;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura fat = new Fatura();

        fat.numeroDeIndentificacao = 123;
        fat.quantidadeComprada = 2;
        fat.precoUnitario = 234.56;
        double resultadoF = fat.calculaTotal();

        System.out.printf("Numero de indetificacao: %d\n", fat.numeroDeIndentificacao);
        System.out.printf("Quantidade comprada: %d\n", fat.quantidadeComprada);
        System.out.printf(" O preco total é: %2f\n", resultadoF);
    }
}
