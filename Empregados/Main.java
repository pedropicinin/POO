public class Main {
  public static void main(String[] args) {
    Empregado empregado1 = new Empregado("Pedro", "Picinin", 3000);
    Empregado empregado2 = new Empregado("Fernanda", "Melo", 5000);

      System.out.println("Salario anual do empregado 1: " + empregado1.SalarioAnual());

    System.out.println("Salario anual do empregado 2: " + empregado2.SalarioAnual());

    empregado1.aumentoSalario(10);
    empregado2.aumentoSalario(10);
    
    System.out.println("Salario anual do empregado 1 apos reajuste: " + empregado1.SalarioAnual());
    System.out.println("Salario anual do empregado 2 apos reajuste: " + empregado2.SalarioAnual());
    
  }
}
