package structural.composite;

public class Main {
	public static void main(String[] args) {
		/*
		Funcionario gerente = new Gerente("Alujohn Rodrigues");
	    Funcionario atendente = new Atendente("John Soares");
	    Funcionario caixa = new Caixa("Shaman Gringo");

	    gerente.adicionar(atendente);
	    gerente.printNomeDoFuncionario();

		atendente.adicionar(atendente);
		atendente.printNomeDoFuncionario();

		caixa.adicionar(caixa);
		caixa.printNomeDoFuncionario();
		 */

		CrudFuncionarios crud = new CrudFuncionarios();
		crud.addFuncionario("Gabriel lamarao da Silva", "caixa");
		crud.showFuncionarios();
	}
}

