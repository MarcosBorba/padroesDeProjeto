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
public class Comprador {
	public static void main(String[] args) {
		Imobiliaria imobiliaria = new Imobiliaria(
	            new CasaComumBuilder());
	 
	    imobiliaria.construirMoradia();
	    ImovelProduto casa = imobiliaria.getMoradia();
	    System.out.println("Moradia: " + casa.modelo + "/" + casa.agencia
	            + "\nAno: " + casa.anoDeConstrucao + "\nEstrutura: "
	            + casa.estrutura + "\nValor: " + casa.preco);
	 
	    System.out.println();
	 
	    imobiliaria = new Imobiliaria(new SobradoBuilder());
	    imobiliaria.construirMoradia();
	    casa = imobiliaria.getMoradia();
	    System.out.println("Moradia: " + casa.modelo + "/" + casa.agencia
	            + "\nAno: " + casa.anoDeConstrucao + "\nEstrutura: "
	            + casa.estrutura + "\nValor: " + casa.preco);
	}
}
