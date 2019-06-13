/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotemplatemethod;

/**
 *
 * @author marcos
 */
public class AplicacaoTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriaComputador criacao1 = new CriacaoComputadorPadrao();
        Computador computador1 = criacao1.criaComputador();
        computador1.getComputadorPartes().forEach((k, v) -> System.out.println("Parte : " + k + " | Tipo : " + v));
        
        CriaComputador criacao2 = new CriacaoComputadorAltaQualidade();
        Computador computador2 = criacao2.criaComputador();
        computador2.getComputadorPartes().forEach((k, v) -> System.out.println("Parte : " + k + " | Tipo : " + v));
    }
    
}
