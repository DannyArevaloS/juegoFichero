package ciudadesFichero;
import java.util.*;
import java.io.*;

/**
 * juego de ciudades en fichero de texto para Java
 * 1 pasar un fichero de texto a un archivo mas accesible
 * 2 requisitos para el juego
 * - si la ciudad donde avanzas contiene una A pierdes turno
 * - te puedes mover de arriba abajo a derecha
 * - ganas si la ciudad es americana
 * */

public class ejecutarJuego {

	public static void main(String[] args) {
		String ciudad;
		
		//saludoInicial();
		//juego(convertirFicheroenArray());
		
		testArrayListParaUsarConLosDatosDelFicheroProximamente();
		
		
		
	}
	
	public static void saludoInicial() {
		String jugador1;
		String jugador2;
		int jug1 = 0;
		int jug2 = 0;
		
		String jugadorGanador;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a juego de ciudades: ");
		System.out.printf("Nombre del primer jugador: ");
		jugador1 = sc.nextLine();
		System.out.printf("Nombre del primer jugador: ");
		jugador2 = sc.nextLine();
		
		System.out.println("Jugador 1: elige un numero del 1 al 5: ");
		jug1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Jugador 2: elige un numero del 1 al 5: ");
		jug2 = sc.nextInt();
		sc.nextLine();
		
		if(jug1 < jug2) {
			System.out.println("Empieza el juego el jugador 2");
		} else {
			System.out.println("Empieza el jugador 2");
		}
		
		
	}
	
	public static String juego(ArrayList<String> listaParametrizada) {
			
		Scanner sc = new Scanner(System.in);
			
		
			String cambioCiudad = "";
			int mov1 = 0;
			int mov2 = 0;
			int mov3 = 0;
			int mov4 = 0;
			
			System.out.println("Elige cuantos movimientos haces hacia abajo: ");
			mov1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Elige cuantos movimientos haces hacia arriba: ");
			mov2 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Siguiente jugador: ");
			
			System.out.println("Elige cuantos movimientos haces hacia abajo: ");
			mov3 = sc.nextInt();
			sc.nextLine();
			System.out.println("Elige cuantos movimientos haces hacia arriba: ");
			mov4 = sc.nextInt();
			sc.nextLine();
			
			
			
			return cambioCiudad;
			
	}
	
	public static ArrayList<String[]> testArrayListParaUsarConLosDatosDelFicheroProximamente(){
		
		String[] palabrasTest = {"palabra1", "palabra2", "palabra3"};
		
		ArrayList<String[]> listaTest = new ArrayList<String[]>();
		listaTest.add(palabrasTest);
		
		
		for(String palabra : palabrasTest) {
			System.out.println("por aqui pasa estas palabras: " + palabra);
		}
		
		return listaTest;
		
		
	}
	
	
	
	
	public static ArrayList<String> convertirFicheroenArray() {
		String nombreFichero = "ciudaes.dat";
		
		ArrayList<String> listaCiudades = new ArrayList<String>();
		
		try {
			
			OutputStream outputStream = new FileOutputStream(nombreFichero);
			
			
		} catch(IOException e) {
			System.out.println("@@@darevals -> Error en el trato del fichero binario: " + e.getMessage());
		}
				
		
		
		
		
		return listaCiudades;
	}
	
	
	

}
