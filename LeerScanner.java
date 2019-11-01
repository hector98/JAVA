/**
*
*Leer datos desde teclado utilizando la clase Scanner.
*
*/

import java.util.Scanner;

public class LeerScanner
{
 public static void main(String[] args)
 {
  Scanner read = new Scanner(System.in);
  
  System.out.println("Introduce tu nombre");
  String nombre = read.nextLine();
  
  System.out.println("Introduce tu edad");
  int edad = read.nextInt();
  System.out.println("Hola " + nombre + ", Tienes " + edad + " años");
 }
}
