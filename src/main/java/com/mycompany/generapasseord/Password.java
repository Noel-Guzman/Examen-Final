/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generapasseord;

/**
 *
 * @author fauri
 */ 
public class Password {
    static String GeneraPasswor(){
    char []mayusculas = {'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char []minusculas = {'a','b','c','d','e','f','g','h','i','j','k','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char []simbolos = {'@','#','%','&','_','-'};
    char []numeros = {'0','1','2','3','4','5','6','7','8','9'};
    
    
    StringBuilder Caracteres = new StringBuilder();
    
    Caracteres.append(mayusculas);
    Caracteres.append(minusculas);
    Caracteres.append(simbolos);
    Caracteres.append(numeros);

    StringBuilder password = new StringBuilder();
    for (int i=0;i<=7;i++){
        int CantidaCaracteres = Caracteres.length();
        int numeroRam = (int)(Math.random()*CantidaCaracteres);
        
        password.append((Caracteres.toString()).charAt(numeroRam));
    }
    
    return password.toString();
}

}
