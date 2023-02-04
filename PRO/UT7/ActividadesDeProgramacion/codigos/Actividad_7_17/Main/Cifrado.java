/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 *
 * @author juancfm
 */
public class Cifrado {

    public static String cesar(String txt, int paso) {
        String cifrado = "";
        for (int i = 0; i < txt.length(); i++) {
            char letra = txt.charAt(i);
            if (Character.isLetter(letra)) {
                if (Character.isLowerCase(letra)) {
                    char letraCifrada = (char) (((letra - 'a' + paso) % 26) + 'a');
                    cifrado += letraCifrada;
                } else {
                    char letraCifrada = (char) (((letra - 'A' + paso) % 26) + 'A');
                    cifrado += letraCifrada;
                }
            } else {
                cifrado += letra;
            }
        }
        return cifrado;
    }
}
