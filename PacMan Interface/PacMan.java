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
public class PacMan extends Personagem {
    
    private int pontuacao=0;
    private int vidas=3;
    
    public void perdeVida(){
        vidas--;
    }
    
    public void ganhaPonto(){
        pontuacao++;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
