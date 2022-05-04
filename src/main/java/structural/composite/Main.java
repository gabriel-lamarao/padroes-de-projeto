package structural.composite;

public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Alujohn Rodrigues");
	    Funcionario atendente = new Atendente("John Soares");
	    Funcionario caixa = new Caixa("Shaman Gringo");

	    gerente.adicionar(atendente);
	    gerente.printNomeDoFuncionario();

		atendente.adicionar(atendente);
		atendente.printNomeDoFuncionario();

		caixa.adicionar(caixa);
		caixa.printNomeDoFuncionario();
	}
}

//Classe básica para todos os objetos