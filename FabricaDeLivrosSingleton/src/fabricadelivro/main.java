/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadelivro;

/**
 *
 * @author marcos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeLivro criacao = FabricaDeLivro.getInstancia();
        System.out.println(criacao.criarLivrosInfantis());
        System.out.println(criacao.criarLivrosAdultos());
        System.out.println(criacao.criarLivrosJovens());
        System.out.println(criacao.criarLivrosInfantis());
        System.out.println(criacao.criarLivrosAdultos());
        System.out.println(criacao.criarLivrosJovens());
        System.out.println(criacao.criarLivrosJovens());
        System.out.println(criacao.gerarRelatorio());
    }

}
