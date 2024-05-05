public class Jogo {
    public static void main(String[] args) throws Exception {
        SuperHeroi superheroi = new SuperHeroi("Super-Homem", "Clark Kent");
        Vilao vilao = new Vilao("Bizarro", "Bizarro", 100);

        Superpoder Voar = new Superpoder("Voar", 3);
        Superpoder Forca = new Superpoder("Força", 5);
        Superpoder Visao = new Superpoder("Visão de Raio X", 4);
        Superpoder Sopro = new Superpoder("Sopro Congelante", 4);

        superheroi.adicionaSuperpoder(Voar);
        superheroi.adicionaSuperpoder(Forca);
        superheroi.adicionaSuperpoder(Visao);
        superheroi.adicionaSuperpoder(Sopro);
        vilao.adicionaSuperpoder(Voar);
        vilao.adicionaSuperpoder(Forca);
        vilao.adicionaSuperpoder(Visao);
        vilao.adicionaSuperpoder(Sopro);

        Confronto confronto = new Confronto();
        int resultado = confronto.executar(superheroi, vilao);

        if (resultado == 1) {
            System.out.println("O super-heroi venceu");
        }
        else if (resultado == 2) {
            System.out.println("O vilao venceu");
        }
        else{
            System.out.println("Empate");
        }
    }
}
