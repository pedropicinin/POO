public class App {
    public static void main(String[] args) throws Exception {
        Fornecedor fornecedor = new Fornecedor("Fornecedor1", "Buritis", "3333-3333", 1000, 100);
        Empregado empregado = new Empregado("Empregado1", "Lourdes", "1111-1111", 20, 2000, 15);
        Administrador administrador = new Administrador("Administrador1", "Sion", "2222-2222", 10, 5000, 15, 1000);
        Operario operario = new Operario("Operario1", "Belvedere", "4444-4444", 25, 1000, 15, 2000, 35);
        Vendedor vendedor = new Vendedor("Vendedor1", "Nova lima", "5555-5555", 30, 1000, 15, 1500, 50);

        fornecedor.exibir();
        empregado.exibir();
        administrador.exibir();
        operario.exibir();
        vendedor.exibir();
    }
}
