/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departamentos;

/**
 *
 * @author marcos
 */
public class DepartamentoVendas implements Departamento {

    private Integer id;
    private String nome;

    public DepartamentoVendas(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void imprimiNomeDepartamento() {
        System.out.println("Este é o "+getNome()+".\n");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
