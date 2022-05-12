package structural.compositeAndFactoryMethod;

public class Presidente extends Supervisor {
    public Presidente(String nome) {
        super(nome);
        this.nome = nome;
        this.cargo = "presidente";
    }

    @Override
    public void printCargoDoFuncionario() {

    }
}
