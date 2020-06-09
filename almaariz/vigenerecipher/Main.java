/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaariz.vigenerecipher;

import java.util.Scanner;

/**
 *
 * @author 1817101458
 */
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Vigenere Cipher\n");
        System.out.println("Masukkan pilihan\n1. Encrypt\n2. Decrypt");
        int menu = sc.nextInt();
        sc.nextLine();
        if (menu==1){
            VigenereCipher vc = new VigenereCipher();
            System.out.print("Masukkan teks terang: ");
            String plain = sc.nextLine();
            System.out.print("Nasukkan kunci: ");
            String key = sc.nextLine();
            System.out.println("teks sandi: " + vc.encrypt(plain, key));
        }
        else if (menu==2){
            VigenereCipher vc = new VigenereCipher();
            System.out.print("Masukkan teks sandi: ");
            String cipher = sc.nextLine();
            System.out.print("Nasukkan kunci: ");
            String key = sc.nextLine();
            System.out.println("teks terang: " + vc.decrypt(cipher, key));
        }
        else{
            System.out.println("Tidak ada pilihan.");
        }
    }
}
