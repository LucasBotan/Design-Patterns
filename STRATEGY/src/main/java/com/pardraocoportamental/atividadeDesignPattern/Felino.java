package com.pardraocoportamental.atividadeDesignPattern;

abstract public class Felino {

    protected CorrerStrategy correrStrategy;

    abstract public void display();
    abstract public void rugir();

    public void setCorrerStrategy( CorrerStrategy correrStrategy ){

        this.correrStrategy = correrStrategy;
    }
    
    public void performarCorrer(){

        correrStrategy.correr();
    }
    
}
