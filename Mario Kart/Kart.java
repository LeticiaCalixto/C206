/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariokart;

/**
 *
 * @author leticia
 */
public class Kart {
    
    // ATRIBUTOS EXPLICITOS
    String nome;
    
    // ATRIBUTO IMPLICITO DA COMPOSICAO
    Motor motor = new Motor();
    Piloto novopiloto;
    
    void pular(){
        System.out.println("O "+ nome+" pulou.");
    }
    
    void soltarTurbo(){
        System.out.println("O "+ nome+" ativou o turbo.");
    }
    
    void fazerDrift(){
        System.out.println("O "+ nome+" fez um drift.");
    }
    
}
