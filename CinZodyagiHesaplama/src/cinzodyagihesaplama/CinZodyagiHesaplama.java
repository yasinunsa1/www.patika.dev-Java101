/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinzodyagihesaplama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class CinZodyagiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dogumYili;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Doğum Yılınızı Giriniz: ");
        dogumYili = scanner.nextInt();
        
        int kalan = dogumYili%12;
        String burc = null;
        
        switch(kalan){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
    
}
