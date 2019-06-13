/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotemplatemethod;
//import aplicacaotemplatemethod.Computador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author marcos
 */
public abstract class CriaComputador {

    protected Map<String, String> computadorPartes = new HashMap<>();
    protected List<String> estadoInstalacaoPlacaMae = new ArrayList<>();

    public final Computador criaComputador() {
        addPlacaMae();
        configPlacaMae();
        addProcesso();
        return getComputador();
    }

    public abstract void addPlacaMae();

    public abstract void configPlacaMae();

    public abstract void addProcesso();

    public List<String> getEstadoInstalacaoPlacaMae() {
        return estadoInstalacaoPlacaMae;
    }

    public Map<String, String> getComputadorPartes() {
        return computadorPartes;
    }

    private Computador getComputador() {
        return new Computador(computadorPartes);
    }
}
