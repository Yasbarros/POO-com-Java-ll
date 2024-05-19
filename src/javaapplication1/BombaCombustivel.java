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
public class BombaCombustivel {
    private String tipoCombustivel;
    private Double valorLitro;
    private Double quantidadeCombustivel;
    
    public BombaCombustivel (String tipoCombustivel, Double valorLitro, Double quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
    }
    
    public void abastecerPorValor(Double valor){
        Double combustivelAbastecida = valor / valorLitro;
        if (quantidadeCombustivel >= combustivelAbastecida){
            quantidadeCombustivel -= combustivelAbastecida;
            System.out.println("Abastecido com " + combustivelAbastecida + " litros.");
            System.out.println("Valor: R$" + valor);
        }else{
            System.out.println("Não tem gasolina suficiente.");
    }
       
    /**
     *
     * @param litro
     */
    public void abastecerPorLitro(Double litro){
         if (quantidadeCombustivel >= litro){
            Double valor = valorLitro * litro;
            quantidadeCombustivel -= litro;
            System.out.println("Valor a ser pago R$" + valor);
            System.out.println("Abasteceu com " + litro + " litros");
        }
        else{
            System.out.println("Não tem gasolina suficiente.");
        }
    }
    
    public void alterarValor(Double novoValor){
        this.valorLitro = novoValor;
        
    }
    public String getTipoDeCombustivel(){
        return tipoCombustivel;
    }
    
    public void alterarCombustivel(String novoTipo){
        this.tipoCombustivel = novoTipo;
       
    }
    public void alterarQuantidadeCombustivel( Double novaQuantidade){
        this.quantidadeCombustivel = novaQuantidade;  
    }
    
    public static void main(String[] args) {
        BombaCombustivel carro = new BombaCombustivel("", 3.0, 10.0);
        System.out.println(carro.getTipoDeCombustivel());
        carro.alterarCombustivel("comum");
        carro.abastecerPorLitro(7.0);
        carro.abastecerPorValor(5.0);
        carro.abastecerPorLitro(4.0);
        carro.abastecerPorValor(6.0);
        
        
    }
}


