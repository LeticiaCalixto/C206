/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leticia
 */
public class CampoMinado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] campo = new int[3][3];
        String[][] campo1 = new String[3][3];

        // Todo o campo fica sem bomba
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                campo[i][j] = 0;
            }
        }

        // Todo o campo fica sem bomba
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                campo1[i][j] = " X ";
            }
        }

        // Coloca bomba em um lugar aleatorio
        Random ale = new Random();
        int linha = ale.nextInt(3);
        int coluna = ale.nextInt(3);

        campo[linha][coluna] = 1;

        // Mostra para o jogador o campo escondido
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" X ");
            }
            System.out.println("");
        }

        /*
        // Mostra onde esta a bomba
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + campo[i][j]);
            }
            System.out.println("");
        }*/

        // Recebe do jogador a posicao da tentativa
        System.out.println("Escolha uma posicao: ");
        Scanner valorTeclado = new Scanner(System.in);
        int cont = 0;
        int l = valorTeclado.nextInt();
        int c = valorTeclado.nextInt();

        // Verifica o que tem na posicao
        while (cont < 7 && campo[l][c] == 0) {
           
            System.out.println("Muito bom!");
            cont++;

            campo1[l][c] = " 0 ";

            //  Mostra os lugares desbloquados
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + campo1[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("Escolha uma nova posicao: ");
            l = valorTeclado.nextInt();
            c = valorTeclado.nextInt();

        }

        // Achou a bomba
        if (cont < 7) {
            System.out.println("BOOOOM! X( GAME OVER!");
        } else {
            System.out.println("Parabens, voce ZEROU o jogo");
        }

        //  Mostra onde estava a bomba
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + campo[i][j]);
            }
            System.out.println("");
        }

    }

}