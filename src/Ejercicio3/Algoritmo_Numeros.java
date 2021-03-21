package Ejercicio3;

import java.util.Scanner; //Importamos el paquete java.util para poder utilizar la clase Scanner

public class Algoritmo_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);/*Creamos el objeto Scanner que va a leer
		lo que le introduzcamos por teclado en la consola*/
		
		int contador=1; /*Definimos e inicializamos al mismo tiempo la variable
		contador, que será la encargada de contar los 10 numeros*/
		double suma_numeros=0; /*Definimos e inicializamos la variable sumanumeros
		que será la encargada de sumar cada numero en cada vuelta del bucle for
		hasta darnos el valor total en la ultima vuelta del bucle*/
		
		double media =0; /*Definimos e inicializamos la variable media 
		que será la encargada de calcular la media de todos los numeros.*/
		int par=0; /*Definimos e inicializamos la variable par, que sera la 
		encargada de contar cuantos números par existen. Lo mismo con la siguiente
		y la variable impar*/
		int impar=0;
		
		for (contador=1 ;contador<=10;contador++){ /*Con este bucle for
		ejecutamos el codigo que se encuentra entre llaves durante 10 veces. 
		Cada vez que se ejecuta la variable contador aumenta una unidad, de esta manera
		cuando llega a 10 sale del bucle y ejecuta el resto del código*/
			
			System.out.println("Dame el "+ contador+"º "+ "número"  );/*Escribimos 
			en pantalla una frase que nos indique que introduzcamos el numero, lo he
			concatenado con el valor del contador para que tengamos una referencia 
			del orden del número que el usuario está introduciendo*/
			int numero=sc.nextInt();/* Declaramos la variable numero
			que queda definida mediante el metodo nextInt correspondiente a la 
			clase Scanner, "captura" el valor que introducimos por teclado y lo guarda.*/
			System.out.println("El "+contador+ "º  número es: " + numero); /*Esta 
			orden dude en ponerla, pero en el enunciado pone que escribamos cada
			número leido, así que la introduzco*/
			if (numero%2==0){/* Con este bucle if seleccionamos si el número 
			introducido es par o impar, para ello calculamos el resto del numero dividido
			entre 2. Si el resto es cero, pues es par, sino es impar. Dependiendo del
			caso dado, sumamos una unidad a la variable par o impar.*/
				par=par+1;
			}else{
				impar=impar+1;
				}
					suma_numeros=suma_numeros+numero;/* Aquí vamos 
					sumando los numeros en cada vuelta*/
					media=(suma_numeros/contador);/*Y aquí calculamos la media
					aunque podría hacerse tambien al salir del bucle*/
			
		}
		
		/*Para terminar, escribimos en pantalla todos los datos que se nos piden*/
		System.out.println("La suma de todos los numeros es " + suma_numeros);
		System.out.println("Hay "+par + " numeros pares");
		System.out.println("Hay "+impar + " numeros impares");
		System.out.println("La media de los numeros es " + media);
	}
	
	
		
	}



