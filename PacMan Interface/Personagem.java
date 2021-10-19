/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacmaninterface;

/**
 *
 * @author Leticia
 */

// ESTA CLASSE EH ABSTRATA, POIS NAO DAZ SENTIDO TER
// OBJETOS DE PERSONAGENS, MAS SIM OBJETOS DE PACMAN E INIMIGO
public abstract class Personagem implements Movel {

    protected String cor;
    protected int posicaoX;
    protected int posicaoY;
    
    

    @Override
    public void MovePraCima() {
        if(posicaoY < 14){
            posicaoY++;
        }
    }

    @Override
    public void MovePraBaixo() {
        if(posicaoY > 0){
            posicaoY--;
        }
    }

    @Override
    public void MovePraEsquerda() {
        if(posicaoX > 0){
            posicaoX--;
        }
    }

    @Override
    public void MovePraDireita() {
        if(posicaoX < 19){
            posicaoX++;
        }
    }
    
}
