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
public class OperacaoArquivoTextoAberto implements OperacaoArquivoTexto {
    //ConcreteCommand
    private final ArquivoTexto arquivoTexto;
    
    public OperacaoArquivoTextoAberto(ArquivoTexto arquivoText) {
        this.arquivoTexto = arquivoText;
    }
    
    @Override
    public String execute() {
        return arquivoTexto.abrir();
}
}
