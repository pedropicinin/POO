public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getValorCredito(){
        return valorCredito;
    }

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }

    public double getValorDivida(){
        return valorDivida;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
    
    public void exibir() {
        System.out.println();
        System.out.println("Fornecedor");
        super.exibir();
        System.out.println("Valor de crédito: " + getValorCredito());
        System.out.println("Valor de dívida: " + getValorDivida());
        System.out.println("Saldo: " + obterSaldo());
        System.out.println();
    }

}
