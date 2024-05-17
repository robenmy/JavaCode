package Fundamentos;

import java.util.Scanner;

public class Java_Fundamentos_1 {
   public static void main(String[] args) {

       System.out.println("Escribe tu nombre");
       Scanner consola =new Scanner(System.in); // in = input. leer info de consola
       var usuario = consola.nextLine();

       System.out.println("Usuario=" + usuario);

   }

}
