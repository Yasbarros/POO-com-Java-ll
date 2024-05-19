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
public class camaroteInferior extends Vip{
    private String localizacao;
    
    public camaroteInferior(){
        localizacao = "Setor1";
        reais += 20.00;
    }
    
    public String getLocalização(){
        return localizacao;
    }
    
    
    public void setLocalizacao(String novaLocalizacao){
        localizacao = novaLocalizacao;
    }
    
   }
