package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    static private List<Funcionario> allEmployees;

    private BancoDeDados(){
        allEmployees = new ArrayList<>();
    }

    private static void criarBancoDeDados(){
        if(allEmployees == null) {
            BancoDeDados bd = new BancoDeDados();
        }
    }

    public static void adicionaFuncioario(Funcionario funcionario){
        criarBancoDeDados();
        allEmployees.add(funcionario);
    }

    public static String getFuncionarios(){
        StringBuilder sb = new StringBuilder();
        for (Funcionario f:
             allEmployees) {
            sb.append("Nome: ").append(f.nome).append(" ").append("Cargo: ").append(f.cargo);

        }
        return sb.toString();
    }
}
