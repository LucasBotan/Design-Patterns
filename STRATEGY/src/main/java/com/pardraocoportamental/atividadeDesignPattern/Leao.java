package com.pardraocoportamental.atividadeDesignPattern;

public class Leao extends Felino {

    public Leao(){

        correrStrategy = new CorrerCurtaDist();
    }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println( "Leão a vista" );
    }

    @Override
    public void rugir() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'rugir'");
        System.out.println( "Urghhhhh!" );
    }
    
    
}
