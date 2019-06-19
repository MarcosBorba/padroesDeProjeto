/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and abrir the template in the editor.
 */
package aplicacaocommand;

/**
 *
 * @author marcos
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Client
        //pretende encapsular em um objeto todos os dados necessários para executar uma determinada ação.
        OperacaoArquivoTexto operacaoArquivoTextoAberto = new OperacaoArquivoTextoAberto(new ArquivoTexto("arquivo1.txt"));
        OperacaoArquivoTexto operacaoArquivoTextoSalvar = new OperacaoArquivoTextoSalvar(new ArquivoTexto("arquivo2.txt"));
        ExecutorOperacaoArquivoTexto executorOperacaoArquivoTexto = new ExecutorOperacaoArquivoTexto();
        System.out.println(executorOperacaoArquivoTexto.executeOperacao(operacaoArquivoTextoAberto));
        System.out.println(executorOperacaoArquivoTexto.executeOperacao(operacaoArquivoTextoSalvar));
        
    }

}
