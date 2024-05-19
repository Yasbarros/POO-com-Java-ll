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
public class Novo extends Imovel{
    public  Double novoPreco;
    
    public Double getValor(){
        return novoPreco;
    }
    
    public Double setValor(){
        return novoPreco;
    }
    
    public void Impressão(Double preco){
        this.novoPreco = preco * this.preço;
        System.out.println("Novo valor" + (this.novoPreco + this.preço));
    }   
}
