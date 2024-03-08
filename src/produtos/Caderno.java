package produtos;

public class Caderno implements Produto {
    final static String nome = "Caderno";
    final static double valor = 12.99;
    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double getValor(){
        return valor;
    }
}
