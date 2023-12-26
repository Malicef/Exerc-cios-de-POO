/* Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as se-
guintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada. */

package Fatura;

public class Fatura{
    int numeroDeIndentificacao;
    int quantidadeComprada;
    double precoUnitario;

    void quantidadeNaoPositiva(){
        if (quantidadeComprada <= 0 ) {
            quantidadeComprada = 0;
        }
    }

    void precoItem(){
        if (precoUnitario <= 0) {
            precoUnitario = 0.0;
        } 
    }

    double calculaTotal(){
        return quantidadeComprada * precoUnitario;
    }

}