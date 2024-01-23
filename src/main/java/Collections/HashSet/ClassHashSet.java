/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Jackson
 */
public class ClassHashSet {
    
    public static void main(String[] args) {
        /*A Classe HasSet do framework Collections do Java fornce as funcionalidade da estrutura
        de dados da tabela de Hash.*/
        //Podemos acessra, remover e inserir elementos.
        
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
    
        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()){
             System.out.println(it.next());
        }
    }
    
}
