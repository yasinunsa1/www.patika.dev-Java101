/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucgenalanhesaplama;

import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class UcgenAlanHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Üçgenin İlk Kenar Uzunluğunu Giriniz: ");
        a = scanner.nextInt();
        
        System.out.println("Üçgenin İkinci Kenar Uzunluğunu Giriniz: ");
        b = scanner.nextInt();
        
        System.out.println("Üçgenin Üçüncü Kenar Uzunluğunu Giriniz: ");
        c = scanner.nextInt();
        
        double u = (a+b+c)/2;
        
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        
        System.out.println("Üçgenin Alanı: " + alan);
    }
    
}
