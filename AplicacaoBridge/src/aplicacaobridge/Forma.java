/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaobridge;

/**
 *
 * @author marcos
 */
abstract class Forma {
    protected Cores cor;
    
    public Forma(Cores cor) {
        this.cor = cor;
    }
    
    abstract public String desenho();
}
