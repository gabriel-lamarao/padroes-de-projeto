package Creation.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    static private Estoque instance = null;
    static private List<Produto> produtos;
    private Estoque() {
        produtos = new ArrayList<>();
    }

    static Estoque getInstance() {
        if (instance == null)
            instance = new Estoque();
        return instance;
    }

    public void addProduct(Produto produto){
        produtos.add(produto);
    }

    public void getLista(){
        for (Produto p : produtos)
            System.out.println(p.getNome());
    }

}
