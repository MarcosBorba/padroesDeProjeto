/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provavendafrutas;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class MainVendaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendaFrutaFactory fruta = new VendaFrutaFactory();
        Fruta nova;
        Scanner ler = new Scanner(System.in);
        String tipo;
        String saida;
        do {
            System.out.println("########################################################");
            System.out.println("Qual fruta você quer? (morango, pera ou melao)");
            tipo = ler.next();
            System.out.println("########################################################");
            System.out.println("Qual a quantidade você quer? (1, 2 ou 3...)");
            saida = ler.next();
            nova = fruta.getFruta(tipo,saida);
            if(nova!=null){
            System.out.println("Fruta - "+nova.getType());
            System.out.println("Valor = R$"+(nova.getValor()+" por unidade"));
            System.out.println("Valor total = R$"+fruta.getValorCarrinho());
            }else{
                System.out.println("Essa fruta não existe");
            }
            System.out.println("\n#######################################");
            System.out.println("Quer mais alguma coisa? (sim ou nao)");
            saida = ler.next();
        } while (!"nao".equals(saida));
        System.out.println("\n#######################################");
        System.out.println("O valor total da compra foi de R$"+fruta.getValorCarrinho());
        System.out.println("\n###############");
        System.out.println("Volte sempre!!!");
    }
    
}
