package Logica;

import java.util.Scanner;

public class Encargado {
	private static String nombre;
	private static String apellido;
	private int DNI;
	private static int codigo_acceso;
	public Encargado(String nombre, String apellido, int dNI, int codigo_acceso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.codigo_acceso = codigo_acceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getCodigo_acceso() {
		return codigo_acceso;
	}
	public void setCodigo_acceso(int codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}
	@Override
	public String toString() {
		return "Encargado [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", codigo_acceso="
				+ codigo_acceso + "]";
	}
	public static boolean acceder() {
		Scanner entrada = new Scanner (System.in);
		String dato,nom,ape;
		int codigo;
		System.out.println("Ingrese su nombre para verificar sus datos por favor: ");
		nom=entrada.nextLine();
		System.out.println("Ingrese su apellido para seguir verificando sus datos por favor: ");
		ape=entrada.nextLine();
		System.out.println("Ingrese su codigo de acceso para seguir verificando sus datos por favor: ");
		codigo=entrada.nextInt();
		if (nom.equalsIgnoreCase(nombre) && ape.equalsIgnoreCase(apellido) && codigo == codigo_acceso) {
			System.out.println("Entro satisfactoriamente a su cuenta, ahora podra cargar datos!");
			return true;
		} else {
			if (!nom.equalsIgnoreCase(nombre)) {
				System.out.println("El nombre de la cuenta es incorrecto");
			}
			if (!ape.equalsIgnoreCase(apellido)) {
				System.out.println("El apellido de la cuenta es incorrecto");
			}
			if (codigo != codigo_acceso) {
				System.out.println("El codigo de acceso a la cuenta fue incorrecto");
			}
			return false;
		}
		
	}
}
