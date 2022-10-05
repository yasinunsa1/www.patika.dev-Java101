/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, select;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İlk Sayıyı Giriniz: ");
        n1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        n2 = scanner.nextInt();
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = scanner.nextInt();
        
        switch(select){
            case 1:
                System.out.println("Toplama: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1/n2));
                break;
        }
    }
    
}
