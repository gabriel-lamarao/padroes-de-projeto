package behavioral.memento;

public class Texto {
    private String texto;
    private ArmazenadorMemento armazenador;

    public Texto(){
        armazenador = new ArmazenadorMemento();
        texto = "";
    }

    public void concatenarTexto(String texto){
        this.texto += texto;
        armazenador.adicionaEstado(texto);
    }

    //funcao que remove o fim da string atual recuperando a ultima alteracao feita
    public void desfazer(){
        String ultimaAlteracao = armazenador.recuperaEstado();
        if(!ultimaAlteracao.isBlank()){
            texto = texto.substring(0, texto.length() - ultimaAlteracao.length());
        }
    }

    public void exibirTexto(){
        if(texto.equals("")) System.out.println("Vazio!");
        else {
            System.out.println(texto);
        }
    }
}
