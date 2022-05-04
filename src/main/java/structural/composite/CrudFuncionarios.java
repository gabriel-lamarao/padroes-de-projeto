package structural.composite;

import java.util.List;
import java.util.Locale;

public class CrudFuncionarios {
    public void showFuncionarios(){
        System.out.println(BancoDeDados.getFuncionarios());
    }

    public void addFuncionario(String nome, String cargo){
        switch (cargo.toLowerCase(Locale.ROOT)){
            case "atendente":
                Atendente atendente = new Atendente(nome);
                insert(atendente);
                break;
            case "caixa":
                Caixa caixa = new Caixa(nome);
                insert(caixa);
                break;
            case "gerente":
                Gerente gerente = new Gerente(nome);
                insert(gerente);
                break;
            case "presidente":
                Presidente presidente = new Presidente(nome);
                insert(presidente);
                break;
        }
    }

    private void insert(Funcionario funcionario){
        BancoDeDados.adicionaFuncioario(funcionario);
    }
}
