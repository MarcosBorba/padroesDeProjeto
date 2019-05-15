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
public class Melao implements Fruta{

    public Melao(){
        getType();
        getValor();
    }

    @Override
    public String getType() {
        return "Melao";
    }

    @Override
    public Double getValor() {
        return 5.00;
    }
    
}
