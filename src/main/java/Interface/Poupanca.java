/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Jackson
 */
public class Poupanca implements Conta{
    
    private double saldo;
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
}
