/**
*
*Entrada por teclado
*
*/

public class Entrada
{
 public static void main(String[] args)
 {
  //Entrada de Texto (String)
  String nombre;
  System.out.println("Escribe tu nombre");
  nombre = System.console().readLine();
  System.out.println("Hola " + nombre);

  //Entrada de numeros enteros(Int)
  int a, b, c;
  System.out.println("introduce el primer numero");
  a = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el segundo numero");
  b = Integer.parseInt(System.console().readLine());
  c = a * b;
  System.out.println("El resultado de la multiplicacion es: "+c);
 }
}
