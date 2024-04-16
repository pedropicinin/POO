public class Empregado{
  private String nome, sobrenome;
  private double Salario;

  public Empregado(String nome, String sobrenome, double Salario){
    nome = nome;
    sobrenome = sobrenome;
    if (Salario < 0){
      this.Salario = 0;
    }
    else {
      this.Salario = Salario;
    }
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
  }

  public String getSobrenome(){
    return sobrenome;
  }

  public void setSalario(double Salario){
    if (Salario < 0){
      Salario = 0;
    }
    else {
      this.Salario = Salario;
    }
  }

  public Double getSalario(){
    return Salario;
  }

  public double SalarioAnual(){
    return Salario * 12;
  }

  public void aumentoSalario(double porcentagem){
    Salario = Salario + (Salario * porcentagem / 100);
  }
} 
