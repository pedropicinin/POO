import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(String nomeProduto) throws ProdutoNaoEncontrado {
        Produto produto = buscarProduto(nomeProduto);
        produtos.remove(produto);
    }

    public Produto buscarProduto(String nomeProduto) throws ProdutoNaoEncontrado {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontrado("Produto não encontrado no estoque.");
    }

    public String toString() {
        if (produtos.isEmpty()) {
            return "Estoque vazio.";
        }
        StringBuilder sb = new StringBuilder();
        for (Produto produto : produtos) {
            sb.append(produto).append("\n");
        }
        return sb.toString();
    }
}
