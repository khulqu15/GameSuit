/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suit;

import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class Human {
    String suitHuman;
    char suitAbjadHuman;
    public void setSuit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Anda : ");
        System.out.println("A. Gunting");
        System.out.println("B. Batu");
        System.out.println("C. Kertas");
        System.out.println("Pilihan anda: ");
        suitAbjadHuman = input.next().charAt(0);
        if(suitAbjadHuman == 'A') {
            suitHuman = "Gunting";
        } else if(suitAbjadHuman == 'B') {
            suitHuman = "Batu";
        } else {
            suitHuman = "Kertas";
        }
        System.out.println("Pilihan Anda " + suitAbjadHuman + ". " + suitHuman);
   } 
}
