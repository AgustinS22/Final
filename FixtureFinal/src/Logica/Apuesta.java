package Logica;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Apuesta {
	private double pozo_local;
	private double pozo_visitante;
	private double pozo_empate;
	private double bet_local;
	private double bet_visitante;
	private double bet_empate;
	private double apuesta_ingresada;
	private String eleccion;
	private boolean estado = false;
	
	public Apuesta(double pozo_local, double pozo_visitante, double pozo_empate) {
		super();
		this.pozo_local = pozo_local;
		this.pozo_visitante = pozo_visitante;
		this.pozo_empate = pozo_empate;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getBet_local() {
		return bet_local;
	}

	public void setBet_local(double bet_local) {
		this.bet_local = bet_local;
	}

	public double getBet_visitante() {
		return bet_visitante;
	}

	public void setBet_visitante(double bet_visitante) {
		this.bet_visitante = bet_visitante;
	}

	public double getBet_empate() {
		return bet_empate;
	}

	public void setBet_empate(double bet_empate) {
		this.bet_empate = bet_empate;
	}

	public String getEleccion() {
		return eleccion;
	}

	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}

	public double getApuesta_ingresada() {
		return apuesta_ingresada;
	}

	public void setApuesta_ingresada(double apuesta_ingresada) {
		this.apuesta_ingresada = apuesta_ingresada;
	}

	public double getPozo_local() {
		return pozo_local;
	}
	public void setPozo_local(double pozo_local) {
		this.pozo_local = pozo_local;
	}
	public double getPozo_visitante() {
		return pozo_visitante;
	}
	public void setPozo_visitante(double pozo_visitante) {
		this.pozo_visitante = pozo_visitante;
	}
	public double getPozo_empate() {
		return pozo_empate;
	}
	public void setPozo_empate(double pozo_empate) {
		this.pozo_empate = pozo_empate;
	}
	@Override
	public String toString() {
		return "Apuesta [apuesta_local=" + pozo_local + ", apuesta_visitante=" + pozo_visitante
				+ ", apuesta_empate=" + pozo_empate + ", apuesta_ingresada=" + apuesta_ingresada + ", eleccion="
				+ eleccion + "]";
	}

	public static void betApuesta(Partido partido) {
		String op;
		double apuesta = 0;
		double bet_local;
		double bet_visitante;
		double bet_empate;
		partido.getApuesta().setBet_local(Math.round(((partido.getApuesta().pozo_visitante + partido.getApuesta().pozo_empate) / partido.getApuesta().pozo_local) * 100d) / 100d);
		partido.getApuesta().setBet_visitante(Math.round(((partido.getApuesta().pozo_local + partido.getApuesta().pozo_empate) / partido.getApuesta().pozo_visitante) * 100d) / 100d);
		partido.getApuesta().setBet_empate(Math.round(((partido.getApuesta().pozo_visitante + partido.getApuesta().pozo_local) / partido.getApuesta().pozo_empate) * 100d) / 100d);
		
		JOptionPane.showMessageDialog(null, "Las apuestas son las siguientes. \n " + partido.getPais().getNombre() + " Paga x" + partido.getApuesta().getBet_local() + " de lo apostado" + "\n " + partido.getPais2().getNombre() + " Paga x" + partido.getApuesta().getBet_visitante() + " de lo apostado" + "\n El empate del partido Paga x" + partido.getApuesta().getBet_empate() + " de lo apostado");
		op = JOptionPane.showInputDialog("Elija el nombre del equipo al que desea apostar o empate en caso de no querer apostar por ningun equipo.");
		partido.getApuesta().setEleccion(op);
		
		if (partido.getApuesta().getEleccion().equalsIgnoreCase(partido.getPais().getNombre()) || partido.getApuesta().getEleccion().equalsIgnoreCase(partido.getPais2().getNombre()) || partido.getApuesta().getEleccion().equalsIgnoreCase("empate")){
			JOptionPane.showMessageDialog(null, "Usted eligio " + partido.getApuesta().getEleccion());
			apuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto que desea apostar"));
			partido.getApuesta().setApuesta_ingresada(apuesta);
			if (partido.getApuesta().getEleccion().equalsIgnoreCase(partido.getPais().getNombre())) {
				JOptionPane.showMessageDialog(null, "Apuesta cargada correctamente, en caso de ganar, el monto que se llevara es: " + (partido.getApuesta().getApuesta_ingresada() * partido.getApuesta().getBet_local()));	
			} else if (partido.getApuesta().getEleccion().equalsIgnoreCase(partido.getPais2().getNombre())) {
				JOptionPane.showMessageDialog(null, "Apuesta cargada correctamente, en caso de ganar, el monto que se llevara es: " + (partido.getApuesta().getApuesta_ingresada() * partido.getApuesta().getBet_visitante()));
			} else {
				JOptionPane.showMessageDialog(null, "Apuesta cargada correctamente, en caso de ganar, el monto que se llevara es: " + (partido.getApuesta().getApuesta_ingresada() * partido.getApuesta().getBet_visitante()));
			}
			partido.getApuesta().setEstado(true);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor elija un pais o la opcion de empate.");
			partido.getApuesta().setEstado(false);
		}
		
		
		
	}
	
	public static void pagoApuesta(LinkedList<Partido> partido, int i) {
			if (partido.get(i).getApuesta().isEstado()) {
				if (partido.get(i).getApuesta().getEleccion().equalsIgnoreCase(partido.get(i).getPais().getNombre()) || partido.get(i).getApuesta().getEleccion().equalsIgnoreCase(partido.get(i).getPais2().getNombre()) || partido.get(i).getApuesta().getEleccion().equalsIgnoreCase("empate")) {
					if (partido.get(i).getGol_local() > partido.get(i).getGol_visitante()) {
						if (partido.get(i).getPais().getNombre().equalsIgnoreCase(partido.get(i).getApuesta().getEleccion())){
							JOptionPane.showMessageDialog(null, "El ganador fue " + partido.get(i).getPais().getNombre() + " \nUsted ganó la apuesta y se lleva $" + (partido.get(i).getApuesta().getApuesta_ingresada() * partido.get(i).getApuesta().getBet_local()));
						} else {
							JOptionPane.showMessageDialog(null, "Usted perdió la apuesta, se lleva $0");
						}
					} else if (partido.get(i).getGol_visitante() > partido.get(i).getGol_local()) {
						if (partido.get(i).getPais2().getNombre().equalsIgnoreCase(partido.get(i).getApuesta().getEleccion())){
							JOptionPane.showMessageDialog(null, "El ganador fue " + partido.get(i).getPais2().getNombre() + " \nUsted ganó la apuesta y se lleva $" + (partido.get(i).getApuesta().getApuesta_ingresada() * partido.get(i).getApuesta().getBet_visitante()));
						} else {
							JOptionPane.showMessageDialog(null, "Usted perdió la apuesta, se lleva $0");
						}
					} else{
						if (partido.get(i).getApuesta().getEleccion().equalsIgnoreCase("empate")) {
							JOptionPane.showMessageDialog(null, "El resultado fue empate. \nUsted ganó la apuesta y se lleva $" + (partido.get(i).getApuesta().getApuesta_ingresada() * partido.get(i).getApuesta().getBet_empate()));	
						} else {
							JOptionPane.showMessageDialog(null, "Usted perdió la apuesta, se lleva $0");
						}
					}		
				}
			}
			
	}
		
	}

