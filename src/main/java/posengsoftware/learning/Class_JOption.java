/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posengsoftware.learning;

import javax.swing.JOptionPane;
import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Class_JOption extends PosEngSoftware{
    public void Met_JOption(){
        int nota = 0;
        
        if(nota >=5 ){
            JOptionPane.showMessageDialog(null, "Aprovado", "Nota",JOptionPane.WARNING_MESSAGE);
        }else{
            if(nota >=3 && nota<=5){
              JOptionPane.showMessageDialog(null, "Fazer Exame", "Nota",JOptionPane.WARNING_MESSAGE);
            }else{
              JOptionPane.showMessageDialog(null, "Reprovado", "Nota",JOptionPane.WARNING_MESSAGE);
            }
            if(nota == 0){
              JOptionPane.showMessageDialog(null, "Reprovado[ZERO]", "Nota",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
