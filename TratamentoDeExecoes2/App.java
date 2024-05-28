import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class EstoqueInsuficiente extends Exception {
    public EstoqueInsuficiente(String mensagem) {
        super(mensagem);
    }
}

class QuantidadeInvalida extends Exception {
    public QuantidadeInvalida(String mensagem) {
        super(mensagem);
    }
}

class ProdutoNaoEncontrado extends Exception {
    public ProdutoNaoEncontrado(String mensagem) {
        super(mensagem);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        String nomeArquivo = "Log" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            while (true) {
                System.out.println("\n1 - Adicionar Produto");
                System.out.println("2 - Retirar Produto");
                System.out.println("3 - Exibir estoque atualizado");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                String opcao = scanner.nextLine();

                switch (opcao) {
                    case "1":
                        System.out.print("Nome do Produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Quantidade inicial: ");
                        int quantidade = Integer.parseInt(scanner.nextLine());
                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(scanner.nextLine());
                        try {
                            Produto produto = new Produto(nome, quantidade, preco);
                            produto.adicionarAoEstoque(quantidade);
                            estoque.adicionarProduto(produto);
                        } catch (QuantidadeInvalida e) {
                            System.out.println("Erro: " + e.getMessage());
                            writer.write("Erro ao adicionar produto: " + e.getMessage());
                            writer.newLine();
                        }
                        break;
                    case "2":
                        System.out.print("Nome do Produto: ");
                        String nomeRemover = scanner.nextLine();
                        System.out.print("Quantidade para retirar: ");
                        int quantidadeRemover = Integer.parseInt(scanner.nextLine());
                        try {
                            Produto produto = estoque.buscarProduto(nomeRemover);
                            produto.retirarDoEstoque(quantidadeRemover);
                        } catch (EstoqueInsuficiente | ProdutoNaoEncontrado e) {
                            System.out.println("Erro: " + e.getMessage());
                            writer.write("Erro ao retirar produto: " + e.getMessage());
                            writer.newLine();
                        }
                        break;
                    case "3":
                        System.out.println("Estoque atualizado: ");
                        System.out.println(estoque);
                        break;
                    case "4":
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo de log: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
