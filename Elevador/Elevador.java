/*Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe. */

package Elevador;

public class Elevador {
    private int numeroAtualDoAndar;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador(int numeroAtualDoAndar, int totalAndares, int capacidade, int quantidadePessoas){
        this.numeroAtualDoAndar = 0;
        this.quantidadePessoas = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void entra(){
        if (this.quantidadePessoas < this.capacidade ) {
            this.quantidadePessoas ++;
        }
    }

    public void sai(){
        if (this.quantidadePessoas > 0) {
            this.quantidadePessoas --;
        }
    }

    public void sobe(){
        if (this.numeroAtualDoAndar < this.totalAndares) {
            this.numeroAtualDoAndar ++;
        }
    }

    public void desce(){
        if (this.totalAndares > 0) {
            this.totalAndares --;
        }
    }
}
