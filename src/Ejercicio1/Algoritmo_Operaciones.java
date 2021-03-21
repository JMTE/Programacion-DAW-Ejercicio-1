7package Ejercicio1;

import java.util.Scanner;//Importamos la clase Scanner del paquete java.util

public class Algoritmo_Operaciones {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); /* En este apartado creamos un objeto
		de la clase Scanner asociado a la entrada por teclado.*/
		
		float a,b; //Definimos los numeros que introducimos por teclado como a y b reales
		float suma,resta,multiplicacion,division,resto;//Definimos las operaciones que tenemos que hacer como reales
		
		System.out.print("Dame el primer numero ----> ");/*Escribimos en consola para
		que el usuario introduzca el primer numero*/
	
		a=sc.nextFloat();/*Guardamos en la variable a el texto introducido en la
		consola gracias al metodo de la clase Scanner, en este caso es un numero real 
		como se indica en la instruccion.*/
		System.out.print("Dame el segundo numero ----> ");/*Escribimos en consola
		para que el usuario introduzca el segundo numero*/
		
		b=sc.nextFloat();/*Guardamos en la variable b el texto introducido en la
		consola gracias al metodo de la clase Scanner*/
		
		System.out.println("Dime que operacion deseas realizar: ");/*Preguntamos
		al usuario que operacion desea realizar*/
		
		
		boolean fin =false; /*Definimos e inicializamos una variable booleana 
		para salir del bucle cuando introduzcamos la palabra FIN*/
		while (fin!=true){ /*Utilizamos un bucle while para que no salgamos del menu
		hasta que que no queramos hacer mas operaciones con los numeros introducidos.
		Saldremos del menu cuando la variable fin sea true.*/
		//En la siguiente linea definimos el menu con saltos de linea.
			System.out.println(" 1.SUMA \n 2.RESTA  \n 3.MULTIPLICACION \n 4.DIVISION \n 5.RESTO \n 6.SALIR");
			
			int operacion=sc.nextInt();/*con el metodo de la clase Scanner, guardamos
			en la variable operacion de tipo entero, el numero que introducimos por 
			consola*/
		switch (operacion){ /*con el switch y la variable operacion, se selecciona
		el case que corresponde segun el valor introducido por teclado*/
			case 1:
				/*En este caso, hemos seleccionado el 1 y hacemos la suma correspondiente
				y la imprimimos en la consola, despues un break para salir del switch
				ya que sino saltaria y ejecutaria la siguiente operacion.
				 */
				suma=a+b;
				System.out.println("El resultado de la suma es " + suma);
				break;
		
			case 2:
				//Realizamos la resta e imprimimos
				resta=a-b;
				System.out.println("El resultado de la resta es " + resta);
				break;
			case 3:
				//Realizamos la multiplicacion e imprimimos
				multiplicacion=a*b;
				System.out.println("El resultado de la multiplicacion es " + multiplicacion);
				break;
			case 4:
				/*En este caso, hay una posible desviacion, debido a la posibilidad
				de un cero en el divisor.
				 */
				if (b==0){ /*Le decimos que cuando el divisor es igual a cero,
			escriba un mensaje en pantalla de que el resultado de la division es infinito*/
						System.out.println("El resultado de la division es infinito");
				}else{//Si el division no es cero, entonces que haga la operacion de division
						division=a/b;
						System.out.println("El resultado de la division es " + division);
			
				}
				break;
				
			case 5:
				/*Para calcular el modulo de dos numeros, si el divisior es
				 * cero, da un resultado raro, yo considero que es el resultado
				 * es el dividendo y para ello hago un bucle if.
				 */
				if (b==0){
					System.out.println("El resultado del resto es " + a);
				}else{
					//si el divisor no es cero, hace la operacion modulo normal.
				resto=a%b;
				System.out.println("El resultado del resto es " + resto);
				}
				break;
			case 6: 
				/*En este caso, escogemos la opcion de salir, por lo tanto,
				ponemos la variable fin a true y salimos del bucle while, 
				terminando el programa.
				 */
				System.out.println("FIN DEL PROGRAMA");
				fin=true;
				break;
				
				
			default: 
				//Esto es por si introducimos otra opcion que no esta incluida en el menu
				System.out.println("No has introducido una opcion valida");
				System.out.println("Dime otra operacion:");
		
		
		}
		
	}
	sc.close();	/*Cerramos el scanner para no consumir recursos, 
	aunque funcionaria igual con el abierto, es una buena practica*/
	}

}
