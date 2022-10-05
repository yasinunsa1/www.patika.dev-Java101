/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairealancevre;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class DaireAlanCevre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yariCap;
        int merkezAci;
        double pi = 3.14;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dairenin Yarı Çapını Giriniz: ");
        yariCap = scanner.nextInt();
        
        System.out.println("Dairenin Merkez Açısını Giriniz: ");
        merkezAci = scanner.nextInt();
        
        double daireDilimAlani = (pi*(yariCap*yariCap)*merkezAci)/360;
        
        System.out.println("Daire Diliminin Alanı: " + daireDilimAlani);
        
    }
    
}
