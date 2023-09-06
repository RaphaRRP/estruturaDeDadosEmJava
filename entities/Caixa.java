package entities;

public class Caixa {
    private int elemento;
    private Caixa proximo;

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public int getElemento() {
        return elemento;
    }
    public void setProximo(Caixa proximo) {
        this.proximo = proximo;
    }
    public Caixa getProximo() {
        return proximo;
    }
    
}
