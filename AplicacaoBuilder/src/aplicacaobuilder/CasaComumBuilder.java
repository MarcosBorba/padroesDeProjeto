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
public class CasaComumBuilder extends MoradiaBuilder {

    @Override
    public void buildPreco() {
        imovel.preco = 100000.00;
    }

    @Override
    public void buildModelo() {
        imovel.modelo = "Comum";
    }

    @Override
    public void buildEstrutura() {
        imovel.estrutura = "Madeira";
    }

    @Override
    public void buildAnoDeConstrucao() {
        imovel.anoDeConstrucao = 2000;
    }

    @Override
    public void buildAgencia() {
        imovel.agencia = "ImoveisnaHora";
    }

}
