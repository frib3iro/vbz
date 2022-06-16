package interfaceBase;

public interface InterfaceJogos {

//    GETTERS E SETTERS
    public void setAposta(int aposta);
    public void setResultado(int resultado);
    
//    MÉTODOS
    public abstract void executaJogo();
    public abstract void executaJogo(int aposta);
    public abstract void mostraResultado();
}
