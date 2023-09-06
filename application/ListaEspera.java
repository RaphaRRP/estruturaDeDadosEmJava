package application;

import entities.Lista;

public class ListaEspera {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(600);
        lista.inserir(500);
        lista.inserir(400);
        lista.inserir(300);
        lista.inserir(200);
        
        while(!lista.isEmpty()){
            int e = lista.retirar();
            System.out.println("Retirado: " + e);

        }
    }
}
