/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implements;

/**
 *
 * @author Jackson
 */
//public class Carro extends Class_Implements implements Veiculo{
public class Carro implements Veiculo{
    // Implementação do método acelerar
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Implementação do método frear
    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void tracao(int rodas) {
        System.out.println("Tração em Rodas: "+rodas);
    }
    // Outros métodos específicos da classe Carro
}
