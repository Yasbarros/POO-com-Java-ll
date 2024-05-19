/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Teste de Ingresso");
        System.out.println("Digite:\n1- Para Ingresso Normal\n2- Para Ingresso VIP");
        int ingressoTipo = input.nextInt();
        while (!(ingressoTipo == 1 || ingressoTipo == 2)){
            System.out.println("Digite novamente: ");
            ingressoTipo = input.nextInt();
        }
        if (ingressoTipo == 1){
            Normal ingressoN = new Normal();
            System.out.println("INGRESSO NORMAL");
            System.out.println("O valor do ingresso é: " + ingressoN.getReais());
        }else{
            System.out.println("INGRESSO VIP");
            System.out.println("Digite:\n1- Para Camarote Superior\n2- Para Camarote Inferior");
            int ingressoVip = input.nextInt();
            while (!(ingressoVip == 1 || ingressoVip == 2)){
                System.out.println("Digite novamente: ");
                ingressoVip = input.nextInt();
            }
            if (ingressoVip == 1){
                camaroteSuperior camaSup = new camaroteSuperior();
                System.out.println("Tipo: Camarote Superior\nValor:" + camaSup.imprimeValor());
            } else{
                camaroteInferior camaInf = new camaroteInferior();
                System.out.println("Tipo: Camarote Inferior\nValor:" + camaInf.imprimeValor());
                            }
        }
    }


    }
