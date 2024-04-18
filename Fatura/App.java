public class App {
    public static void main(String[] args) throws Exception {
        Fatura fatura1 = new Fatura(5, 5, "Cueca", 47.50);
        Fatura fatura2 = new Fatura(10, 1, "Tenis", 250.90);

        System.out.println("O valor da fatura 1: " + fatura1.getValorFatura());
        System.out.println("O valor da fatura 2: " + fatura2.getValorFatura());
    }
}
