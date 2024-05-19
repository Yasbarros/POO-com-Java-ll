/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Yasmim
 */
public class Retangulo extends Quadrilatero {
    protected Double lado;
    protected Double altura;

    public Retangulo(int lado1, int lado2, int lado3, int lado4) {
        super(lado1, lado2, lado3, lado4);
    }
    
    public Double calcularArea(){
        return lado * altura;
    }
    
    
    public Double calcularPerimetro(){
        return 2*(lado + altura);
       
    }
    
}
