public class Confronto {
    
    public int executar(SuperHeroi superheroi, Vilao vilao){
        int poderSuperHeroi = superheroi.getPoderTotal();
        int poderVilao = vilao.getPoderTotal();

        if (poderSuperHeroi > poderVilao){
            return 1;
        }
        else if (poderSuperHeroi < poderVilao){
            return 2;
        }
        else {
            return 0;
        }
    }
}
