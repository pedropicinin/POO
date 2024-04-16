public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    public Produto(){
        id = ultimo_id++;
        nome = "Nome nao informado";
        preco = 0;
    }
    
    public Produto(String n, double p){
        nome = n;
        preco = p;
        id = ultimo_id++;
    }

    public int getId(){
        return id;
    }

    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double p){
        if (preco < 0) {
            preco = 0;
        }
        else {
            preco = p;
        }
    }

    public double getPreco(){
        return preco;
    }

    public void exibe(){
        System.out.println("Produto: " + nome);
        System.out.println("Id: "+id);
        System.out.println("Preco: "+preco);
    }

    public void reajuste(double percentual){
        preco *= (1 + percentual / 100);
    }

    public static int getUltimoId(){
        return ultimo_id;
    }
}