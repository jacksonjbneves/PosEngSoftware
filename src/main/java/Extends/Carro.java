/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extends;

import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Carro extends PosEngSoftware{
    // Atributos
    String modelo;
    int ano;
    
    // Método
    void acelerar() {
        
        System.out.println("Carro acelerando...");
    }
    
    public String MetodoVisivel(){
        return "Carro acelerando...";
    }

}
