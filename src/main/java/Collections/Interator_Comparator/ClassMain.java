/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections.Interator_Comparator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Desenvolvimento
 */
public class ClassMain {
    
    public static void main(String[] args){
    
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(3);
    numeros.add(2);
    
    System.out.println("ArrayList: "+numeros);
    
    //Criando uma instancia de Iterator
    Iterator<Integer> it = numeros.iterator();
    
    //Aqui vai monstrar um elemento da ArrayList
    int numero = it.next();
    System.out.println("Elemento: "+numero);
    
    //Aqui vai mostrar o resto dos elemtnos que falta a ser percorrido da ArrayList
    while(it.hasNext()){
      it.forEachRemaining((value) -> System.out.println(value+", "));
    }
    
    }
    
}
