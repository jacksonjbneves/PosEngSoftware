/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package test.posengsoftware;

import javax.swing.JOptionPane;
import Learning.Vetores;
import Learning.Matriz;
import Learning.Class_ArrayList;
import Learning.Objeto_Pessoa;
import Extends.Carro;
import Extends.CarroEsportivo;




/**
 *
 * @author Jackson
 */
public class PosEngSoftware {
    
    public static String Mensagem(){ //sendo static, uma variavel recebe o valor do metodo.
        //System.out.println("Aqui esta a mensagem!");
        return "Aqui esta a mensagem!";
    }

    public static void main(String[] args) {
        
        /*PosEngSoftware instancia = new PosEngSoftware(); //removico OU não, o static no Metodo mensagem()
        System.out.println(instancia.Mensagem());*/
        
        /*String msg = Mensagem(); //com static no Metodo mensagem()
        System.out.println(msg);*/
        
        
        //PosEngSoftware.Mensagem();
        //VETORES
        /*Vetores v = new Vetores();
        v.vetor();*/
        
        //MATRIZ
        /*Matriz m = new Matriz();
        m.Matriz();*/
        
        //ARRAYLIST
        /*Class_ArrayList Lista = new Class_ArrayList();
        Lista.Met_ArrayList();*/
        
        	
        //OBJETO
        /*Objeto_Pessoa objP = new Objeto_Pessoa();
        objP.nome = "Jackson"; //declare public a varivel do Objeto
        System.out.println(objP.MeuNome());
        
        Objeto_Pessoa objAtri = new Objeto_Pessoa("Jackson",31,"120.357.951-88"); //Sobrecarregar os Construtores, podemos ter dois
        System.out.println(objAtri.MeusDados());*/
        
        //USANDO EXTENDS
        /*CarroEsportivo carr = new CarroEsportivo();
        carr.ace*/
              
        /*Carro ck = new Carro();        
        System.out.println(ck.MetodoVisivel());*/
        //ck.OutroMeetView();
       
          
        //System.out.println("Mais uma Qualificação!\nPos-Graduação em Engenharia de Software");
        //String msg = "Mais uma Qualificação!\nPos-Graduação em Engenharia de Software";
        //JOptionPane.showMessageDialog(null, msg, "Carreira",JOptionPane.WARNING_MESSAGE);
    }
}
