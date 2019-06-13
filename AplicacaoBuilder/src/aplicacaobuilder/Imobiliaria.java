/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaobuilder;

/**
 *
 * @author marcos
 */
public class Imobiliaria {
	protected MoradiaBuilder imobiliaria;
	 
    public Imobiliaria(MoradiaBuilder imobiliaria) {
        this.imobiliaria = imobiliaria;
    }
 
    public void construirMoradia() {
        imobiliaria.buildPreco();
        imobiliaria.buildAnoDeConstrucao();
        imobiliaria.buildEstrutura();
        imobiliaria.buildModelo();
        imobiliaria.buildAgencia();
    }
 
    public ImovelProduto getMoradia() {
        return imobiliaria.getMoradia();
    }
}
