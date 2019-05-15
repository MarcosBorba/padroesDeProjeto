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
public class Pera implements Fruta{

    public Pera(){
        getType();
        getValor();
    }

    @Override
    public String getType() {
        return "Pera";
    }

    @Override
    public Double getValor() {
        return 1.00;
    }
    
}
