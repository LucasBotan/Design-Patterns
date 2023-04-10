package com.pardraocoportamental.atividadeDesignPattern;

public class Leopardo extends Felino {

    public Leopardo(){

        correrStrategy = new CorrerLongaDist();
    }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println( "Leopardo a vista" );
    }

    @Override
    public void rugir() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'rugir'");
        System.out.println( "Arghh!" );
    }
    
}
