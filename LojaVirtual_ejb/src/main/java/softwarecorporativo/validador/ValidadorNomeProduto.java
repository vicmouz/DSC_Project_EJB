/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.validador;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author victor
 */
public class ValidadorNomeProduto implements ConstraintValidator<ValidaPais, String>{
    private String nome;
    
    @Override
    public void initialize(ValidaPais validaPais) {
        this.nome = "";
    }
    
    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {
        this.nome = valor;
        System.out.println("===============================================");
        System.out.println("Valor: " + valor);
        System.out.println("Nome: " + nome);
        System.out.println("===============================================");
        return valor == null ? false : nome.matches("[a-zA-Z]+");
    }
    
}
