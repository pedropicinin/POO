public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    } 

    public double getValorVendas() {
        return valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public double calcularSalario(){
        return super.calcularSalario() + (valorVendas * comissao / 100);
        }

    public void exibir() {
        System.out.println();
        System.out.print("Vendedor ");
        super.exibir();
        System.out.println("Valor de vendas: " + valorVendas);
        System.out.println("Comissão: " + comissao);
    }
}
