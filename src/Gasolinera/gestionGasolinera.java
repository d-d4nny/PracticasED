package Gasolinera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clase.CuentaCorriente;

public class gestionGasolinera {
	
	public gestionGasolinera(String fecha, boolean esFactura, double litros, double importe, String dni, String matricula) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
		this.esFactura = esFactura;
	}
	
	public gestionGasolinera() {
		super();
	}
	
	//Atributos
	private String fecha;
	private String dni;
	private String matricula;
	private double litros;
	private double importe;
	private boolean esFactura;
	
	//Getters y Setters
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public boolean getEsFactura() {
		return esFactura;
	}
	public void setEsFactura(boolean esFactura) {
		this.esFactura = esFactura;
	}
	
	//Metodo Mostrar

		public String mostrarNormal() {
			return "CuentaCorriente [fecha=" + fecha + ", litros=" + litros + ", importe=" + importe + "]";
		}
		
		public String mostrarFactura() {
			return "CuentaCorriente [fecha=" + fecha + ", litros=" + litros + ", importe=" + importe + ", dni=" + dni + ", matricula=" + matricula + "]";
		}
		
		static void verRepostajes(List<gestionGasolinera> bd) {
			 Scanner key = new Scanner(System.in);
		        Scanner capturaOpcion = new Scanner(System.in);
		        System.out.println("Quiere ver repostajes normales (0) o factura (1)");
		        int opcion =capturaOpcion.nextInt();
		        switch (opcion) {
		        case 0:
		            for(int i=0;i<bd.size();i++) {
		                if(!bd.get(i).getEsFactura())
		                System.out.println("Es factura: "+bd.get(i).getEsFactura());
		                System.out.println("Fecha: "+bd.get(i).getFecha());
		                System.out.println("Litros: "+bd.get(i).getLitros());
		                System.out.println("Importe: "+bd.get(i).getImporte());
		                System.out.println("");
		                key.nextLine();
		            }
		            break;
		        case 1:
		            for(int i=0;i<bd.size();i++) {
		                if(bd.get(i).getEsFactura())
		                System.out.println("Es factura: "+bd.get(i).getEsFactura());
		                System.out.println("Fecha: "+bd.get(i).getFecha());
		                System.out.println("Litros: "+bd.get(i).getLitros());
		                System.out.println("Importe: "+bd.get(i).getImporte());
		                System.out.println("Dni: "+bd.get(i).getDni());
		                System.out.println("Matricula: "+bd.get(i).getMatricula());
		                System.out.println("");
		                key.nextLine();
		            }
		            break;
		        }
		    }
	
	//Metodos
	
	public gestionGasolinera repostajeNormal() {
		
		System.out.println("REPOSTAJE NORMAL: ");
		Scanner entradaFecha = new Scanner(System.in);
		Scanner entradaLitros = new Scanner(System.in);
		Scanner entradaImporte = new Scanner(System.in);
		String opcionEntradaFecha;
		double opcionEntradaLitros;
		double opcionEntradaImporte;
		System.out.println("Introduza la fecha: ");
		opcionEntradaFecha = entradaFecha.next();
		System.out.println("Introduza los litros: ");
		opcionEntradaLitros = entradaLitros.nextDouble();
		System.out.println("Introduza el importe: ");
		opcionEntradaImporte = entradaImporte.nextDouble();
		
		gestionGasolinera gasolineraVacio = new gestionGasolinera();
		gasolineraVacio.setFecha(opcionEntradaFecha);
		gasolineraVacio.setLitros(opcionEntradaLitros);
		gasolineraVacio.setImporte(opcionEntradaImporte);
		gasolineraVacio.setEsFactura(false);
		return gasolineraVacio;
	}
	
	public gestionGasolinera repostajeFactura() {
		
		System.out.println("REPOSTAJE NORMAL: ");
		Scanner entradaFecha = new Scanner(System.in);
		Scanner entradaLitros = new Scanner(System.in);
		Scanner entradaImporte = new Scanner(System.in);
		Scanner entradaDni = new Scanner(System.in);
		Scanner entradaMatricula = new Scanner(System.in);
		String opcionEntradaFecha;
		double opcionEntradaLitros;
		double opcionEntradaImporte;
		String opcionEntradaDni;
		String opcionEntradaMatricula;
		System.out.println("Introduza la fecha: ");
		opcionEntradaFecha = entradaFecha.next();
		System.out.println("Introduza los litros: ");
		opcionEntradaLitros = entradaLitros.nextDouble();
		System.out.println("Introduza el importe: ");
		opcionEntradaImporte = entradaImporte.nextDouble();
		System.out.println("Introduza el dni: ");
		opcionEntradaDni = entradaDni.next();
		System.out.println("Introduza la matricula: ");
		opcionEntradaMatricula = entradaMatricula.next();
		
		gestionGasolinera gasolineraVacio = new gestionGasolinera();
		gasolineraVacio.setFecha(opcionEntradaFecha);
		gasolineraVacio.setLitros(opcionEntradaLitros);
		gasolineraVacio.setImporte(opcionEntradaImporte);
		gasolineraVacio.setDni(opcionEntradaDni);
		gasolineraVacio.setMatricula(opcionEntradaMatricula);
		gasolineraVacio.setEsFactura(true);
		return gasolineraVacio;
	}
	
	public gestionGasolinera eliminarRepostaje() {
		
		
	}
	
	public gestionGasolinera modificarRepostaje() {
		
		
	}
	
}
