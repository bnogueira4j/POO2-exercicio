package produtos;

public class Caneta  implements Produto {

    final static String nome = "Caneta";
    final static double valor = 1.99;
    @Override
    public String getNome(){
       return nome;
    }
    @Override
    public double getValor(){
        return valor;
    }
}
