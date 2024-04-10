import java.util.Scanner;
public class Elevador {
    Scanner input = new Scanner(System.in);
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int pessoasPresentes;

    public void inicializar(int t, int c){
        andarAtual = 0;
        totalAndares = t;
        capacidadeElevador = c;
        pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidadeElevador) {
            System.out.println("Digite a quantidade de pessoas: ");
            int numPessoas = input.nextInt();
            if (numPessoas > 0 && numPessoas <= (capacidadeElevador - pessoasPresentes)) {
                pessoasPresentes += numPessoas;
                System.out.println(numPessoas + " pessoas entraram no elevador");
            } else {
                System.out.println("Não é possível adicionar essa quantidade de pessoas.");
            }
        } else {
            System.out.println("Capacidade máxima de pessoas atingida.");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            System.out.println("Digite a quantidade de pessoas que você quer remover: ");
            int numPessoas = input.nextInt();
            if (numPessoas > 0 && numPessoas <= pessoasPresentes) {
                pessoasPresentes -= numPessoas;
                System.out.println(numPessoas + " pessoas saíram do elevador");
            } else {
                System.out.println("Não há pessoas suficientes para sair.");
            }
        } else {
            System.out.println("É necessário ter pessoas no elevador.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            System.out.println("Para qual andar você quer subir? ");
            int destino = input.nextInt();
            if (destino > andarAtual && destino <= totalAndares) {
                andarAtual = destino;
                System.out.println("Elevador subiu para o andar: " + andarAtual);
            } else {
                System.out.println("Andar inválido.");
            }
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            System.out.println("Para qual andar você quer descer? ");
            int destino = input.nextInt();
            if (destino < andarAtual && destino >= 0) {
                andarAtual = destino;
                System.out.println("Elevador desceu para o andar: " + andarAtual);
            } else {
                System.out.println("Andar inválido.");
            }
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public int getAndarAtual(){
        return andarAtual;
    }

    public int getTotalAndares(){
        return totalAndares;
    }

    public int getCapacidadeElevador(){
        return capacidadeElevador;
    }

    public int getPessoasPresentes(){
        return pessoasPresentes;
    }

}
