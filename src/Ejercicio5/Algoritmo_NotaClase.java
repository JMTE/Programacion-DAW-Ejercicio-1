package Ejercicio5;

import java.util.Random; //Importamos el paquete java.util para utilizar la clase Random para numeros aleatorios

import javax.swing.JOptionPane;

public class Algoritmo_NotaClase{

	public static void main(String[] args) {
		
		int contador=0; /*Declaramos e inicializamos la variable contador que será la encargada 
		de contar el numero de notas aleatorias que se deben de presentar en pantalla,
		en este caso,hay que tener 20.*/
		double sumanota=0;/*Declaramos e inicializamos la variable sumanota, que será 
		la encargada de sumar el valor total de las notas. */
		double medianota; /*Declaramos e inicializamos la variable medianota, que será 
		la encargada de calcular la media del valor total de las notas*/
		
		/*Declaramos e inicializamos el siguiente número de variables
		que serán las encargadas de contar el número de notas de cada
		calificación*/
		int MD=0;
		int IN=0;
		int SF=0;
		int BN=0;
		int NT=0;
		int SB=0;
		//El siguiente mensaje solo es para aceptar que se van a calcular las notas.
		JOptionPane.showMessageDialog(null, "A continuación se calcularán las notas aleatorias correspondientes");
		
				while (contador!=20){/*Con el siguiente bucle while, expresamos
				que mientras el contador sea distino de 20, ejecutemos una y otra vez
				el siguiente código*/
					Random n=new Random();/*Creamos un objeto de la clase Random. Esta
					clase sirve para crear numeros aleatorios.*/
					int nota=n.nextInt(10-0)+1;/*Declaramos la variable nota, que 
					guardará en su interior el valor del numero aleatorio creado 
					anteriormente. Tambien definimos que el numero aleatorio, a nosotros solo 
					nos interesa el que va desde 1 hasta 10*/
					contador++;//Sumamos una unidad al contador de numeros
					String texto=FuncionNota(nota);/*Aqui definimos la variable texto y decimos
					que es igual a una funcion o método funcionNota que realizamos mas abajo.Este 
					método lleva por parametro nota*/
					sumanota=sumanota+nota; //Aqui sumamos cada nota y la almacenamos para hacer la nota media mas tarde
					/*Segun el texto que nos ha devuelto la funcion, comparamos para calcular el numero 
					total de calificaciones de cada tipo que tenemos
					 */
					if (texto.equals("MUY DEFICIENTE")){
							MD++;
						}else if (texto.equals("INSUFICIENTE")){
							IN++;
							}else if (texto.equals("SUFICIENTE")){
								SF++;
								}else if (texto.equals("BIEN")){
									BN++;
								}else if (texto.equals("NOTABLE")){
									NT++;
								}else {
									SB++;
								}
				System.out.println("La nota es: "+ nota+ " ---->"+ texto );/*Aqui en cada vuelta
				nos imprime la nota del alumno mas el texto correspondiente, en total serán 20 notas*/
				
				
				}
				medianota=sumanota/20;//Calculamos la media de las notas y la imprimimos
				System.out.println("-----------La nota media es : "+ medianota);
				System.out.println("El número de alumnos con  calificación: [MUY DEFICIENTE] es "+MD);
				System.out.println("                                        [INSUFICIENTE] es "+IN);
				System.out.println("                                        [SUFICIENTE] es "+SF);
				System.out.println("                                        [BIEN] es "+BN);
				System.out.println("                                        [NOTABLE] es "+NT);
				System.out.println("                                        [SOBRESALIENTE] es "+SB);
				
	}




	public static String FuncionNota(int nota2){ /*Creamos un metodo de tipo String
	el cual tiene que recibir por parametro un entero, este entero, sera la nota que
	obtenemos mediante los numeros aleatorios*/
		
			String texto; /*Definimos la variable texto y analizamos el valor de nota2
			para saber que obtenemos de resultado en texto*/
				if (nota2<2){
					texto="MUY DEFICIENTE";
					}else if (nota2<5){
					texto="INSUFICIENTE";
					}else if (nota2<6){
					texto="SUFICIENTE";		
					}else if (nota2<7){
					texto="BIEN";	
					}else if (nota2<9){
					texto="NOTABLE";	
					}else {
					texto="SOBRESALIENTE";	
					}
				return texto; /*Como es un metodo estatico, siempre tiene que devolver
				un valor, en este caso y como habiamos dicho, nos interesa que nuestro
				metodo nos devuelva el valor del texto correspondiente según la nota*/
				
	}	
		
}	
		