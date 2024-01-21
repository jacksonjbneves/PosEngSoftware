/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Desenvolvimento
 */
public class ClassMain {
    public static void main(String[] args){
    LinkedList<String> animais = new LinkedList<>();
    
    animais.add("Cachorro");
    animais.add("Cavalo");
    animais.add("Vaca");
    //Vai mostrar os valores dos indices da LinkedList
    System.out.println("LinkedList: "+animais);
    
    //Add indice na posição com novo valor, porem permanece os outros valores, sem perder eles
    animais.add(1,"Gato");
    System.out.println("LinkedList: "+animais);
    
    
    }
}
