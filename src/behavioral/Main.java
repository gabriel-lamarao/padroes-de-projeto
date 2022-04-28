package behavioral;

public class Main {
    public static void main(String[] args){
        Texto texto = new Texto();
        texto.exibirTexto();
        texto.concatenarTexto("Adicionando Primeira Frase");
        texto.exibirTexto();
        texto.concatenarTexto(" Segunda Frase");
        texto.exibirTexto();
        texto.desfazer();
        texto.exibirTexto();
        texto.desfazer();
        texto.exibirTexto();
    }
}
