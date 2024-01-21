/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecoes;

import java.util.Scanner;

/**
 * @author Jackson
 */
public class MetodoMain {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Digite um valor");
            int numero1 = s.nextInt();
            System.out.println(numero1);
        } catch (Exception e) {
            System.out.println("Erro - Valor não é um Número");
        }
    }
}
