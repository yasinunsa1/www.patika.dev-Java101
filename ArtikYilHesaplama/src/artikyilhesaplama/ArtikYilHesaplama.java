/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artikyilhesaplama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class ArtikYilHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yil;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        yil = scanner.nextInt();
        
        if(yil%4 == 0){
            if(yil%100==0){
                if(yil%400==0){
                    System.out.println(yil + " Bir Artık Yıldır!");
                }
                else{
                    System.out.println(yil + " Bir Artık Yıl Değildir!");
                }
            }
            else{
                System.out.println(yil + " Bir Artık Yıldır!");
            }
        }
        else{
            System.out.println(yil + " Bir Artık Yıl Değildir!");
        }
    }
    
}
