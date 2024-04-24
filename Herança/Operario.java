public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public void setValorproducao(double valorProducao){
        this.valorProducao = valorProducao;
    }

    public double getValorProducao(){
        return valorProducao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    public double calcularSalario(){
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }

    public void exibir() {
        System.out.println();
        System.out.print("Operario ");
        super.exibir();
        System.out.println("Valor de produção: " + getValorProducao());
        System.out.println("Comissão: " + getComissao());
    }
}
