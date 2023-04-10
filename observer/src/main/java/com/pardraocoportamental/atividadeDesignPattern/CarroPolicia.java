package com.pardraocoportamental.atividadeDesignPattern;
import java.util.Observable;
import java.util.Observer;
public class CarroPolicia implements Observer, Carro{

    @Override
    public void frente() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'frente'");
        System.out.println("Viatura segue em frente.");
    }

    @Override
    public void direita() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'direita'");
       System.out.println("Viatura vira a direita.");
    }

    @Override
    public void esquerda() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'esquerda'");
        System.out.println("Viatura vira a esquerda.");
    }

    @Override
    public void para() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'para'");
       System.out.println("Viatura para.");
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'update'");
        CarroRoubado carroRoubado = (CarroRoubado)arg0;
        String acao= String.valueOf(arg1);

        if(acao.equals("frente")){
            this.frente();
        }
        else if(acao.equals("direita")){
            this.direita();

        }
        else if(acao.equals("esquerda")){
            this.esquerda();
        }
        else if(acao.equals("para")){
            this.para();
        }

    }
    
}
