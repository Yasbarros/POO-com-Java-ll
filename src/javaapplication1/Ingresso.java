
package javaapplication1;

public class Ingresso{
    protected Double reais;
    
    public Ingresso(){
        this.reais = 10.0;
    }
    public double getReais(){
        return reais;
    }
    
    public void setReais(Double novoValor){
        this.reais = novoValor;
    }
    
    public Double imprimeValor(){
        return reais;
    }
}



