/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toString;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Jackson
 */
public class Main {
    
    public static void main(String[] args){
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");
    
        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);
    
    //Comparar a primeira coma a segunda String
    boolean result = primeira.equals(segunda);
    System.out.println("Primeira é igual a segunda?"+result);
    
    //Comparar a segunda coma a terceira String
    result = segunda.equals(terceira);
    System.out.println("Segunda é igual a terceira?"+result);
    }
}
