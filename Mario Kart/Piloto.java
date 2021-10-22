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
public class Piloto {
    
    String nome;
    boolean vilao;
    
    void soltaSuperPoder(){
        if(vilao==true){
            System.out.println("O vilao "+ nome+ " soltou um Super Poder.");
        }
        else{
            System.out.println("O piloto "+ nome+ " soltou um Super Poder.");
        }
    }
}
