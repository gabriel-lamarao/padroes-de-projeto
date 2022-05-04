package structural.composite;
public class Caixa extends Funcionario{
	public Caixa (String nomeDoCaixa) {
        this.nome = nomeDoCaixa;
        this.cargo = "caixa";
    }

    @Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nome);
    }

}
