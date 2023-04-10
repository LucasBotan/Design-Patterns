package com.pardraocoportamental.atividadeDesignPattern;

public class ValorSiteVisitor implements Visitor{

    @Override
    public float visit(Produto produto) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'visit'");
        return produto.getPreco() + produto.getvalorFrete() + produto.getacrescimo();
    }
    
}
