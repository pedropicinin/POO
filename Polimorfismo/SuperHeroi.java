public class SuperHeroi extends Personagem{
    
    public SuperHeroi(String nome, String nomeVidaReal){
        super(nome, nomeVidaReal);
    }

    @Override
    public int getPoderTotal(){
         int total = super.getPoderTotal();
         return total += (total * 0.10);
    }
}
