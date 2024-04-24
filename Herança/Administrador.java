public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    public double calcularSalario() { 
        return super.calcularSalario() + ajudaDeCusto;
    }

    public void exibir() {
        System.out.println();
        System.out.print("Administrador ");
        super.exibir();
        System.out.println("Ajuda de custo: " + getAjudaDeCusto());
    }

}
