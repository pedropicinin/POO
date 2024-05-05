public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private Superpoder poderes[] = new Superpoder[4];
    private int contador = 0;

    public Personagem(String nome, String nomeVidaReal){
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }

    public void adicionaSuperpoder(Superpoder sp){
        if (contador < 4) {
            poderes[contador] = sp;
            contador++;
        } else {
            System.out.println("Um super-herói ou vilão pode ter, no máximo, 4 poderes.");
        }   
    }

    public int getPoderTotal(){
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total += poderes[i].getCategoria();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }
}
