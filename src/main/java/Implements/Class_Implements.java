/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implements;

/**
 *
 * @author Jackson
 */
public class Class_Implements {
    public static void main(String[] args) {
        //Implementes: Adicionar(implementa) as Interfaces
        Veiculo meuCarro = new Carro(); //Polimorfismo
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.tracao(4);
    }
    
}
