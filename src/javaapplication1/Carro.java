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
public class Carro {
    
    private Double consumo;
    private Double combustivel = 0.0;

    public Carro(Double consumo) {
        this.consumo = consumo;
    }
    
    public void adicionarGasolina(Double litros){
        if (litros > 0){
            combustivel += litros;
        }
    }
    public void andar(Double km){
        Double litrosGastos = km / consumo;
        if(combustivel >= litrosGastos){
            combustivel -= litrosGastos;
            System.out.println("Percurso de" + km + "km.");
            System.out.println(combustivel);
        }else{
            System.out.println("Voce precisa abastecer!.");
        }
    }

    public Double obterCombustivel() {
        return combustivel;
    }
    
    public static void main(String[] args) {
        Carro fiat = new Carro(15.0);
        fiat.adicionarGasolina(2.0);
        fiat.andar(15.0);
        fiat.andar(5.0);
        System.out.println(fiat.obterCombustivel());
        fiat.adicionarGasolina(6.0);
        System.out.println(fiat.obterCombustivel());
    }
    

}


