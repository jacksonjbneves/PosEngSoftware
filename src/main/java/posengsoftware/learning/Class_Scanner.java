/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posengsoftware.learning;

import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class Class_Scanner {
    
    public void Scanner(){
        System.out.println("Digite o seu Nome");
        
        String palavra;
        Scanner entrada = new Scanner(System.in); //pegar as entradas das chars
        palavra = entrada.next(); //aqui vai pegar as chars digitadas
        
        System.out.println("Nome: "+palavra);
    }
    
}
