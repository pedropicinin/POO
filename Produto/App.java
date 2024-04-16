import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro produto: ");
        String nome1 = input.nextLine();
        System.out.println("Informe o preco de primeiro produto: ");
        double preco1 = input.nextDouble();

        Produto produto1 = new Produto(nome1, preco1);

        input.nextLine();

        System.out.println("Digite o nome do segundo produto: ");
        String nome2 = input.nextLine();
        System.out.println("Informe o preco de segundo produto: ");
        double preco2 = input.nextDouble();

        Produto produto2 = new Produto(nome2, preco2);

        System.out.println("Informe o percentual de reajuste: ");
        double percentual_reajuste = input.nextDouble();

        produto1.reajuste(percentual_reajuste);
        produto2.reajuste(percentual_reajuste);

        System.out.println("Informações do primeiro produto:");
        produto1.exibe();
        System.out.println("Último ID gerado: " + Produto.getUltimoId());

        System.out.println("\nInformações do segundo produto:");
        produto2.exibe();
        System.out.println("Último ID gerado: " + Produto.getUltimoId());

        input.close();
    }
}
