/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetEmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author User
 */
public class NumeroNaoRepetidas {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Escreva uma frase");
            String frase = input.nextLine();
            Set<String> palavras = new HashSet<>();
            palavras.addAll(Arrays.asList(frase.split(" ")));
            System.out.println("O numero de palavras não repetidas:");
            System.out.println(palavras.size() - (frase.split(" ").length - palavras.size()));        
    }

    
}
