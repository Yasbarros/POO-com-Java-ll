/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.tree.RowMapper;



public class quest4 {

    public static void main(String[] args) throws InterruptedException {
         Queue<String> fila = new ConcurrentLinkedQueue<>();
        List<String> prioridades = new ArrayList<String>(Arrays.asList("Vermelho", "Amarelo", "Verde"));
        Queue<String> vermelho = new ConcurrentLinkedQueue<>();
        Queue<String> amarelo = new ConcurrentLinkedQueue<>();
        Queue<String> verde = new ConcurrentLinkedQueue<>();
        //Adicionando 6 registros
        vermelho.add("VML1");
        amarelo.add("AML1");
        verde.add("VRD1");
        vermelho.add("VML2");
        amarelo.add("AML2");
        verde.add("VRD2");
        String senha;
        int cont_vermelho = 3, cont_amarelo = 3, cont_verde = 3;
        while (true){
           Collections.shuffle(prioridades);
            String prioridade = prioridades.get(0);

            switch(prioridade){
                case "Vermelho":
                    senha = "VML" + Integer.toString(cont_vermelho);
                    vermelho.add(senha);
                    cont_vermelho++;
                    break;

                case "Amarelo":
                    senha = "AML" + Integer.toString(cont_amarelo);
                    amarelo.add(senha);
                    cont_amarelo++;
                    break;

                case "Verde":
                    senha = "VRD" + Integer.toString(cont_verde);
                    verde.add(senha);
                    cont_verde++;
                    break;

            }
            fila.clear();
            // Refaz a prioridade
            for (Object s : vermelho.toArray()){
                fila.add(s.toString());
            }
            for (Object s : amarelo.toArray()){
                fila.add(s.toString());
            }
            for (Object s : verde.toArray()){
                fila.add(s.toString());
            }
           
 //A cada 4 segundos  entra um novo paciente aleatório

Thread.sleep(4000);          System.out.println(Arrays.toString(fila.toArray()));


// A cada 5 segundos (4+1) Ocorre uma consulta

if(!vermelho.isEmpty()){
                vermelho.poll();
                fila.poll();
            }else if (!amarelo.isEmpty()){
                amarelo.poll();
                fila.poll();
            }else if (!verde.isEmpty()){
                
                verde.poll();
                fila.poll();
            }

     

           fila.clear();
            for (Object s : vermelho.toArray()){
                fila.add(s.toString());
            }
            for (Object s : amarelo.toArray()){
                fila.add(s.toString());
            }
            for (Object s : verde.toArray()){
                fila.add(s.toString());
            }            

Thread.sleep(1000);          System.out.println(Arrays.toString(fila.toArray()));
            
            
    }

    }
    
}
