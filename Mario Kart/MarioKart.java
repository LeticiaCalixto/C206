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
public class MarioKart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kart carro1 = new Kart();
        carro1.nome = "Standard"; 
        carro1.motor.cilindradas = "150";
        carro1.motor.velocidadeMaxima = 150;
        
        Piloto p1 = new Piloto();
        p1.nome = "Mario";
        p1.vilao = false;
        
        carro1.novopiloto = p1;
        
        Kart carro2 = new Kart();
        carro2.nome = "Egg1";
        carro2.motor.cilindradas = "100";
        carro2.motor.velocidadeMaxima = 120;
        
        Piloto p2 = new Piloto();
        p2.nome = "Yoshi";
        p2.vilao = false;
        
        carro2.novopiloto = p2;
        
        Kart carro3 = new Kart();
        carro3.nome = "Sprinter";
        carro3.motor.cilindradas = "50";
        carro3.motor.velocidadeMaxima = 90;
        
        Piloto p3 = new Piloto();
        p3.nome = "Bowser";
        p3.vilao = true;
        
        carro3.novopiloto = p3;
        
        p1.soltaSuperPoder();
        carro2.soltarTurbo();
        p3.soltaSuperPoder();
        carro1.pular();
        carro3.fazerDrift();
    }
    
}
