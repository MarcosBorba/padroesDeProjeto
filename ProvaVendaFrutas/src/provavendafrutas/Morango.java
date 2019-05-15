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
public class Morango implements Fruta {
    
    public Morango(){
        getType();
        getValor();
    }

    @Override
    public String getType() {
        return "Morango";
    }

    @Override
    public Double getValor() {
        return 0.50;
    }

}
