/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocommand;

/**
 *
 * @author marcos
 */
public class OperacaoArquivoTextoLer implements OperacaoArquivoTexto {
    //ConcreteCommand
    private final ArquivoTexto arquivoTexto;
    
    public OperacaoArquivoTextoLer(ArquivoTexto arquivoText) {
        this.arquivoTexto = arquivoText;
    }
    
    @Override
    public String execute() {
        return arquivoTexto.ler();
}
}
