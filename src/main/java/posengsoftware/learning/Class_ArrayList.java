/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posengsoftware.learning;

import java.util.ArrayList;
import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Class_ArrayList extends PosEngSoftware {
    
    public void Met_ArrayList(){
        ArrayList<String> estados = new ArrayList<>();    
        estados.add("Espirito Santo");
        estados.add("Ceara");
        estados.add("Rio de Janeiro");
        estados.add("Pernambuco");
        
        System.out.println(estados);
        
        //Susbtituir os valores dos indices        
        estados.add(estados.indexOf("Ceara"),"Pará");        
        System.out.println(estados);
        
        //Remover valores pelo valor
        estados.remove("Rio de Janeiro");
        System.out.println(estados);
    }
    
    
}
