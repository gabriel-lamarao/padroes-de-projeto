
package structural.compositeAndFactoryMethod;

public abstract class Supervisor extends Funcionario{

	public Supervisor(String nomeDoSupervisor) {
		this.nome = nomeDoSupervisor;
	}

	@Override
	public void printNomeDoFuncionario() {
		System.out.println(this.nome);
	}

}
