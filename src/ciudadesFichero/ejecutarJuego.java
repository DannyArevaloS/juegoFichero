package ciudadesFichero;
import java.util.*;
import java.io.*;

/**
 * juego de ciudades en fichero de texto para Java
 * 1 pasar un fichero de texto a un archivo mas accesible
 * 2 requisitos para el juego
 * -concursan dos jugadores y solo uno participa 
 * - muevete por ubicación hacia abajo por una ciudad
 * - adivina la ciudad
 * */

public class ejecutarJuego {

	public static void main(String[] args) {
		String ciudad;
		
		saludoInicial();
		juego(convertirFicheroenArray());
		
		//testArrayListParaUsarConLosDatosDelFicheroProximamente();
		ArrayList<String> ciudades = convertirFicheroenArray();
		//ArrayList<String[]> test = testArrayListParaUsarConLosDatosDelFicheroProximamente();
		juego(ciudades);
		finDelPrograma();
		
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
			System.out.println("Participa el jugador " + jugador1);
		} else {
			System.out.println("Participa el jugador " + jugador2);
		}
		
		
	}
	
	public static String juego(ArrayList<String> listaParametrizada) {
			
		Scanner sc = new Scanner(System.in);
			
		int contador = 0;
		
		while(true) {
			System.out.println("La ciudad actual es: " + listaParametrizada.get(contador));
			System.out.println("Elige cuantos movimientos haces hacia abajo: ");
			int mov1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Adivina que ciudad viene ahora: ");
			String ciudadAdivinada = sc.nextLine();
			
			contador += mov1;
			System.out.println("La ciudad actual es: " + listaParametrizada.get(contador));
			
			if(ciudadAdivinada == listaParametrizada.get(contador) ) {
				System.out.println("GANASTE");
			} else {
				System.out.println("PERDISTE");
				break;
			}
			
			
		}
			
		return listaParametrizada.get(contador -1);
			
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
		
		try (FileInputStream fileInputStream = new FileInputStream(nombreFichero);
				BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {
			
			String linea;
			
			while((linea = reader.readLine()) != null){
				String[] ciudades = linea.split(" ");
				//System.out.println("@darevals -> la lista de ciduades del array: "ciudades);
				
				for(String ciudad : ciudades) {
					//System.out.println("@@@darevals -> ciudades: " + ciudad);
					listaCiudades.add(ciudad);
				}
				
			}
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
		
		
		return listaCiudades;
	}
	
	public static void finDelPrograma() {
		System.out.println("TERMINA EL PROGRAMA!!");
	}
	
	
	

}
