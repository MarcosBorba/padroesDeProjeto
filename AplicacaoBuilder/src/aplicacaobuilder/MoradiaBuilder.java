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
public abstract class MoradiaBuilder {
	protected ImovelProduto imovel = new ImovelProduto();
	public abstract void buildPreco();
	public abstract void buildEstrutura();
	public abstract void buildAnoDeConstrucao();
	public abstract void buildModelo();
	public abstract void buildAgencia();
	public ImovelProduto getMoradia(){
		return imovel;
	};
}
