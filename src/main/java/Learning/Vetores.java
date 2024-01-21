/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Learning;

import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Vetores extends PosEngSoftware{
    
    public void vetor(){        
        int valor;
        //int[] valores = {9,8,7,6,5}; //outra maneira de criar vetores
        int[] vetor = new int[5]; //siza[5]: aqui determina o tamanho
        int a = 0;
        while(a < vetor.length){
            vetor[a]=a; 
            System.out.println("Vetor["+a+"]: "+vetor[a]);
            a++;
        }
    }
    
    
}
