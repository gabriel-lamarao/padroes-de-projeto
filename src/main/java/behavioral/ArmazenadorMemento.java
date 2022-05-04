package behavioral;

import java.util.Stack;

public class ArmazenadorMemento {
    /*uso da pilha para garantir que o ultimo estado inserido
     seja recuperado primeiro*/
    private Stack<Memento> estados;

    public ArmazenadorMemento(){
        estados = new Stack<Memento>();
    }

    public void adicionaEstado(String conteudo){
        var novoEstado = new Memento(conteudo);
        estados.push(novoEstado);
    }

    public String recuperaEstado(){
        if(!estados.empty()){
            return estados.pop().recuperaTexto();
        }else{
            return "";
        }
    }
}
