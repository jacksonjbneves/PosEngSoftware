/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Learning;

//import java.awt.List; -> 
/*Este pertence ao pacote java.awt e representa uma lista gráfica de itens,
geralmente usada em interfaces gráficas de usuário (GUI) com
AWT (Abstract Window Toolkit). Esta lista é associada a uma
interface de usuário.*/
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jackson
 */
public class Class_List {
    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();
        
        //Adicionando elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        //Imprimindo os elementos da lista
        System.out.println("Lista de números: "+numeros);
        
        // Acessando elementos da lista por índice
        int primeiroNumero = numeros.get(0);
        System.out.println("Primeiro número: " + primeiroNumero);

        // Verificando se a lista contém um elemento específico
        boolean contemNumero20 = numeros.contains(20);
        System.out.println("A lista contém o número 20? " + contemNumero20);

        // Removendo um elemento da lista
        numeros.remove(1);
        System.out.println("Lista após remover o segundo elemento: " + numeros);

        // Iterando sobre os elementos da lista usando um loop for-each
        System.out.print("Elementos da lista: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
