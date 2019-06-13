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
public class SobradoBuilder extends MoradiaBuilder {

    @Override
    public void buildPreco() {
        imovel.preco = 1000000.00;
    }

    @Override
    public void buildModelo() {
        imovel.modelo = "Sobrado";
    }

    @Override
    public void buildEstrutura() {
        imovel.estrutura = "Concreto";
    }

    @Override
    public void buildAnoDeConstrucao() {
        imovel.anoDeConstrucao = 2018;
    }

    @Override
    public void buildAgencia() {
        imovel.agencia = "ImoveisSoares";
    }

}
