/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocommand;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marcos
 */
public class ExecutorOperacaoArquivoTexto {
    //Invoker
    private final List<OperacaoArquivoTexto> operacoesArquivoTexto = new ArrayList<>();
    
    public String executeOperacao(OperacaoArquivoTexto operacaoArquivoTexto) {
        operacoesArquivoTexto.add(operacaoArquivoTexto);
        return operacaoArquivoTexto.execute();
}
}
