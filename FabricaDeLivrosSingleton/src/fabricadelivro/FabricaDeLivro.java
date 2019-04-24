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
public class FabricaDeLivro {

    public static FabricaDeLivro instancia;
    protected int totalLivrosInfantis;
    protected int totalLivrosAdultos;
    protected int totalLivrosJovens;

    protected FabricaDeLivro() {
    }

    public static FabricaDeLivro getInstancia() {
        if (instancia == null) {
            instancia = new FabricaDeLivro();
        }
        return instancia;
    }

    public String criarLivrosJovens() {
        totalLivrosJovens++;
        return new String(totalLivrosJovens +" livro jovem criado.");
    }

    public String criarLivrosAdultos() {
        totalLivrosAdultos++;
        return new String(totalLivrosAdultos + " livro adulto criado.");
    }

    public String criarLivrosInfantis() {
        totalLivrosInfantis++;
        return new String(totalLivrosInfantis+ " livro infantil criado.");
    }

    public String gerarRelatorio() {
        return new String("Total de livros infantis vendidos: " + totalLivrosInfantis
                + "\nTotal de livros adultos vendidos: " + totalLivrosAdultos
                + "\nTotal de livros jovens vendidos: " + totalLivrosJovens);
    }

}
