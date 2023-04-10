package com.pardraocoportamental.atividadeDesignPattern;

public class Cha extends BebidaCafeinada {

    @Override
    public void mistura(){

        System.out.println( "Preparando o saquinho de chá" );
    }

    @Override
    public void addCondimentos(){

        System.out.println( "Adicionando algumas gotas de limão" );
    }

    /* 
    public void preparar(){

        esquentarAgua();
        mistura();
        colocarEmCopo();
        addCondimentos();
    }

    public void esquentarAgua(){

        System.out.println( "Esquentando água" );
    }

    ///
    public void prepararSaquinhoDeCha(){

        System.out.println( "Preparando o saquinho de chá" );
    }

     public void addLimao(){

        System.out.println( "Adicionando algumas gotas de limão" );
    }
   // 

    public void colocarEmCopo(){

        System.out.println( "Colocando no copo" );
    }

   

    public void mistura(){

        System.out.println( "Preparando o saquinho de chá" );
    }
    
    public void addCondimentos(){

        System.out.println( "Adicionando algumas gotas de limão" );
    }
    */

}
