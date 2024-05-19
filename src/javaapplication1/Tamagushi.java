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
public class Tamagushi {
     private String nome;
    private Double fome = 100.0;
    private Double tedio = 100.0;
    private int idade;

    public Tamagushi(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public Double getFome() {
        return fome;
    }


    public Double getTedio() {
        return tedio;
    }


    public int getIdade() {
        return idade;
    }

    public void alterarIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
    }
    
    
    public void alimentar(int unidadesComida){
        if (unidadesComida > 0){

    System.out.printf("Voce alimentou" + this.nome);
            if (fome - unidadesComida >= 0){
                fome -= unidadesComida;
            }else{
                fome = 0.0; 
            }
        }
    }
    
 
    public void brincar(int minutos){
        if (minutos > 0){
            System.out.printf("Você brincou com" + this.nome);
            if (tedio - minutos >= 0){
                tedio -= minutos;
            }else{
                tedio = 0.0;             }
        }
    }
    
    public Double retornaHumor(){
        Double humor = 100.0 - ((this.tedio + this.fome)/2);
        return humor;
    }
 public static void main (String []args){
     Tamagushi bicho = new Tamagushi("Dante", 5);
     bicho.alterarIdade(7);
     bicho.getFome();
     bicho.alimentar(5);
     bicho.getTedio();
     bicho.brincar(4);
     bicho.retornaHumor();
 }
}
