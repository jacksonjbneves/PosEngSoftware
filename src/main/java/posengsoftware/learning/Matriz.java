/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posengsoftware.learning;

import test.posengsoftware.PosEngSoftware;

/**
 *
 * @author Jackson
 */
public class Matriz extends PosEngSoftware{
    
    public void Matriz(){
        int[][]mtz = new int[3][3];
        int valor = 1;
        //como pegar o size da linha e da coluna?
        for(int ln=0;ln<=2;ln++){
            for(int col=0;col<=2;col++){
                mtz[ln][col] = valor;
                System.out.println("Matriz["+ln+"]["+col+"]: "+mtz[ln][col]);
                valor++;
            }
        }
    }
    
    //OBS: POSSO TER MATRIZ DE TRES DIMENSÕES:
    int[][][] array3D = new int[2][3][5];
    
    /*Em Java, a quantidade de dimensões que uma matriz pode ter é teoricamente ilimitada,
    mas na prática, você estará limitado pela quantidade de memória disponível no sistema e 
    pela eficiência do seu programa. No entanto, em situações práticas, matrizes com mais
    de três dimensões são relativamente raras.

    Em geral, a maioria dos problemas pode ser resolvida utilizando matrizes de 
    uma, duas ou, no máximo, três dimensões. O uso de matrizes com mais de três 
    dimensões pode tornar o código difícil de entender e manter.

    A sintaxe para declaração de matrizes em Java é simplesmente aninhar os colchetes,
    como mostrado nos exemplos a seguir:*/

    /*Uma dimensão:*/ int[] array1D = new int[5];
    /*Duas dimensões:*/ int[][] array2D = new int[3][4];
    /*Três dimensões:*/ int[][][] Array3D = new int[2][3][5];
    
    /*Você pode continuar adicionando mais colchetes para adicionar mais dimensões, mas a
    leitura e compreensão do código podem se tornar desafiadoras. Em muitos casos, é mais
    prático usar estruturas de dados mais complexas, como listas aninhadas ou outras
    estruturas de dados mais avançadas, dependendo do problema específico que você está resolvendo.*/
    
    
}
