public class Fatura {
    private int numero, quantidade;
    private String descricao;
    private double preco;

    public Fatura(int numero, int quantidade, String descricao, double preco) {
        numero = numero;
        descricao = descricao;
        if (quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if (preco < 0){
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public double getValorFatura(){
        return quantidade * preco;
    }
}
