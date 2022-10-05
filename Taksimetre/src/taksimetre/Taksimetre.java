/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksimetre;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class Taksimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kilometre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen Mesafeyi Giriniz:");
        kilometre = scanner.nextInt();
        
        double perKM = 2.20;
        double acilis = 10.0;
        
        
        double ucret = acilis + (kilometre * perKM);
        
        ucret = (ucret < 20) ? 20 : ucret;
        
        System.out.println("Toplam Tutar: " + ucret);
    }
    
}
