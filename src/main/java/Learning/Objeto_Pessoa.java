/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Learning;

import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Objeto_Pessoa extends PosEngSoftware{
    
    public String nome; //tem que colocar public se quiser não ter o construtor
    public int idade;
    public String cpf;

    public Objeto_Pessoa(String Nome, int Idade, String CPF) { //CONSTRUTOR QUE RECEBE PARAMETROS PARA TODOS OS ATRIBUTOS,                                                               
        this.nome = Nome;                                      //SOBRECARREGAR
        this.idade = Idade;
        this.cpf = CPF;
    }
    
    public Objeto_Pessoa() {//Sobrecarregar os Construtores, podemos ter dois CONSTRUTORES
           //CONSTRUTOR QUE PODE ADICIONAR OS VALORES DOS ATRIBUTOS UM EM UM OU TODOS
    }
    
    public String MeuNome(){
        //return "Meu Nome é "+this.nome; //tbm funciona
        return "Meu Nome é "+nome;
    }
    
    public String MeusDados(){
        return "Nome: "+nome+" - Idade: "+idade+" - CPF: "+cpf;
    }
}
