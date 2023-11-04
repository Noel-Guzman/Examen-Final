/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generapasseord;

/**
 *
 * @author fauri
 */

public class Usuarios {
    static String GeneraUsuario(){
        String[]Userm={"useAj","useAD","useAC","useAQ","useAB"};
        String[] numero = {"0","1","2","3","4","5","6","7","8","9"};
        
        StringBuilder Caracteres = new StringBuilder();
        
        Caracteres.append(Userm);
        Caracteres.append(numero);
       StringBuilder User = new StringBuilder(); 
        for (int i=0;i<=1;i++){
        int CantidaCaracteres = Caracteres.length();
        int numeroRam = (int)(Math.random()*CantidaCaracteres);
        
        User.append((Caracteres.toString()).charAt(numeroRam));
        }
     return User.toString();   
    }
    
}
