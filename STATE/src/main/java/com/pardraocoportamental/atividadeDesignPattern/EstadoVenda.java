package com.pardraocoportamental.atividadeDesignPattern;

public class EstadoVenda extends Estado{

    protected EstadoVenda(MaquinaRefrigerantes maquinaRefrigerantes) {
        super(maquinaRefrigerantes);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void inseriuMoeda(){

        System.out.println( "FALHOU: Aguarde, já estamos liberando seu refrigerante." );
    }

    @Override
    public void solicitouMoeda(){

        System.out.println( "FALHOU: A venda já foi concretizada, não é possível devolve-la." );
    }

    @Override
    public void despejarRefrigerante(){

        System.out.println( "FALHOU: Aguarde, o refrigerante já será liberado." );
    }

    protected void despejar(){

        int qtd = maquinaRefrigerantes.getQuantidadeRefrigerantes();

        qtd--;
        maquinaRefrigerantes.setQuantidadeRefrigerantes( qtd );

        if( qtd > 0 ){

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemMoeda() );
        }
        else{

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemRefrigerante() );
        }
    }
    
}
