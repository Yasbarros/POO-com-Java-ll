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
public class Velho extends Imovel{
    public Double desconto;
    
    public void getDesconto(Double novoDesconto){
        desconto = novoDesconto;
    }
    public Double setDesconto(){
        return desconto;
    }
    
    public void Impressão(Double preco){
        this.desconto = preco*this.preço;
        System.out.println("Valor é:" + (this.desconto + this.preço));
       
    }   
}
