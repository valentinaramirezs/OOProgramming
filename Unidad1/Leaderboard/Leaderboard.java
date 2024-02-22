package leaderboard1;

import java.util.Scanner;

public class Leaderboard {
		//***** atributos ***
		static String nombreVideojuego;	
		//arreglo de nombres:
		static String nombresJugadores[];	
		//matriz de puntajes:
		static int puntajes[][];	
		//promedios:
		static float promPuntos, promHP;	
		//constante para el número de jugadores:
		static final int NUM_JUGADORES = 10;	
		
		//***** métodos
		public static void main(  String[] args   )
		{
			pedirNombreVJ();
			leerDatos();
			calcularPromedios();
			mostrarPromedios();
		}
		
		public static void pedirNombreVJ()
		{
			//se crea objeto para leer por consola:
			Scanner lectorConsola = new Scanner(System.in);
			System.out.println("Ingrese el nombre del videojuego:");
			nombreVideojuego = lectorConsola.next();		
		}
		
		//LEER NOMBRES DE JUGADORES Y PUNTAJES:
		///TAREA: terminar método (leer puntajes)
		public static void leerDatos()
		{
			Scanner lectorConsola = new Scanner(System.in);
			//recorrer arreglo:
			for( int i = 0; i < NUM_JUGADORES; i++  )
			{		
				System.out.println("Ingrese el nombre del jugador:");
				//leer cada nombre:
				nombresJugadores[i] =   lectorConsola.next();
				
				System.out.println("Ingrese los puntos del jugador: ");
				puntajes [i][0]= lectorConsola.nextInt();
				
				System.out.println("Ingrese el HP (sangre) del jugador: ");
				puntajes [i][1]= lectorConsola.nextInt();
			}
		}	
		
		//TAREA:
		public static void calcularPromedios()
		{
			//1. Recorrer matriz de puntajes 
			//2.  sumar los puntajes 
			//3. Dividir la suma entre el numero de jugadores 
			int sumaPuntos=0, sumaHP=0;
			for( int i = 0; i < NUM_JUGADORES; i++ )
			{
					sumaPuntos= sumaPuntos+ puntajes[i][0];
					
					sumaHP= sumaHP+ puntajes[i][1];
				
					promPuntos= sumaPuntos/NUM_JUGADORES;
					
					PromHP= sumaHP/NUM_JUGADORES;
			}
		}
		
		//TAREA:
		public static void mostrarPromedios()
		{
			System.out.println()
		}
	}


