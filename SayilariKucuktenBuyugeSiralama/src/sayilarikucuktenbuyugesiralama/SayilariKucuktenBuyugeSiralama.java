/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayilarikucuktenbuyugesiralama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class SayilariKucuktenBuyugeSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İlk Sayıyı Giriniz: ");
        a = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        b = scanner.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz: ");
        c = scanner.nextInt();
        
        if(a<b && a<c){
            if(b<c){
                System.out.println("a<b<c");
            }
            else{
                System.out.println("a<c<b");
            }
        }
        else if(b<a && b<c){
            if(a<c){
                System.out.println("b<a<c");
            }
            else{
                System.out.println("b<c<a");
            }
        }
        else if(c<a && c<b){
            if(a<b){
                System.out.println("c<a<b");
            }
            else{
                System.out.println("c<b<a");
            }
        }
    }
    
}
