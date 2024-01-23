/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections.TreeSet;

import java.util.TreeSet;

/**
 *
 * @author Jackson
 */
public class ClassTreeSet {
    public static void main(String[] args) {
        /*A Classe TreeSet do framework collections de Java fornece a funcionalidade
        de uma estrutura de dados em Árvore.*/
        //Podemos acessar, remover e inserir elementos.
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(8);
        numeros.add(6);
        numeros.add(9);
        System.out.println("TreeSet: "+numeros);
        
        boolean result1 = numeros.remove(6); //true
        boolean result2 = numeros.remove(61); //false
        System.out.println("Removeu??? "+result1);
        System.out.println("Removeu??? "+result2);
        
        boolean result = numeros.removeAll(numeros);
        System.out.println("TreeSet: "+result);
    }
}
