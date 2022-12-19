package Logica;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
		String dato,nom,ape;
		int codigo;
		nom= JOptionPane.showInputDialog("Ingrese su nombre para verificar sus datos por favor: ");
		ape= JOptionPane.showInputDialog("Ingrese su apellido para seguir verificando sus datos por favor: ");
		codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de acceso para seguir verificando sus datos por favor: "));
		if (nom.equalsIgnoreCase(nombre) && ape.equalsIgnoreCase(apellido) && codigo == codigo_acceso) {
			JOptionPane.showMessageDialog(null, "Entro satisfactoriamente a su cuenta, ahora podra cargar datos!");
			return true;
		} else {
			if (!nom.equalsIgnoreCase(nombre)) {
				JOptionPane.showMessageDialog(null, "El nombre de la cuenta es incorrecto");
			}
			if (!ape.equalsIgnoreCase(apellido)) {
				JOptionPane.showMessageDialog(null, "El apellido de la cuenta es incorrecto");
			}
			if (codigo != codigo_acceso) {
				JOptionPane.showMessageDialog(null, "El codigo de acceso a la cuenta fue incorrecto");
			}
			return false;
		}
		
	}
}
