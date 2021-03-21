package Ejercicio4;

import java.util.Scanner;//Importamos el paquete java.util para utilizar la clase Scanner

public class Algoritmo_Personas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);/* Creamos un objeto de la clase Scanner
		que nos lea lo que le introduzcamos por teclado*/
		
		
		int par=0;/*Declaramos e inicializamos las variables par e impar, que nos 
		serviran para calcular cuantas palabras tendremos con numero de caracteres 
		pares e impares*/
		int impar=0;
		int contador=0;/*Declaramos e inicializamos la variable contador que nos
		servira para contar las palabras validas que introducimos diferentes de FIN*/
		boolean fin=false;/*Declaramos e inicializamos en false la variable fin, que nos 
		servira para ser la condicion en el bucle while del cual no saldremos hasta que
		introduzcamos por teclado FIN y esta variable cambie a TRUE*/
		while (fin==false){/*Lo explicado anteriormente, creamos un bucle while
		que se ejecutará todo el rato mientras fin==false y dentro
		de este bucle se ejecutará el código que  nos pedirá una palabra(Nombre),
		lo guardará en una variable String mediante el metodo de la clase Scanner
		y después lo analizara mediante un bucle if si el String introducido es FIN o no*/
		System.out.println("Dame el nombre de una persona (FIN para terminar programa):");
		String palabra=sc.next();
		if(palabra.equals("FIN")){ /*Si la palabra introducida es FIN, escribimos 
		en pantalla FIN DE PROGRAMA y el resultado de los nombres con número de
		caracteres pares, impares y el numero de nombres válidos sin contar FIN*/
			System.out.println("FIN DEL PROGRAMA");
			System.out.println("El número de nombres con número de caracteres"
					+ " pares es " + par);
			System.out.println("El número de nombres con número de caracteres"
					+ " impares es " + impar);
			System.out.println("El número de nombres válidos es "+contador);
			fin=true; //Cambiamos la variable fin a true para salir del bucle
			
			
		}else { /*Y aqui realizamos las operaciones cuando la palabra introducida 
		no es FIN*/
			
			int longitud=palabra.length();/* Aqui declaramos la variable longitud,
			que la definimos como el resultado de aplicar el metodo length de la clase
			String a nuestra variable palabra. Este metodo se encarga de calcular
			la longitud de un string.*/
			
			contador=contador+1; //Sumamos una unidad al contador de palabras validas
				if (longitud%2==0){ /*con este bucle if, calculamos si la palabra tiene 
				numero de caracteres pares o impares, y para ello hacemos el resto de la 
				longitud de la cadena entre dos. Si el resultado es cero, la longitud es
				par, de otra forma es impar. Dependiendo del resultado, sumamos una unidad
				a la variable par o impar.*/
					par=par+1;
					
					}else {
						impar=impar+1;
						}
				}
		
		}
			sc.close();//Como buena práctica,cerramos el scanner.
	}
	

}
