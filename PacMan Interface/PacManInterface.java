/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmaninterface;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Leticia
 */
public class PacManInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Inimigo fantasma1 = new Inimigo();
        Inimigo fantasma2 = new Inimigo();
        Inimigo fantasma3 = new Inimigo();
        Inimigo fantasma4 = new Inimigo();
        PacMan  pacman = new PacMan();

        // FORMAS DOS PERSONAGENS
        fantasma1.cor = " ☻ ";
        fantasma2.cor = " ☻ ";
        fantasma3.cor = " ☻ ";
        fantasma4.cor = " ☻ ";
        pacman.cor = " ☺ ";

        // CRIANDO O CAMPO
        String[][] Campo = new String[15][20];

        // TODO O CAMPO FICA COM •
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 20; j++) {
                Campo[i][j] = "  • ";
            }
        }

        // COLOCANDO OS PERSONAGENS NO CAMPO
        fantasma1.posicaoY = 0;
        fantasma1.posicaoX = 0;
        fantasma2.posicaoY = 14;
        fantasma2.posicaoX = 0;
        fantasma3.posicaoY = 0;
        fantasma3.posicaoX = 19;
        fantasma4.posicaoY = 14;
        fantasma4.posicaoX = 19;
        pacman.posicaoY = 7;
        pacman.posicaoX = 10;

        // NUMEROS ALEATORIOS PARA ESCOLHER O MOVIMENTO DOS PERSONAGENS
        Random ale1 = new Random();
        Random ale2 = new Random();
        Random ale3 = new Random();
        Random ale4 = new Random();
        Random ale5 = new Random();
       

        while (pacman.getVidas() > 0) { 

            // MOVIMENTO FANTASMA 1
            int movimento1 = ale1.nextInt(4);

            switch (movimento1) {
                case 0:
                    fantasma1.MovePraBaixo();
                    break;
                case 1:
                    fantasma1.MovePraCima();
                    break;
                case 2:
                    fantasma1.MovePraDireita();
                    break;
                case 3:
                    fantasma1.MovePraEsquerda();
                    break;
            }

            // MOVIMENTO FANTASMA 2
            int movimento2 = ale2.nextInt(4);

            switch (movimento2) {
                case 0:
                    fantasma2.MovePraBaixo();
                    break;
                case 1:
                    fantasma2.MovePraCima();
                    break;
                case 2:
                    fantasma2.MovePraDireita();
                    break;
                case 3:
                    fantasma2.MovePraEsquerda();
                    break;
            }

            // MOVIMENTO FANTASMA 3
            int movimento3 = ale3.nextInt(4);

            switch (movimento3) {
                case 0:
                    fantasma3.MovePraBaixo();
                    break;
                case 1:
                    fantasma3.MovePraCima();
                    break;
                case 2:
                    fantasma3.MovePraDireita();
                    break;
                case 3:
                    fantasma3.MovePraEsquerda();
                    break;
            }

            // MOVIMENTO FANTASMA 4
            int movimento4 = ale4.nextInt(4);

            switch (movimento4) {
                case 0:
                    fantasma4.MovePraBaixo();
                    break;
                case 1:
                    fantasma4.MovePraCima();
                    break;
                case 2:
                    fantasma4.MovePraDireita();
                    break;
                case 3:
                    fantasma4.MovePraEsquerda();
                    break;
            }

            // MOVIMENTO PACMAN
            int movimento5 = ale5.nextInt(4);

            switch (movimento5) {
                case 0:
                    pacman.MovePraBaixo();
                    if(Campo[pacman.posicaoY][pacman.posicaoX] == "  • "){
                        pacman.ganhaPonto();
                    }
                    break;
                case 1:
                    pacman.MovePraCima();
                    if(Campo[pacman.posicaoY][pacman.posicaoX] == "  • "){
                        pacman.ganhaPonto();
                    }
                    break;
                case 2:
                    pacman.MovePraDireita();
                    if(Campo[pacman.posicaoY][pacman.posicaoX] == "  • "){
                        pacman.ganhaPonto();
                    }
                    break;
                case 3:
                    pacman.MovePraEsquerda();
                    if(Campo[pacman.posicaoY][pacman.posicaoX] == "  • "){
                        pacman.ganhaPonto();
                    }
                    break;
            }
            
            // VERIFICANDO SE O PACMAN ENCONTROU ALGUM FANTASMA
            if(fantasma1.posicaoX == pacman.posicaoX && fantasma1.posicaoY == pacman.posicaoY){
                pacman.perdeVida();
            }
            
            if(fantasma2.posicaoX == pacman.posicaoX && fantasma2.posicaoY == pacman.posicaoY){
                pacman.perdeVida();
            }
            
            if(fantasma3.posicaoX == pacman.posicaoX && fantasma3.posicaoY == pacman.posicaoY){
                pacman.perdeVida();
            }
            
            if(fantasma4.posicaoX == pacman.posicaoX && fantasma4.posicaoY == pacman.posicaoY){
                pacman.perdeVida();
            }
            
            // MOVENDO OS PERSONAGENS PARA O NOVO LUGAR
            Campo[fantasma1.posicaoY][fantasma1.posicaoX] = fantasma1.cor;
            Campo[fantasma2.posicaoY][fantasma2.posicaoX] = fantasma2.cor;
            Campo[fantasma3.posicaoY][fantasma3.posicaoX] = fantasma3.cor;
            Campo[fantasma4.posicaoY][fantasma4.posicaoX] = fantasma4.cor;
            Campo[pacman.posicaoY][pacman.posicaoX] = pacman.cor;

            // MENSAGEM PARA O USUÁRIO
            System.out.println("Pressione ENTER para movimentar: ");
            System.out.println("\n");
            
            // MOSTRA O CAMPO
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(" " + Campo[i][j]);
                }
                System.out.println("");
            }
            
            // MOSTRA PONTUACAO
            System.out.println("Pontuacao: " + pacman.getPontuacao() + "   Vidas: " + pacman.getVidas());
           
            // DEPOIS QUE O FANTASMA PASSA, VOLTA O PONTO
            Campo[fantasma1.posicaoY][fantasma1.posicaoX] = "  • ";
            Campo[fantasma2.posicaoY][fantasma2.posicaoX] = "  • ";
            Campo[fantasma3.posicaoY][fantasma3.posicaoX] = "  • ";
            Campo[fantasma4.posicaoY][fantasma4.posicaoX] = "  • ";
            Campo[pacman.posicaoY][pacman.posicaoX] = "    ";
            
            // APERTAR PARA CADA RODADA
            System.in.read();

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");

        }
        
        System.out.println(" -------------------------------------------------------------");
        System.out.println("|                                                            |");
        System.out.println("|     ______    ____    ___  ___    _____                    |");
        System.out.println("|    |         |    |  |   ||   |  |                         |");
        System.out.println("|    |   ___   |____|  |   ||   |  |___                      |");
        System.out.println("|    |      |  |    |  |        |  |                         |");
        System.out.println("|    |______|  |    |  |        |  |_____                    |");
        System.out.println("|                                                            |");
        System.out.println("|                  _____          _____   _____              |");
        System.out.println("|                 |     | |    | |       |     |             |");
        System.out.println("|                 |     | |    | |___    |_____|             |");
        System.out.println("|                 |     | |    | |       |    |              |");
        System.out.println("|                 |_____| |____| |_____  |     |             |");
        System.out.println("|                                                            |");
        System.out.println("|     Pontuacao: " + pacman.getPontuacao() + "                                         |");
        System.out.println(" -------------------------------------------------------------");
        

    }

}
