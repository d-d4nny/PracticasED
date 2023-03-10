package cuentaCorriente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase de acceso a la aplicación de gestión de cuentas
 * @author garfe
 */
public class mainCuenta {

	public static void main(String[] args) {
		
		//Inicializar el tipo cuenta
		cuentaCorriente ccc = new cuentaCorriente();
		//Listado de cuentas (BD)
		List<cuentaCorriente> listaCcc = new ArrayList<>();
		
		// Imprimir el menú por consola
		// Scanner con la opción del usuario
		Scanner entradaOpcion = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		int opcion;
		while(!cerrarMenu) {	
			//Mostramos el menú
			mostrarMenu();
			System.out.println("Introduza la opción deseada: ");
			opcion = entradaOpcion.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {			
				case 1:
					listaCcc.add(ccc.crearCuenta());					
					System.out.println("Cuenta creada: " + listaCcc.get(listaCcc.size()-1).toString());
					break;
				case 2:
					//llamams al método
					listaCcc = ccc.ingresoCuenta(listaCcc);
					break;
				case 3:
					listaCcc = ccc.retiradaCuenta(listaCcc);
					break;
				case 4:
					listaCcc = ccc.mostrarInfo(listaCcc);
					break;
				case 5:
					cerrarMenu = true;
					break;
				default:

			}
		}		

	}
	static void mostrarMenu() {
		System.out.println("1. Crear cuenta");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Mostrar información cuenta");
		System.out.println("5. Salir");
	}
	

}
