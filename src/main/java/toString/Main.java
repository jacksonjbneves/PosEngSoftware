/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toString;

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




    import java.util.Vector;

    public class ExemploVector {
        public static void main(String[] args) {
            // Declaração e instanciação
            Vector<String> vectorDeNomes = new Vector<>();
    
            // Adição de elementos
            vectorDeNomes.add("Alice");
            vectorDeNomes.add("Bob");
            vectorDeNomes.add("Charlie");
    
            // Inserção de um elemento na posição 1
            vectorDeNomes.add(1, "David");
    
            // Acesso a elementos
            String nome = vectorDeNomes.get(2);
            System.out.println("Nome na posição 2: " + nome);
    
            // Remoção de um elemento
            vectorDeNomes.remove("Bob");
    
            // Tamanho do Vector
            int tamanho = vectorDeNomes.size();
            System.out.println("Tamanho do vector: " + tamanho);
    
            // Iteração sobre elementos
            for (String elemento : vectorDeNomes) {
                System.out.println(elemento);
            }
        }
    }










    }
}
