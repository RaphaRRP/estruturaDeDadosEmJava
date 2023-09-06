package application;

import entities.Fila;

public class ProgramFila {
    public static void main(String[] args) {
        int e;
        Fila f = new Fila();
        
        f.inserir(176);
        f.inserir(914);
        f.inserir(12);
        f.inserir(1817);
        f.inserir(100);

        while(!f.isEmpty()){
            e = f.retirar();
            System.out.println("Senha: " + e);
        }



    }
}
