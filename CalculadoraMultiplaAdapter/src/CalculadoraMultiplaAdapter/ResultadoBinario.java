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
public class ResultadoBinario extends AdapterBinario{

    @Override
    public String converteResultado(String resultado) {
        return Integer.toBinaryString(Double.valueOf(Double.valueOf(resultado)).intValue());
    }
    //String.valueOf(Double.doubleToLongBits(Double.valueOf(resultado)));
}
