/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SobrescritaDeClasse;

/**
 *
 * @author Jackson
 */

class Linguagem{
    public void mostrarInformacao(){
        System.out.println("Lingua Portuguesa");
    }
}

class Java extends Linguagem{
    public void mostrarInformacao(){
        System.out.println("Lingua Java");
    }
}

public class Main {
    
    public static void main(String[] args){
        //Criar um objeto da linguagem Java
        Java j1 = new Java();
        j1.mostrarInformacao();
        
        Linguagem l1 = new Linguagem();
        l1.mostrarInformacao();
    }
    
}
