public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void retirarDoEstoque(int quantidade) throws EstoqueInsuficiente{
        if (quantidade > this.quantidade){
            throw new EstoqueInsuficiente("Quantidade insuficiente em estoque.");
        }
        this.quantidade -= quantidade;
    }

    public void adicionarAoEstoque(int quantidade) throws QuantidadeInvalida{
        if (quantidade < 0){
            throw new QuantidadeInvalida("Quantidade inválida para adicionar ao estoque.");
        }
        this.quantidade += quantidade;
    }

    public String toString(){
        return String.format("Produto: %s, Quantidade: %d, Preço: R$%.2f", nome, quantidade, preco);
    }

    public String getNome() {
        return nome;
    }
}
