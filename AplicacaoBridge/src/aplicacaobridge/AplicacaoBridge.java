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
public class AplicacaoBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(new Vermelho());
        System.out.println(quadrado.desenho());
        
        Forma quadrado2 = new Quadrado(new Amarelo());
        System.out.println("\n"+quadrado2.desenho());
        
        Forma triangulo = new Triangulo(new Amarelo());
        System.out.println("\n"+triangulo.desenho());
        
        Forma triangulo2 = new Triangulo(new Vermelho());
        System.out.println("\n"+triangulo2.desenho());
    }
    
}
