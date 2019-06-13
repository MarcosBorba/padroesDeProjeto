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
public class CriacaoComputadorPadrao extends CriaComputador {

    @Override
    public void addPlacaMae() {
        computadorPartes.put("Placa Mae", "Placa Mae Padrao");
    }

    @Override
    public void configPlacaMae() {
        estadoInstalacaoPlacaMae.add("Aparafusando a placa mae padrao ao gabinete.");
        estadoInstalacaoPlacaMae.add("Conectando os conectores da fonte de alimentacao.");
        estadoInstalacaoPlacaMae.forEach(parte -> System.out.println(parte));
    }

    @Override
    public void addProcesso() {
        computadorPartes.put("Processo", "Processo Padrao\n");
    }
}
