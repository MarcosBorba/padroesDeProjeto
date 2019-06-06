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
public class Triangulo extends Forma {

    public Triangulo(Cores cor) {
        super(cor);
    }

    @Override
    public String desenho() {
        return "Triangulo desenhado. " + cor.preenchimento();
    }
}
