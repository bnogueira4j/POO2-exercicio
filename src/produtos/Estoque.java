package produtos;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Produto> {
    private List<T> listaProdutos = new ArrayList<>();

    public boolean adicionar(T produto) {
        if(produto != null){
            listaProdutos.add(produto);
            return true;
        }
        return false;
    }

    public boolean remover(T produto){
        if(produto != null){
            listaProdutos.remove(produto);
            return true;
        }
        return false;
    }
}
