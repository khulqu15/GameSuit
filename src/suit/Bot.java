/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suit;

/**
 *
 * @author khusn
 */
public class Bot {
    String suitBot;
    char suitAbjadBot;
    public void setSuit() {
        double rand = Math.random()*9;
        if(rand >= 0 && rand <= 3) {
            suitBot = "Gunting";
            suitAbjadBot = 'A';
        } else if(rand > 3 && rand <= 6) {
            suitBot = "Batu";
            suitAbjadBot = 'B';
        } else {
            suitBot = "Kertas";
            suitAbjadBot = 'C';
        }
        System.out.println("Bot memilih : " + suitAbjadBot + ". " + suitBot);
    }
}
