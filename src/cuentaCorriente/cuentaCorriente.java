package cuentaCorriente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Modelo de las cuentas corrientes a gestionar
 * @author garfe *
 */
public class cuentaCorriente {
	
	/*
	 * Si no definimos ningún constructor por campos,
	 * se puede utilizar el constructor vacío por defecto.
	 * En el momento que se defina un constructor por campos
	 * específico, si se quiere usar el constructor por defecto
	 * será necesario definirlo en la clase de forma explícita.
	 */
	
	public cuentaCorriente(String dni, String nombreTitular, double saldo) {
		super();
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}

	public cuentaCorriente() {
		super();
	}

	//Atributos
	/*
	 * Modificador private: solo la misma clase podrá acceder a los
	 * atributos de forma directa.
	 */
	
	private String dni;
	private String nombreTitular;
	private double saldo;
	
	//Getters y Setters
	/*
	 * Se utilizar para que software externo a la clase pueda 
	 * tener acceso a los atributos.
	 */
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Sobre escritura toString
	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
	}
	
	//Métodos
	public cuentaCorriente crearCuenta () {
		
		System.out.println("CREAR CUENTA: ");
		Scanner entradaDni = new Scanner(System.in);	
		Scanner entradaNombreTitular = new Scanner(System.in);	
		String opcionEntradaDni;
		String opcionEntradaNombreTitular;
		System.out.println("Introduza el DNI del titular: ");
		opcionEntradaDni = entradaDni.next();
		System.out.println("Introduza el nombre completo del titular: ");
		opcionEntradaNombreTitular = entradaNombreTitular.next();
		
		//Opción 1, constructor vacío
		cuentaCorriente cccVacio = new cuentaCorriente();
		cccVacio.setDni(opcionEntradaDni);
		cccVacio.setNombreTitular(opcionEntradaNombreTitular);
		cccVacio.setSaldo(0);
		return cccVacio;

		//Opción 2, constructor con todos los campos
		/*CuentaCorriente cccInicializado = new CuentaCorriente(opcionEntradaDni, opcionEntradaNombreTitular, 0);
		return cccInicializado;*/
	}
	
	public List<cuentaCorriente> mostrarInfo(List<cuentaCorriente> bd) {
		System.out.println("DATOS CUENTA: ");
		//pedir dni
		Scanner entradaDni = new Scanner(System.in);
		System.out.println("Indique dni de cuenta: ");
		String opcionEntradaDni = entradaDni.next();
		//buscar la cuenta
		int contador = 0;
		boolean esEncontrado = false;
		for(cuentaCorriente cuenta: bd) {
			String dniBd = cuenta.getDni();
			if(dniBd.equals(opcionEntradaDni)) {
				esEncontrado = true;
				break;
			}
			contador++;
		}
		
		if(esEncontrado) {
			System.out.println("Info: " + bd.get(bd.size()-1).toString());
		}else {
			System.out.println("No existe cuenta para el dni indicado: "+opcionEntradaDni);
			return bd;
		}
		return bd;
	}
	
	public List<cuentaCorriente> ingresoCuenta(List<cuentaCorriente> bd) {
		System.out.println("INGRESO CUENTA: ");
		//pedir dni
		Scanner entradaDni = new Scanner(System.in);
		System.out.println("Indique dni de cuenta: ");
		String opcionEntradaDni = entradaDni.next();
		//buscar la cuenta
		int contador = 0;
		boolean esEncontrado = false;
		for(cuentaCorriente cuenta: bd) {			
			String dniBd = cuenta.getDni();
			if(dniBd.equals(opcionEntradaDni)) {
				esEncontrado = true;
				break;
			}
			contador++;			
		}		

		if(esEncontrado) {
			System.out.println("Indique saldo a ingresar: ");
			Scanner entradaIngreso = new Scanner(System.in);
			double ingreso = entradaIngreso.nextDouble();
			double saldoActual = bd.get(contador).getSaldo();
			bd.get(contador).setSaldo(saldoActual+ingreso);
			double saldoNuevo = saldoActual+ingreso;
			System.out.println("Saldo anterior: "+saldoActual+"Saldo nuevo: "+saldoNuevo);
		}else {
			System.out.println("No existe cuenta para el dni indicado: "+opcionEntradaDni);
			return bd;
		}
		return bd;
	}
	
	public List<cuentaCorriente> retiradaCuenta(List<cuentaCorriente> bd){
		System.out.println("RETIRADA CUENTA: ");
		//pedir dni
		Scanner entradaDni = new Scanner(System.in);
		System.out.println("Indique dni de cuenta: ");
		String opcionEntradaDni = entradaDni.next();
		//buscar la cuenta
		int contador = 0;
		boolean esEncontrado = false;
		for(cuentaCorriente cuenta: bd) {
			String dniBd = cuenta.getDni();
			if(dniBd.equals(opcionEntradaDni)) {
				esEncontrado = true;
				break;
			}
			contador++;
		}
		
		if(esEncontrado) {
			System.out.println("Indique saldo a retirar: ");
			Scanner entradaRetirada = new Scanner(System.in);
			double retirada = entradaRetirada.nextDouble();
			double saldoActual = bd.get(contador).getSaldo();
			bd.get(contador).setSaldo(saldoActual-retirada);
			double saldoNuevo = saldoActual-retirada;
			System.out.println("Saldor anterior: " +saldoActual+" Saldo nuevo: "+saldoNuevo);
		}else {
			System.out.println("No existe cuenta para el dni indicado: "+opcionEntradaDni);
			return bd;
		}
		return bd;
	}
	
	public ArrayList<cuentaCorriente> mostrarCuentasUsuario(String dniUsuario){
		return null;		
	}
	
	
}
