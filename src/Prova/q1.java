/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class q1 {

        public static void main(String[] args) {
        Stack<Character> frase_original = new Stack<>();
        Stack<Character> reverso = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é palíndromo");
        String palavra = sc.nextLine().toUpperCase();
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho; i++){
            frase_original.add(palavra.charAt(i));
        }
        int tamanho_pilha = frase_original.size();
        int metade = tamanho_pilha / 2;
        for (int i = 1; i <= metade; i++){
            reverso.add(frase_original.pop());
        }
        if (tamanho_pilha % 2 != 0){
            frase_original.pop();
        }
        if (frase_original.equals(reverso)){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo.");
        }
        
   
        
        /*for (Object c : pilha.toArray()){
            System.out.println(c);
        }*/
    }
    
}
