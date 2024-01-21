/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAbstratas;

/**
 *
 * @author Jackson
 */
public class Poupanca extends Conta{
    
    public void imprimeExtrato(){
        System.out.println("Saldo: "+this.getSaldo());
    }
}
