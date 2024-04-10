import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Elevador elevadorA = new Elevador();

        System.out.println("Informe o total de andares do prédio: ");
        int totalAndares = input.nextInt();
        System.out.println("Informe a capacidade do elevador: ");
        int capacidade = input.nextInt();

        elevadorA.inicializar(totalAndares, capacidade);

        elevadorA.entrar();
        elevadorA.subir();
        elevadorA.sair();
        elevadorA.descer();

        System.out.println("Andar atual: "+ elevadorA.getAndarAtual());
        System.out.println("Pessoas presentes no elevador: "+ elevadorA.getPessoasPresentes());

        input.close();
    }
}
