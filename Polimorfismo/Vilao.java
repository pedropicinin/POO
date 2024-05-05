public class Vilao extends Personagem {
    private int tempoDePrisao;

    public Vilao (String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        this.tempoDePrisao = tempoDePrisao;
    }

    public int getTempoDePrisao(){
        return tempoDePrisao;
    }
}
