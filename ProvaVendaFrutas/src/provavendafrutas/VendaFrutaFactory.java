/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provavendafrutas;

/**
 *
 * @author marcos
 */
public class VendaFrutaFactory {
    private double valorCarrinho;

    public Fruta getFruta(String nomeFruta, String qtd) {
        Fruta nome;
        if("morango".equals(nomeFruta)) {
            nome = new Morango();
            calculaValor(qtd,nome.getValor());
            return nome;
        }else if("melao".equals(nomeFruta)) {
            nome = new Melao();
            calculaValor(qtd,nome.getValor());
            return nome;
        }else if("pera".equals(nomeFruta)) {
            nome = new Pera();
            calculaValor(qtd,nome.getValor());
            return nome;
        }else
        return null;
    }
    public void calculaValor(String quantidade,Double valor){
        carrinho(valor*(Double.valueOf(quantidade)));
    }
    public Double carrinho(double number){
        valorCarrinho += number;
        return valorCarrinho;
    }
    
    public double getValorCarrinho() {
        return valorCarrinho;
    }

    public void setValorCarrinho(double valorCarrinho) {
        this.valorCarrinho = valorCarrinho;
    }
}
