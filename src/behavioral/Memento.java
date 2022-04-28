package behavioral;

public class Memento {
    private String estadoTexto;

    public Memento(String texto){
        this.estadoTexto = texto;
    }

    public String recuperaTexto(){
        return estadoTexto;
    }
}
