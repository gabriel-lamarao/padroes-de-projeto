package Creation.Singleton;

public class Program {
    public static void main(String[] args) {
        Produto p = new Produto();
        Produto p2 = new Produto();
        p.setNome("Coca");
        p2.setNome("Fanta");
        Estoque e = Estoque.getInstance();
        e.addProduct(p);
        e.addProduct(p2);
        e.getLista();
    }
}
