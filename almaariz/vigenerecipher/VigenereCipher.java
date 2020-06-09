/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaariz.vigenerecipher;

/**
 *
 * @author 1817101458
 */
public class VigenereCipher {
    public String encrypt(String plain, String key){
        String cipher = "";
        for(int i=0; i<plain.length(); i++){
            int index = (plain.codePointAt(i)+ key.codePointAt(i % key.length())-65*2)%26;
            cipher += Character.toString(index+65);
        }
        return cipher;
    }
    public String decrypt(String cipher, String key){
        String plain = "";
        for(int i=0; i<cipher.length(); i++){
            int index = (cipher.codePointAt(i) - key.codePointAt(i % key.length())+26)%26;
            plain += Character.toString(index+65);
        }
        return plain;
    }
}
