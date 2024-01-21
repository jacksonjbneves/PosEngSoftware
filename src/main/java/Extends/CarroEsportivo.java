/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extends;

/**
 *
 * @author Jackson
 */
public class CarroEsportivo extends Carro{
    // Novo atributo da subclasse
    boolean turbo;

    // Sobrescrevendo o método da superclasse
    @Override
    void acelerar() {
        System.out.println("Carro esportivo acelerando com turbo!");
    }

    // Novo método da subclasse
    void ativarTurbo() {
        turbo = true;
        System.out.println("Turbo ativado!");
    }
    
    public String OutroMeetView(){
        return "Metodo Visivel";
    }

}
