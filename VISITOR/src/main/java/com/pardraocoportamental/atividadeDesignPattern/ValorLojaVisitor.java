package com.pardraocoportamental.atividadeDesignPattern;

public class ValorLojaVisitor implements Visitor {

    @Override
    public float visit(Produto produto) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'visit'");
        return produto.getPreco();
    }
    
}
