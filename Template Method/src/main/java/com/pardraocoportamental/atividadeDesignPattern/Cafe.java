package com.pardraocoportamental.atividadeDesignPattern;

public class Cafe extends BebidaCafeinada{


    @Override
    public void mistura(){

        System.out.println( "Moendo café" );
    }

    @Override
    public void addCondimentos(){

        System.out.println( "Adicionando açúcar e leite" );
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

   //
    public void moerCafe(){

        System.out.println( "Moendo café" );
    }

    public void addAcucarELeite(){

        System.out.println( "Adicionando açúcar e leite" );
    }
   // 

    public void colocarEmCopo(){

        System.out.println( "Colocando no copo" );
    }    

    public void mistura(){

        System.out.println( "Moendo café" );
    }

    public void addCondimentos(){

        System.out.println( "Adicionando açúcar e leite" );
    }
    */
    
}
