/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departamentos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcos
 */
public class DepartamentoChefe implements Departamento {

    private Integer id;
    private String nome;

    private List<Departamento> DepartamentoFilhas;

    public DepartamentoChefe(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.DepartamentoFilhas = new ArrayList<Departamento>();
    }

    @Override
    public void imprimiNomeDepartamento() {
        System.out.println("###Imprimindo todos departamentos:###\n");
        DepartamentoFilhas.forEach(Departamento::imprimiNomeDepartamento);
    }

    public void addDepartamento(Departamento departamento) {
        System.out.println("O " + departamento.getClass().getSimpleName() + " foi adicionado.\n");
        DepartamentoFilhas.add(departamento);
    }

    public void removeDepartamento(Departamento departamento) {
        System.out.println("O " + departamento.getClass().getSimpleName() + " foi removido.\n");
        DepartamentoFilhas.remove(departamento);
    }
}
