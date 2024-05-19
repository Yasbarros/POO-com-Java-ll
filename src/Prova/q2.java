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
public class q2 {

    
    public static void main(String[] args) {
        Stack <Character> pilha = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma expressão matematica utilizando parenteses: ");
        String resp = input.nextLine();
        boolean errado;
        errado = false;
        int tam = resp.length();
        for (int i = 0; i < tam; i++) {
            if(resp.charAt(i)== '('){
                pilha.add(resp.charAt(i));
            }else if (resp.charAt(i) == ')'){
                if(!pilha.isEmpty()) {
                    pilha.pop();
                }
                else{
                    pilha.add(resp.charAt(i));
                    System.out.println("Os parenteses estão posicionados de forma errada.");
                    pilha.add('a');
                }
            }
            
        }
        if(pilha.isEmpty()){
            System.out.println("A pilha esta vazia");
            System.out.println("Não existem parenteses abertos");
        }else{
            System.out.println("Os parenteses não possui fechamento.");
          }

    }
    
}
