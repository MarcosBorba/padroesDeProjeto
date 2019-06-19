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
public class ArquivoTexto {
    //receiver
    private final String nome;
    
    public ArquivoTexto(String nome) {
        this.nome = nome;
    }
    
    public String abrir() {
        return "Abrindo arquivo " + nome;
    }
    
    public String ler() {  
        return "Lendo arquivo " + nome;
    }
    
    public String escrever() {  
        return "Escrevendo para arquivo " + nome;
    }
    
    public String salvar() {  
        return "Salvando arquivo " + nome;
    }
    
    public String copiar() {  
        return "Copiando arquivo " + nome;
    }
    
    public String colar() {  
        return "Colando arquivo " + nome;
}
}
