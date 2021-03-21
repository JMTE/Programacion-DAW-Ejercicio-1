package Ejercicio2;

import java.util.Scanner; //Importamos el paquete java.util para utilizar la clase Scanner

public class Algoritmo_figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);/* En este apartado creamos un objeto
			de la clase Scanner asociado a la entrada por teclado*/
			double a,b,area,perimetro; /*Declaramos las variables que nos van a 
			hacer falta en este ejercicio*/
			
			String figura; /*Declaramos una variable tipo string para pedir el tipo figura*/
			System.out.print("Dame el primer valor numérico ----> ");/*Escribimos en consola
			que se escriba el primer valor numerico*/
			a=sc.nextFloat(); /*Lo almacenamos en la variable a con el método
			perteneciente a la clase Scanner anteriormente citada*/
			System.out.print("Dame el segundo valor numérico ----> ");
			b=sc.nextFloat();/*Lo mismo que lo anterior pero para el segundo
			valor numerico y lo almacenamos en la variable b*/
			
			
			
			
			boolean correcto=false;/*Declaramos una variable booleana para el bucle
			que tenemos que crear por si el usuario introduce una palabra que no es
			ninguna de las figuras*/
			do{
				/*Recurrimos a un bucle do-while para que realice una vez al menos lo 
			 que tenemos dentro de el y despues compruebe la condicion si se cumple
			 */
			
		
				// Ahora escribimos en consola que definamos que tipo de figura es
				System.out.print("Dame el tipo de figura (Triángulo,Rectángulo o Círculo) CUIDADO TILDES ");
			
				figura=sc.next(); /*Y volvemos a almacenar el valor que introducimos en consola
			mediante el metodo de la clase Scanner, esta vez definido para tipo string*/
			
			/*Ahora pasamos a evaluar segun la palabra introducida, que operaciones
			tenemos que ejecutar*/
			
			
			if (figura.equals("Triángulo")){//si la palabra introducida es triangulo
				area=(a*b)/2; //Definimos la operacion area y lo escribimos en pantalla
				System.out.println("El area del triángulo es "+ area);
				 correcto=true;/*Ponemos la variable a true, para salir del bucle porque
				que ya hemos hecho nuestro calculo para la figura*/
				
					
			}else if (figura.equals("Rectángulo")){/*Si por el contrario,la palabra 
			introducida es Rectangulo:*/
				perimetro=2*(a+b);/*Realizamos las operaciones de area y perímetro
				para el rectangulo*/
				area=a*b;
				//Y lo escribimos en pantalla su resultado
				System.out.println("El perímetro del rectángulo es "+perimetro +" Y el area del rectángulo es "
						+area);
				correcto=true;
				
			}else if (figura.equals("Círculo")){/*Por ultimo lo mismo si
			la palabra introducida es  Circulo*/
				perimetro=2*Math.PI*a;//Aqui utilizamos la constante PI de la clase Math
				area=Math.PI*Math.pow(b, 2);/*Aqui utilizamos el método Pow de la clase
				Math que por argumento nos pide dos valores, la base y el exponente*/
				//Escribimos en consola el valor de las operaciones anteriores
				System.out.println("La circunferencia del circulo es "+perimetro 
						+ " y el area del circulo es "+ area);
				correcto=true;
			}else {
				System.out.println("El texto introducido no es correcto");
				
			}
			}while (correcto!=true);
			/* Con este bucle le decimos que si 
			el usuario introduce una palabra que no es ninguna de las figuras 
			requeridas,seguiremos en bucle pidiendo el tipo de figura. En el momento
			que el usuario introduce una palabra de las requeridas, la variable 
			correcto se vuelve verdadera y salimos del bucle*/
			sc.close();
			
	}

}
