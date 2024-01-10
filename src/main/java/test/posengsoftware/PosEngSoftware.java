/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package test.posengsoftware;

import javax.swing.JOptionPane;

/**
 *
 * @author Jackson
 */
public class PosEngSoftware {
    
    public static void Mensagem(){
        System.out.println("Aqui esta a mensagem!");
    }

    public static void main(String[] args) {
        
        PosEngSoftware.Mensagem();
        
        /*PosEngSoftware instancia = new PosEngSoftware();
        instancia.Mensagem();*/
                
        int x=4, y=8, r=1;
        for(int i=0; i<x; i++){
             //r = r + y;
             r = r * y;
             System.out.println(r);
        }
        System.out.println(r);
        
        //System.out.println("Mais uma Qualificação!\nPos-Graduação em Engenharia de Software");
        //String msg = "Mais uma Qualificação!\nPos-Graduação em Engenharia de Software";
        //JOptionPane.showMessageDialog(null, msg, "Carreira",JOptionPane.WARNING_MESSAGE);
        
        int nota = 0;
        int nada;
        if(nota >=5 ){
            //JOptionPane.showMessageDialog(null, "Aprovado", "Nota",JOptionPane.WARNING_MESSAGE);
        }else
            if(nota >=3 && nota<=5){
                //JOptionPane.showMessageDialog(null, "Fazer Exame", "Nota",JOptionPane.WARNING_MESSAGE);
            }else{
                //JOptionPane.showMessageDialog(null, "Reprovado", "Nota",JOptionPane.WARNING_MESSAGE);
            }
            if(nota == 0){
               // JOptionPane.showMessageDialog(null, "Reprovado[ZERO]", "Nota",JOptionPane.WARNING_MESSAGE);
            }                
            
            int ano = 2000;
            if(((ano % 4) == 0 || (ano%100)>0) || ((ano%400) == 0)){
            }
            
    }
    
}
