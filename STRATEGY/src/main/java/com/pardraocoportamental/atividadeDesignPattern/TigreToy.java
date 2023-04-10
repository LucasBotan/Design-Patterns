package com.pardraocoportamental.atividadeDesignPattern;

public class TigreToy extends Felino {

    public TigreToy(){

        correrStrategy = new CorrerToy();
    }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println( "Tigre de pelucia" );
    }

    @Override
    public void rugir() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'rugir'");
       System.out.println( "Uen! Uen!" );
    }
    
    
}
