/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMultiplaAdapter;

/**
 *
 * @author marcos
 */
public class ResultadoBinario implements AdapterFactory{

    @Override
    public String converteResultado(String resultado) {  
        return Long.toBinaryString(Double.doubleToRawLongBits(Double.valueOf(resultado)));
    }
    //String.valueOf(Double.doubleToLongBits(Double.valueOf(resultado)));
}
