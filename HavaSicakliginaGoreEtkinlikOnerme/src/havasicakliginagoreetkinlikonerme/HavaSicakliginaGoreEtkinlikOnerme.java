/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havasicakliginagoreetkinlikonerme;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class HavaSicakliginaGoreEtkinlikOnerme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sicaklik;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz: ");
        sicaklik = scanner.nextInt();
        
        if(sicaklik<5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }
        else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik Yapmaya Gidebilirsiniz.");
        }
        else if(sicaklik>=25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
        
    }
    
}
