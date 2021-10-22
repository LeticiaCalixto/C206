/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremadepitagoras;

import java.util.Scanner;

/**
 *
 * @author Leticia
 */
public class TeoremaDePitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         
         // VARIAVEIS
         int x1, x2, y1, y2;
         double dist;
         
         System.out.print("Entre com os valores (x1,y1): ");
         x1 = teclado.nextInt();
         y1 = teclado.nextInt();
         System.out.print("Entre com os valores (x2,y2): ");
         x2 = teclado.nextInt();
         y2 = teclado.nextInt();
         
         // CALCULO DA DISTANCIA
         double deltaX = Math.pow((x2-x1), 2);
         double deltaY = Math.pow((y2-y1), 2);
         dist = Math.sqrt((deltaX + deltaY));
         
         System.out.println("Distancia: " + dist);
         
         // CALCULO DO PONTO MEDIO
         float pontoMedX = (x1+x2)/2; 
         float pontoMedY = (y1+y2)/2; 
         
         int medX = Math.round(pontoMedX); 
         int medY = Math.round(pontoMedY);
         System.out.println("Ponto Médio: (" + medX + " , " + medY + ")" );
        
    }
    
}
