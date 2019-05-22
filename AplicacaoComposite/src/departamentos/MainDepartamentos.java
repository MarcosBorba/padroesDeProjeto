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
public class MainDepartamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Departamento departamentoVendas = new DepartamentoVendas(1, "departamento de vendas");
        Departamento departamentoFinanceiro = new DepartamentoFinanceiro(2, "departamento financeiro");

        DepartamentoChefe departamentoChefe = new DepartamentoChefe(3, "departamento chefe");

        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.addDepartamento(departamentoFinanceiro);

        departamentoChefe.imprimiNomeDepartamento();
        
        departamentoChefe.removeDepartamento(departamentoVendas);
        
        departamentoChefe.imprimiNomeDepartamento();
        
        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.removeDepartamento(departamentoFinanceiro);
        
        departamentoChefe.imprimiNomeDepartamento();
    }

}
