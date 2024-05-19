/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author User
 */
public class q3 {

    
    public static void main(String[] args) {
        int op = 1;
        int numFila = 1;
        int numPrioridade = 1;
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        Queue<String> fila_normal = new ConcurrentLinkedQueue<>();
        Queue<String> prioridade = new ConcurrentLinkedQueue<>();
        do {            
            System.out.println("\t1 - Gerar Senha Normal\n"
                    + "\t2 - Gerar Senha Prioritária\n"
                    + "\t3 - Chamar Senha\n"
                    + "\t4 - Sair\n");
            op = sc.nextInt();
            switch(op){
                case 1:
                    String senha = "NOR" + Integer.toString(numFila);
                    System.out.println("Senha criada: " + senha);
                    fila_normal.add(senha);
                    numFila++;
                    System.out.println("Adicionada na fila\n");
                    break;
                case 2:
                    String senha_prioridade = "NPR" + Integer.toString(numPrioridade);
                    System.out.println("Senha criada: " + senha_prioridade);
                    prioridade.add(senha_prioridade);
                    numPrioridade++;
                    System.out.println("Adicionada na fila\n");
                    break;
                case 3:
                    if(!prioridade.isEmpty()){
                        System.out.println("Senha chamada:");
                        if(contador <= 3){
                        System.out.println(prioridade.poll());
                        contador++;
                        }else{
                            contador = 1;
                            if(!fila_normal.isEmpty()){
                                System.out.println(fila_normal.poll());
                            }else{
                                System.out.println(prioridade.poll());
                            }  
                        }
                    } else{
                        if(!fila_normal.isEmpty()){
                            System.out.println(fila_normal.poll());
                            
                        }else{
                            System.out.println("Ambas as filas estão vazias");
     
                        }
                    }
                    break;
                    
                
                case 4:
                    System.out.println("Adeus");
                    break;
                
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 4);
    }
    
}
