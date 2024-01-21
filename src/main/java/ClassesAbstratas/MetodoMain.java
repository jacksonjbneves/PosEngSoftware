/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAbstratas;

/**
 *
 * @author Jackson
 */
public class MetodoMain {
    public static void main(String[] args) {
        
        //CLASSE ABSTRATA
        Conta cp = new Poupanca();
        cp.setSaldo(5000);
        cp.imprimeExtrato();
        
    }
}
