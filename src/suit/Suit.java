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
public class Suit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        Bot bot = new Bot();
       
        human.setSuit();
        bot.setSuit();
        if((human.suitAbjadHuman == 'A' && bot.suitAbjadBot == 'A') || 
            (human.suitAbjadHuman == 'B' && bot.suitAbjadBot == 'B') ||
            (human.suitAbjadHuman == 'C' && bot.suitAbjadBot == 'C')) {
            System.out.println("Seri");
        }
        if((human.suitAbjadHuman == 'A' && bot.suitAbjadBot == 'B') ||
            (human.suitAbjadHuman == 'B' && bot.suitAbjadBot == 'C') || 
            (human.suitAbjadHuman == 'C' && bot.suitAbjadBot == 'A')) {
            System.out.println("Anda Kalah");
        }
        
        if((human.suitAbjadHuman == 'A' && bot.suitAbjadBot == 'C') ||
            (human.suitAbjadHuman == 'B' && bot.suitAbjadBot == 'A') ||
            (human.suitAbjadHuman == 'C' && bot.suitAbjadBot == 'B')) {
            System.out.println("Anda Menang");
        }
    }
    
}
