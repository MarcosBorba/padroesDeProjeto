/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotemplatemethod;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author marcos
 */
public class Computador {
    
    private Map<String, String> computadorPartes = new HashMap<>();
    
    public Computador(Map<String, String> computadorPartes) {
        this.computadorPartes = computadorPartes;
    }
    
    public Map<String, String> getComputadorPartes() {
        return computadorPartes;
}
    
}
