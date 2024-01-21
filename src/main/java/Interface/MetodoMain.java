/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Jackson
 */
public class MetodoMain {
    public static void main(String[] args) {
        
        //CLASSE Interface
        Conta cp = new Poupanca();
        cp.depositar(732);
        cp.sacar(8);
        cp.getSaldo();
    }
}
