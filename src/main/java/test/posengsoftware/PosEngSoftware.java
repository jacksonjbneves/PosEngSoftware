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
import java.util.ArrayList;
import java.util.stream.DoubleStream;




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
        
        //Tamanho
        //String frase = "Aplicando e Absorvendo novos conhecimentos em Java";
        
        //Comprimento
        /*
        ArrayList<String> ff = new ArrayList<>();
        ff.add("Aplicando e Absorvendo novos conhecimentos em Java");
        ff.add("FrameWork Spring");
        ff.add("JK");
        System.out.println("Quantidade de Indices: "+ff.size());
        String qtChars = ff.get(1);
        System.out.println("Indice["+ff.indexOf("FrameWork Spring")+"] - Quantidade de Chars: "+qtChars.length());
        
        System.out.println("Array "+ff);
        //ff.clear(); //Apaga todos
        System.out.println(ff.contains("JK"));
        System.out.println("Array Agora"+ff);
        
        String frase = "12345";
        System.out.println("Tamanho: "+frase.length());
        
        ArrayList<Integer> lista = new ArrayList<>();
           for(int i=0; i<8; i++)
              lista.add(i, i+1); //aqui adicionar o nome do indice e o valor
           System.out.println(lista);
           System.out.println(lista.get(4));        
        */
        
        ArrayList<Integer> lista = new ArrayList<>();
           for(int i=0; i<8; i++)
              lista.add(i, i+1);
           System.out.println(lista);
           System.out.println(lista.get(4));
        
        //Juntando Duas Strings
        /*
        String tx01 = "Meu Nome";
        String tx02 = " é Jackson";
        System.out.println("Juntas Duas Strings: "+tx01.concat(tx02)); */
    
        //Compara duas Variaveis do Tipo String - não funcionar com Numeros
        /*
        String a = "10";
        String b = "10";
        if(a.equals(b)){
          System.out.println("São Iguais");
        }else{
          System.out.println("Não São Iguais");
        }*/
        
        
        /*O método substring() em Java é usado para extrair uma parte de
        uma string. Ele permite que você crie uma nova string que é uma
        subcadeia da string original, começando em um índice específico e
        indo até o final ou até um índice específico.*/
        
        /*String originalString = "Hello, World!";
        
        // Extraindo uma subcadeia começando no índice 7 até o final
        String substring1 = originalString.substring(7);
        System.out.println("Substring1: " + substring1); // Resultado: "World!"

        // Extraindo uma subcadeia começando no índice 0 até o índice 5 (não incluído)
        String substring2 = originalString.substring(0, 5);
        System.out.println("Substring2: " + substring2); // Resultado: "Hello"
        */
        
        
        
        /*O método contains() em Java é utilizado para verificar se uma
        determinada sequência de caracteres (substring) está presente em
        uma string. Ele retorna um valor booleano indicando se a substring
        está contida ou não na string original.*/
        /*
        String originalString = "Hello, World!";

        // Verificando se a string contém a substring "World"
        boolean containsSubstring1 = originalString.contains("World");
        System.out.println("Contém 'World': " + containsSubstring1); // Resultado: true

        // Verificando se a string contém a substring "Java"
        boolean containsSubstring2 = originalString.contains("Java");
        System.out.println("Contém 'Java': " + containsSubstring2); // Resultado: false
        */
        
        /*O método replace() em Java é usado para substituir todas as 
        ocorrências de um caractere ou de uma substring por outra 
        dentro de uma string.*/
        /*
        String originalString = "Hello, World!";
        String replacedString = originalString.replace('o', '0');
        System.out.println("Substituído 'o' por '0': " + replacedString); 
        // Resultado: Hell0, W0rld!
        
        originalString = "Hello, World!";
        replacedString = originalString.replace("World", "Java");
        System.out.println("Substituído 'World' por 'Java': " + replacedString);
        // Resultado: Hello, Java!
        */
        
        
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
