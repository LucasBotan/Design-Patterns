package com.pardraocoportamental.atividadeDesignPattern;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro{

    private String acao  ="";
    

    @Override
    public void frente() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'frente'");
        acao = "frente";
        System.out.println("Carro roubado segue em frente.");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'direita'");
       acao = "direita";
       System.out.println("Carro roubado vira a esquerda.");
       this.mudaEstado();
    }

    @Override
    public void esquerda() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'esquerda'");
        acao = "esquerda";
        System.out.println("Carro roubado vira a esquerda.");
        this.mudaEstado();
    }

    @Override
    public void para() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'para'");
       acao = "para";
       System.out.println("Carro roubado vira a esquerda.");
       this.mudaEstado();
    }

    public void mudaEstado(){
        setChanged(); //aqui mudou o estado
        notifyObservers(acao); //notifica os observadores e passa a acao
    }

}
