package structural.compositeAndFactoryMethod;
public class Atendente extends Funcionario{
	
	public Atendente (String nomeDoAtendente) {
        this.nome = nomeDoAtendente;
        this.cargo = "atentende";
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nome);
     }

    @Override
    public void printCargoDoFuncionario() {

    }

}
