package entities;

public class Lista {

    private Caixa inicio;
    
    public Lista(){
        this.inicio = null;
    }

    public void inserir(int elemento){
        Caixa nova = new Caixa();
        nova.setElemento(elemento);
        nova.setProximo(null);

        if (inicio == null){
            inicio = nova;
        }
        else{
            Caixa aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    public int retirar(){
        Caixa aux = inicio;
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
    }
    public void listar(){
        if (inicio == null){
            System.out.println("Lista Vazia");
        }
        else{
            Caixa aux = inicio;
            while (aux != null){
                System.out.println("Elemento visto: " + aux.getElemento());
                aux = aux.getProximo();
            }
        }

    }
    public boolean isEmpty(){
        return(this.inicio == null);
    }
    
}
