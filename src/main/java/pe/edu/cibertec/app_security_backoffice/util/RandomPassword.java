package pe.edu.cibertec.app_security_backoffice.util;

import java.util.Random;

public class RandomPassword {
    public String generar(int longuitud){
        String cadena= "ABCDEFGHIJKMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
        Random random= new Random();
        StringBuilder password = new StringBuilder();
        for (int i =0; i<longuitud; i++){
            int index = random.nextInt(cadena.length());
            password.append(cadena.charAt(index));
        }
        return  password.toString();
    }
}
