package structural.composite;

public abstract class Funcionario {
	String nome;
	String cargo;

	public void printNomeDoFuncionario() {
		System.out.println(this.nome);
	}

	public void printCargoDoFuncionario(){
		System.out.println(this.cargo);
	}

}
