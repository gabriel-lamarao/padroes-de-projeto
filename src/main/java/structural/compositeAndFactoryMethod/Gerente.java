package structural.compositeAndFactoryMethod;

public class Gerente extends Supervisor{
	public Gerente(String nomeDoSupervisor) {
		super(nomeDoSupervisor);
        this.nome = nomeDoSupervisor;
        this.cargo = "gerente";
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nome);
    }

    @Override
    public void printCargoDoFuncionario() {

    }

}
