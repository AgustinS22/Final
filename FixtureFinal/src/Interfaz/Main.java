package Interfaz;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Logica.*;

class Main {

	public static void main(String[] args) {
		//Creacion de encargado
		Encargado encargado = new Encargado("Agustin", "Segovia", 43253317, 1234);
		
		//Creacion de todos los equipos participantes.
		
		
		Pais ecuador = new Pais("Ecuador", 0, true, "A", 3, 0, 0, 0, 0, "ECU", 0, 0, 1);
		Pais qatar = new Pais("Qatar", 0, true, "A", 3, 0, 0, 0, 0, "QAT", 0, 0, 10);
		Pais senegal = new Pais("Senegal", 0, true, "A", 3, 0, 0, 0, 0, "SEN", 0, 0, 23);
		Pais holanda = new Pais("Holanda", 0, true, "A", 3, 0, 0, 0, 0, "HOL", 0, 0, -4);
		Pais inglaterra = new Pais("Inglaterra", 0, true, "B", 0, 0, 0, 0, 0, "ING", 0, 0, 0);
		Pais iran = new Pais("Iran", 0, true, "B", 0, 0, 0, 0, 0, "IRN", 0, 0, 0);
		Pais eeuu = new Pais("EE.UU", 0, true, "B", 0, 0, 0, 0, 0, "USA", 0, 0, 0);
		Pais gales = new Pais("Gales", 0, true, "B", 0, 0, 0, 0, 0, "GAL", 0, 0, 0);
		Pais argentina = new Pais("Argentina", 0, true, "C", 0, 0, 0, 0, 0, "ARG", 0, 0, 0);
		Pais arabia = new Pais("Arabia Saudita", 0, true, "C", 0, 0, 0, 0, 0, "ARA", 0, 0, 0);
		Pais mexico = new Pais("Mexico", 0, true, "C", 0, 0, 0, 0, 0, "MEX", 0, 0, 0);
		Pais polonia = new Pais("Polonia", 0, true, "C", 0, 0, 0, 0, 0, "POL", 0, 0, 0);
		Pais francia = new Pais("Francia", 0, true, "D", 0, 0, 0, 0, 0, "FRA", 0, 0, 0);
		Pais australia = new Pais("Australia", 0, true, "D", 0, 0, 0, 0, 0, "AUS", 0, 0, 0);
		Pais dinamarca = new Pais("Dinamarca", 0, true, "D", 0, 0, 0, 0, 0, "DIN", 0, 0, 0);
		Pais tunez = new Pais("Tunez", 0, true, "D", 0, 0, 0, 0, 0, "TUN", 0, 0, 0);
		Pais españa = new Pais("España", 0, true, "E", 0, 0, 0, 0, 0, "ESP", 0, 0, 0);
		Pais alemania = new Pais("Alemania", 0, true, "E", 0, 0, 0, 0, 0, "ALE", 0, 0, 0);
		Pais costarica = new Pais("Costa Rica", 0, true, "E", 0, 0, 0, 0, 0, "CRC", 0, 0, 0);
		Pais japon = new Pais("Japon", 0, true, "E", 0, 0, 0, 0, 0, "JAP", 0, 0, 0);
		Pais belgica = new Pais("Belgica", 0, true, "F", 0, 0, 0, 0, 0, "BEL", 0, 0, 0);
		Pais canada = new Pais("Canada", 0, true, "F", 0, 0, 0, 0, 0, "CAN", 0, 0, 0);
		Pais marruecos = new Pais("Marruecos", 0, true, "F", 0, 0, 0, 0, 0, "MAR", 0, 0, 0);
		Pais croacia = new Pais("Croacia", 0, true, "F", 0, 0, 0, 0, 0, "CRO", 0, 0, 0);
		Pais brasil = new Pais("Brasil", 0, true, "G", 0, 0, 0, 0, 0, "BRA", 0, 0, 0);
		Pais serbia = new Pais("Serbia", 0, true, "G", 0, 0, 0, 0, 0, "SER", 0, 0, 0);
		Pais suiza = new Pais("Suiza", 0, true, "G", 0, 0, 0, 0, 0, "SUI", 0, 0, 0);
		Pais camerun = new Pais("Camerun", 0, true, "G", 0, 0, 0, 0, 0, "CAM", 0, 0, 0);
		Pais portugal = new Pais("Portugal", 0, true, "H", 0, 0, 0, 0, 0, "POR", 0, 0, 0);
		Pais ghana = new Pais("Ghana", 0, true, "H", 0, 0, 0, 0, 0, "GHA", 0, 0, 0);
		Pais uruguay = new Pais("Uruguay", 0, true, "H", 0, 0, 0, 0, 0, "URU", 0, 0, 0);
		Pais corea = new Pais("Corea del Sur", 0, true, "H", 0, 0, 0, 0, 0, "COR", 0, 0, 0);
		
		
		//Creacion de lista y añadido de paises a la misma.
		LinkedList<Pais> paises = new LinkedList<Pais>(); 
		paises.add(qatar);
		paises.add(ecuador);
		paises.add(senegal);
		paises.add(holanda);
		paises.add(inglaterra);
		paises.add(iran);
		paises.add(eeuu);
		paises.add(gales);
		paises.add(argentina);
		paises.add(arabia);
		paises.add(mexico);
		paises.add(polonia);
		paises.add(francia);
		paises.add(australia);
		paises.add(dinamarca);
		paises.add(tunez);
		paises.add(españa);
		paises.add(alemania);
		paises.add(costarica);
		paises.add(japon);
		paises.add(belgica);
		paises.add(canada);
		paises.add(marruecos);
		paises.add(croacia);
		paises.add(brasil);
		paises.add(serbia);
		paises.add(suiza);
		paises.add(camerun);
		paises.add(portugal);
		paises.add(ghana);
		paises.add(uruguay);
		paises.add(corea);
		
		//Creacion de listas de Grupos y añadido de cada pais a su respectivo grupo.
		LinkedList<Pais> Grupoa = new LinkedList<Pais>();
		LinkedList<Pais> Grupob = new LinkedList<Pais>();
		LinkedList<Pais> Grupoc = new LinkedList<Pais>();
		LinkedList<Pais> Grupod = new LinkedList<Pais>();
		LinkedList<Pais> Grupoe = new LinkedList<Pais>();
		LinkedList<Pais> Grupof = new LinkedList<Pais>();
		LinkedList<Pais> Grupog = new LinkedList<Pais>();
		LinkedList<Pais> Grupoh = new LinkedList<Pais>();
		for (Pais pais : paises) {
			switch(pais.getGrupo().toLowerCase()) {
			case "a":
				Grupoa.add(pais);
				break;
			case "b":
				Grupob.add(pais);
				break;
			case "c":
				Grupoc.add(pais);
				break;
			case "d":
				Grupod.add(pais);
				break;
			case "e":
				Grupoe.add(pais);
				break;
			case "f":
				Grupof.add(pais);
				break;
			case "g":
				Grupog.add(pais);
				break;
			case "h":
				Grupoh.add(pais);
				break;
			}
		}

		//Creacion de lista de partidos y generacion de los distintos cruces.
		
		LinkedList<Partido> Partidoa = new LinkedList<Partido>();
		LinkedList<Partido> Partidob = new LinkedList<Partido>();
		LinkedList<Partido> Partidoc = new LinkedList<Partido>();
		LinkedList<Partido> Partidod = new LinkedList<Partido>();
		LinkedList<Partido> Partidoe = new LinkedList<Partido>();
		LinkedList<Partido> Partidof = new LinkedList<Partido>();
		LinkedList<Partido> Partidog = new LinkedList<Partido>();
		LinkedList<Partido> Partidoh = new LinkedList<Partido>();
		int ids;
		Grupos (Grupoa, ids=0, Partidoa);
		Grupos (Grupob, ids=6, Partidob);
		Grupos (Grupoc, ids=12, Partidoc);
		Grupos (Grupod, ids=18, Partidod);
		Grupos (Grupoe, ids=24, Partidoe);
		Grupos (Grupof, ids=30, Partidof);
		Grupos (Grupog, ids=36, Partidog);
		Grupos (Grupoh, ids=42, Partidoh);
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		LinkedList<Partido> partidoOctavos = new LinkedList<>();
		LinkedList<Pais> cuartos = new LinkedList<>();
		LinkedList<Partido> partidoCuartos = new LinkedList<>();
		LinkedList<Pais> semis = new LinkedList<>();
		LinkedList<Partido> partidoSemis = new LinkedList<>();
		LinkedList<Pais> finaal = new LinkedList<>();
		LinkedList<Partido> partidoFinal = new LinkedList<>();
		LinkedList<Pais> tercerycuarto = new LinkedList<>();
		LinkedList<Partido> partidoTercer = new LinkedList<>();
		LinkedList<Pais> top4 = new LinkedList<>();
		
		MenuPrincipal(Partidoa, Partidob, Partidoc, Partidod, Partidoe, Partidof, Partidog, Partidoh, Grupoa, Grupob, Grupoc, Grupod, Grupoe, Grupof, Grupog, Grupoh, paises, octavos, partidoOctavos, cuartos, partidoCuartos, semis, partidoSemis, finaal, partidoFinal, tercerycuarto, partidoTercer, top4, encargado);

	}
	
	public static void Grupos(LinkedList<Pais> Grupo, int id, LinkedList<Partido> partidos) {
		int p=0;
		double apuesta_local, apuesta_visitante, apuesta_empate;
		Partido partido;
			for (int i = 1; i<4; i++) {
				apuesta_local = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
				apuesta_visitante = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
				apuesta_empate = Math.round(((Math.random()*150000) + 50000) * 100d) / 100d;
				Apuesta apuestas = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
				if (i != 0 && p <3) {
					id++;
					partido = new Partido(Grupo.get(0), Grupo.get(i), 0, 0, 0, id, apuestas);
					partidos.add(partido);
					p++;
					if (p == 3){
						i = 1;
					}
				} else if (i != 0 && i != 1 && p!= 5 ) {
					id++;
					partido = new Partido(Grupo.get(1), Grupo.get(i), 0, 0, 0, id, apuestas);
					partidos.add(partido);
					p++;
					if (p == 5) {
						i = 2;
					}
				} else {
					id++;
					partido = new Partido(Grupo.get(2), Grupo.get(i), 0, 0, 0, id, apuestas);
					partidos.add(partido);
				}
				
		}

	}

	public static void verRankingGrupo(LinkedList<Pais> grupos, int op) {
		String grupo;
		Scanner entrada = new Scanner(System.in);
		if (op == 1) {
			System.out.println("Grupo A: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("a")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo B: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("b")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo C: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("c")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo D: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("d")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo E: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("e")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo F: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("f")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo G: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("g")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Grupo H: ");
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase("h")) {
					System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
				}
			}	
		} else if (op == 2) {
			String repetir;
			do {
				System.out.println("Por favor ingrese el grupo del que desea saber el ranking");
				grupo = entrada.nextLine(); 
				for (Pais pais : grupos) {
					if (pais.getGrupo().equalsIgnoreCase(grupo)) {
						System.out.println("Nombre\tPuntos\tPG\tPP\tPE\tGF\tGC\tDG\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles());
					}
				}			
				
			System.out.println("Desea consultar por otro grupos? Responder SI o NO.");
			repetir = entrada.nextLine();	
			} while (repetir.equalsIgnoreCase("si"));
		}
		
		}
	
	public static void jugarPartido(LinkedList<Partido> partidos, LinkedList<Pais> grupos, int op) {
		int p=0;
		String elec;
		int gol_local, gol_visitante;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Partidos grupo " + grupos.get(0).getGrupo());
			if (op == 1) {
				for (int i = 0; i<6; i++) {
				partidos.get(i).setGol_local((int)(Math.random()*6));
				partidos.get(i).setGol_visitante((int)(Math.random()*6));
				}
			} else if (op == 2) {
				System.out.println("Desea realizar una apuesta en el grupo " + grupos.get(0).getGrupo() + "? Responder SI o NO, si escribe cualquier otra cosa debera esperar al siguiente grupo para apostar.");
				elec = entrada.nextLine();
				if (elec.equalsIgnoreCase("si")) {
					Partido.realizarApuesta(partidos);
				} 
				for (int i = 0; i<6; i++) {
				System.out.println("El partido es el siguiente: " + partidos.get(i)); 
				System.out.println("Ingrese los goles de " + partidos.get(i).getPais().getNombre() + ":");
				partidos.get(i).setGol_local(entrada.nextInt());
				System.out.println("Ingrese los goles de " + partidos.get(i).getPais2().getNombre() + ":");
				partidos.get(i).setGol_visitante(entrada.nextInt());	
				}
			}
			for (int i = 0; i<6; i++) {
			partidos.get(i).setDuracion(Math.round(((Math.random()*10) + 90) * 100d) / 100d);
			p++;
			System.out.println("Resultado partido " + p + "\n" + partidos.get(i).getGol_local() + " " + partidos.get(i).getPais() + " - " + partidos.get(i).getPais2() + " " + partidos.get(i).getGol_visitante() + "  // Duracion del partido: " + partidos.get(i).getDuracion() + " min. \n");
			gol_local = partidos.get(i).getGol_local();
			gol_visitante = partidos.get(i).getGol_visitante();
			partidos.get(i).getPais().setGoles_favor(partidos.get(i).getPais().getGoles_favor() + gol_local);
			partidos.get(i).getPais().setCant_gol(partidos.get(i).getPais().getCant_gol() + gol_local);
			partidos.get(i).getPais().setGoles_contra(partidos.get(i).getPais().getGoles_contra() + gol_visitante);
			partidos.get(i).getPais2().setGoles_favor(partidos.get(i).getPais2().getGoles_favor() + gol_visitante);
			partidos.get(i).getPais2().setCant_gol(partidos.get(i).getPais2().getCant_gol() + gol_visitante);
			partidos.get(i).getPais2().setGoles_contra(partidos.get(i).getPais2().getGoles_contra() + gol_local);
			
			partidos.get(i).getPais().setPj(partidos.get(i).getPais().getPj() + 1);
			partidos.get(i).getPais2().setPj(partidos.get(i).getPais2().getPj() + 1);
			
			if (partidos.get(i).getGol_local() > partidos.get(i).getGol_visitante()) {
				partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos() + 3);
				partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
				partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);
			} else if (partidos.get(i).getGol_visitante() > partidos.get(i).getGol_local()) {
				partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos() + 3);
				partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
				partidos.get(i).getPais().setPp(partidos.get(i).getPais().getPp()+1);
			} else {
				partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos() + 1);
				partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos() + 1);
				partidos.get(i).getPais().setPe(partidos.get(i).getPais().getPe()+1);
				partidos.get(i).getPais2().setPe(partidos.get(i).getPais2().getPe()+1);
			}
			
		}
		if (op == 2) {
			for (int i = 0; i<6; i++) {
				if (partidos.get(i).getApuesta().isEstado()) {
					partidos.get(i).getApuesta().pagoApuesta(partidos, i);
				}
			}
		}
		for (int i=0; i<4; i++) {
			grupos.get(i).setDiferencia_goles(grupos.get(i).getGoles_favor()-grupos.get(i).getGoles_contra());
		}
	}
	
	public static void avanzarFasePrimeros(LinkedList<Pais> Fase, LinkedList<Pais> grupo, LinkedList<Partido> partidos) {
		Fase.add(grupo.get(0));
		grupo.get(2).setClasificado(false);
		grupo.get(3).setClasificado(false);
		Partido partido;
		double apuesta_local, apuesta_visitante, apuesta_empate;
		apuesta_local = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
		apuesta_visitante = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
		apuesta_empate = Math.round(((Math.random()*150000) + 50000) * 100d) / 100d;
		Apuesta apuestas = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
		partidos.add(new Partido(grupo.get(0), null, 0, 0, 0, 0, apuestas));
		
	}	
	
	public static void avanzarFaseSegundos(LinkedList<Pais> Fase, LinkedList<Pais> grupo, LinkedList<Partido> partidos) {
		Fase.add(grupo.get(1));
		Partido partido;
		for (int i =0; i < partidos.size(); i++) {			
			if (partidos.get(i).getPais2() == null && !partidos.get(i).getPais().getGrupo().equalsIgnoreCase(grupo.get(1).getGrupo())) {
			partidos.get(i).setPais2(grupo.get(1));
			i = partidos.size();	
			}
		}
	}
	
	public static void partidosEliminatorias(LinkedList<Partido> partido, LinkedList<Pais> clasificado, LinkedList<Pais> tercer, int op) {
		Partido partidocl;
		Scanner entrada = new Scanner(System.in);
		String elec;
		int penal_local=0, penal_vis=0;
		if (partido.size() > 3) {
				if (op == 1) {
					for (int i=0; i<partido.size();i++) {
					partido.get(i).setGol_local((int)(Math.random()*7));
					partido.get(i).setGol_visitante((int)(Math.random()*7));	
					}
				} else if (op == 2) {
					System.out.println("Desea realizar una apuesta en los partidos de eliminatoria? Responder SI o NO, si escribe cualquier otra cosa debera esperar a la siguiente fase para apostar.");
					elec = entrada.nextLine();
					if (elec.equalsIgnoreCase("si")) {
						Partido.realizarApuesta(partido);
					} 
					for (int i=0; i<partido.size();i++) {
					System.out.println(partido.get(i));
					System.out.println("Ingrese los goles de " + partido.get(i).getPais().getNombre() + ":");
					partido.get(i).setGol_local(entrada.nextInt());
					System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + ":");
					partido.get(i).setGol_visitante(entrada.nextInt());	
					}
				}
				for (int i=0; i<partido.size();i++) {
				partido.get(i).setDuracion(Math.round(((Math.random()*10) + 90) * 100d) / 100d);
				int gol_local = partido.get(i).getGol_local();
				int gol_visitante = partido.get(i).getGol_visitante();
				
				partido.get(i).getPais().setGoles_favor(partido.get(i).getPais().getGoles_favor() + gol_local);
				partido.get(i).getPais().setCant_gol(partido.get(i).getPais().getCant_gol() + gol_local);
				partido.get(i).getPais().setGoles_contra(partido.get(i).getPais().getGoles_contra() + gol_visitante);
				partido.get(i).getPais2().setGoles_favor(partido.get(i).getPais2().getGoles_favor() + gol_visitante);
				partido.get(i).getPais2().setCant_gol(partido.get(i).getPais2().getCant_gol() + gol_visitante);
				partido.get(i).getPais2().setGoles_contra(partido.get(i).getPais2().getGoles_contra() + gol_local);
				partido.get(i).getPais().setDiferencia_goles(partido.get(i).getPais().getGoles_favor()-partido.get(i).getPais().getGoles_contra());
				partido.get(i).getPais2().setDiferencia_goles(partido.get(i).getPais2().getGoles_favor()-partido.get(i).getPais2().getGoles_contra());
				
				partido.get(i).getPais().setPj(partido.get(i).getPais().getPj() + 1);
				partido.get(i).getPais2().setPj(partido.get(i).getPais2().getPj() + 1);
				
				if (partido.get(i).getGol_local() > partido.get(i).getGol_visitante()) {
					partido.get(i).getPais2().setClasificado(false);
					clasificado.add(partido.get(i).getPais());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				} else if (partido.get(i).getGol_visitante() > partido.get(i).getGol_local()) {
					partido.get(i).getPais().setClasificado(false);
					clasificado.add(partido.get(i).getPais2());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				}
				else{
						if (op==1) {
							for (int j=0; j<6; j++) {
							penal_local=(int)(Math.random()*7);
							penal_vis=(int)(Math.random()*7);							
							if (penal_local > penal_vis || penal_local < penal_vis) {
								j=6;
							}
							}
						} else if (op == 2) {
							System.out.println("El partido llego a los penales! \n Ingrese los goles de " + partido.get(i).getPais().getNombre() + " en los penales:");
							penal_local = entrada.nextInt();
							System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + " en los penales:");
							penal_vis = entrada.nextInt();
						}
					System.out.println("El partido finalizo por penales.");
					partido.get(i).setDuracion(Math.round(((Math.random()*10) + 120) * 100d) / 100d);
					System.out.println("Resultado del partido \n" + partido.get(i).getGol_local() + "(" + penal_local+ ") " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() +"(" + penal_vis + ")" + "  //El partido finalizo por penales. Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					if (penal_local > penal_vis) {
						partido.get(i).getPais2().setClasificado(false);
						clasificado.add(partido.get(i).getPais());
					} else {
						partido.get(i).getPais().setClasificado(false);
						clasificado.add(partido.get(i).getPais2());
					}
				}
		}
		} else {
				if (op == 1) {
					for (int i=0; i<partido.size();i++) {
					partido.get(i).setGol_local((int)(Math.random()*7));
					partido.get(i).setGol_visitante((int)(Math.random()*7));
					}
				} else if (op == 2) {
					System.out.println("Desea realizar una apuesta en los partidos de eliminatoria? Responder SI o NO, si escribe cualquier otra cosa debera esperar a la siguiente fase para apostar.");
					elec = entrada.nextLine();
					if (elec.equalsIgnoreCase("si")) {
						Partido.realizarApuesta(partido);
					} 
					for (int i=0; i<partido.size();i++) {
					System.out.println(partido.get(i));
					System.out.println("Ingrese los goles de " + partido.get(i).getPais().getNombre() + ":");
					partido.get(i).setGol_local(entrada.nextInt());
					System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + ":");
					partido.get(i).setGol_visitante(entrada.nextInt());		
					}
				}
				
				for (int i=0; i<partido.size();i++) {
				partido.get(i).setDuracion(Math.round(((Math.random()*10) + 90) * 100d) / 100d);
				int gol_local = partido.get(i).getGol_local();
				int gol_visitante = partido.get(i).getGol_visitante();
				
				partido.get(i).getPais().setPj(partido.get(i).getPais().getPj() + 1);
				partido.get(i).getPais2().setPj(partido.get(i).getPais2().getPj() + 1);
				
				partido.get(i).getPais().setGoles_favor(partido.get(i).getPais().getGoles_favor() + gol_local);
				partido.get(i).getPais().setCant_gol(partido.get(i).getPais().getCant_gol() + gol_local);
				partido.get(i).getPais().setGoles_contra(partido.get(i).getPais().getGoles_contra() + gol_visitante);
				partido.get(i).getPais2().setGoles_favor(partido.get(i).getPais2().getGoles_favor() + gol_visitante);
				partido.get(i).getPais2().setCant_gol(partido.get(i).getPais2().getCant_gol() + gol_visitante);
				partido.get(i).getPais2().setGoles_contra(partido.get(i).getPais2().getGoles_contra() + gol_local);
				partido.get(i).getPais().setDiferencia_goles(partido.get(i).getPais().getGoles_favor()-partido.get(i).getPais().getGoles_contra());
				partido.get(i).getPais2().setDiferencia_goles(partido.get(i).getPais2().getGoles_favor()-partido.get(i).getPais2().getGoles_contra());
				
				if (partido.get(i).getGol_local() > partido.get(i).getGol_visitante()) {
					clasificado.add(partido.get(i).getPais());
					tercer.add(partido.get(i).getPais2());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				} else if (partido.get(i).getGol_visitante() > partido.get(i).getGol_local()) {
					tercer.add(partido.get(i).getPais());
					clasificado.add(partido.get(i).getPais2());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				}
				else{
					if (op==1) {
						for (int j=0; j<6; j++) {
						penal_local=(int)(Math.random()*7);
						penal_vis=(int)(Math.random()*7);							
						if (penal_local > penal_vis || penal_local < penal_vis) {
							j=6;
						}
						}
					} else if (op == 2) {
						System.out.println("El partido llego a los penales! \n Ingrese los goles de " + partido.get(i).getPais().getNombre() + " en los penales:");
						penal_local = entrada.nextInt();
						System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + " en los penales:");
						penal_vis = entrada.nextInt();
					}
					System.out.println("El partido finalizo por penales.");
					partido.get(i).setDuracion(Math.round(((Math.random()*10) + 120) * 100d) / 100d);
					System.out.println("Resultado del partido \n" + partido.get(i).getGol_local() + "(" + penal_local+ ") " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() +"(" + penal_vis + ")" + "  //El partido finalizo por penales. Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					if (penal_local > penal_vis) {
						clasificado.add(partido.get(i).getPais());
						tercer.add(partido.get(i).getPais2());
					} else {
						tercer.add(partido.get(i).getPais());
						clasificado.add(partido.get(i).getPais2());
					}
				}
		}
				
		}
		if (op == 2) {
			for (int i = 0; i< partido.size(); i++) {
				if (partido.get(i).getApuesta().isEstado()) {
					partido.get(i).getApuesta().pagoApuesta(partido, i);
				}
			}
		}
	}
	public static void partidosEliminatoriasFinales(LinkedList<Partido> partido, LinkedList<Pais> paises, int op) {
		Partido partidocl;
		String elec;
		Scanner entrada = new Scanner(System.in);
		int penal_local=0, penal_vis=0;
				if (op == 1) {
					for (int i=0; i<partido.size();i++) {
					partido.get(i).setGol_local((int)(Math.random()*7));
					partido.get(i).setGol_visitante((int)(Math.random()*7));
					}
				} else if (op == 2) {
					System.out.println("Desea realizar una apuesta en los partidos de eliminatoria? Responder SI o NO, si escribe cualquier otra cosa debera esperar a la siguiente fase para apostar.");
					elec = entrada.nextLine();
					if (elec.equalsIgnoreCase("si")) {
						Partido.realizarApuesta(partido);
					} 
					for (int i=0; i<partido.size();i++) {
					System.out.println(partido.get(i));
					System.out.println("Ingrese los goles de " + partido.get(i).getPais().getNombre() + ":");
					partido.get(i).setGol_local(entrada.nextInt());
					System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + ":");
					partido.get(i).setGol_visitante(entrada.nextInt());				
					}
				}
				
				for (int i=0; i<partido.size();i++) {
				partido.get(i).setDuracion(Math.round(((Math.random()*10) + 90) * 100d) / 100d);
				int gol_local = partido.get(i).getGol_local();
				int gol_visitante = partido.get(i).getGol_visitante();
				
				partido.get(i).getPais().setPj(partido.get(i).getPais().getPj() + 1);
				partido.get(i).getPais2().setPj(partido.get(i).getPais2().getPj() + 1);
				
				partido.get(i).getPais().setGoles_favor(partido.get(i).getPais().getGoles_favor() + gol_local);
				partido.get(i).getPais().setCant_gol(partido.get(i).getPais().getCant_gol() + gol_local);
				partido.get(i).getPais().setGoles_contra(partido.get(i).getPais().getGoles_contra() + gol_visitante);
				partido.get(i).getPais2().setGoles_favor(partido.get(i).getPais2().getGoles_favor() + gol_visitante);
				partido.get(i).getPais2().setCant_gol(partido.get(i).getPais2().getCant_gol() + gol_visitante);
				partido.get(i).getPais2().setGoles_contra(partido.get(i).getPais2().getGoles_contra() + gol_local);
				partido.get(i).getPais().setDiferencia_goles(partido.get(i).getPais().getGoles_favor()-partido.get(i).getPais().getGoles_contra());
				partido.get(i).getPais2().setDiferencia_goles(partido.get(i).getPais2().getGoles_favor()-partido.get(i).getPais2().getGoles_contra());

				if (partido.get(i).getGol_local() > partido.get(i).getGol_visitante()) {
					paises.add(partido.get(i).getPais());
					paises.add(partido.get(i).getPais2());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				} else if (partido.get(i).getGol_visitante() > partido.get(i).getGol_local()) {
					paises.add(partido.get(i).getPais());
					paises.add(partido.get(i).getPais2());
					System.out.println("Resultado partido " + "\n" + partido.get(i).getGol_local() + " " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() + "  // Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					
				}
				else{
					if (op==1) {
						for (int j=0; j<6; j++) {
						penal_local=(int)(Math.random()*7);
						penal_vis=(int)(Math.random()*7);							
						if (penal_local > penal_vis || penal_local < penal_vis) {
							j=6;
						}
						}
					} else if (op == 2) {
						System.out.println("El partido llego a los penales! \n Ingrese los goles de " + partido.get(i).getPais().getNombre() + " en los penales:");
						penal_local = entrada.nextInt();
						System.out.println("Ingrese los goles de " + partido.get(i).getPais2().getNombre() + " en los penales:");
						penal_vis = entrada.nextInt();
					}
					System.out.println("El partido finalizo por penales.");
					partido.get(i).setDuracion(Math.round(((Math.random()*10) + 120) * 100d) / 100d);
					System.out.println("Resultado del partido \n" + partido.get(i).getGol_local() + "(" + penal_local+ ") " + partido.get(i).getPais() + " - " + partido.get(i).getPais2() + " " + partido.get(i).getGol_visitante() +"(" + penal_vis + ")" + "  //El partido finalizo por penales. Duracion del partido: " + partido.get(i).getDuracion() + " min. \n");
					if (penal_local > penal_vis) {
						paises.add(partido.get(i).getPais());
						paises.add(partido.get(i).getPais2());
					} else {
						paises.add(partido.get(i).getPais());
						paises.add(partido.get(i).getPais2());
					}
				}
		}
			if (op == 2) {
				for (int i = 0; i< partido.size(); i++) {
					if (partido.get(i).getApuesta().isEstado()) {
						partido.get(i).getApuesta().pagoApuesta(partido, i);
					}
				}
			}
				
			
		}
	
	
	public static void armadoCuartos(LinkedList<Partido> partido, LinkedList<Pais> paises) {
		//0-2 1-3 4-6 5-7 
		int parti=0;
		double apuesta_local, apuesta_visitante, apuesta_empate;
		for (int i=0;i<paises.size();i++) {
				if (i == 0|| i == 1 || i == 4 || i == 5) {
					apuesta_local = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
					apuesta_visitante = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
					apuesta_empate = Math.round(((Math.random()*150000) + 50000) * 100d) / 100d;
					Apuesta apuestas = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
					partido.add(new Partido (paises.get(i), null, 0, 0, 0, 0, apuestas));
				}  else {		
					partido.get(parti).setPais2(paises.get(i));
					parti++;
				}
			
		}
	}
	
	public static void armadoSemis(LinkedList<Partido> partido, LinkedList<Pais> paises) {
		int parti=0;
		double apuesta_local, apuesta_visitante, apuesta_empate;
		for (int i=0; i < paises.size(); i++) {			
			if (i % 2 == 0) {
				apuesta_local = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
				apuesta_visitante = Math.round(((Math.random()*300000) + 100000) * 100d) / 100d;
				apuesta_empate = Math.round(((Math.random()*150000) + 50000) * 100d) / 100d;
				Apuesta apuestas = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
				partido.add(new Partido (paises.get(i), null, 0, 0, 0, 0, apuestas));
			} else {
				partido.get(parti).setPais2(paises.get(i));
				parti++;
			}
		}
			
		}
	
	
	public static void armadoFinalyTercer(LinkedList<Pais> paises, LinkedList<Pais> paises2, LinkedList<Partido> partido, LinkedList<Partido> partido2) {
		double apuesta_local, apuesta_visitante, apuesta_empate;
		apuesta_local = Math.round((Math.random()*300000 + 100000) * 100d) / 100d;
		apuesta_visitante = Math.round((Math.random()*300000 + 100000) * 100d) / 100d;
		apuesta_empate = Math.round((Math.random()*150000 + 50000) * 100d) / 100d;
		Apuesta apuestas = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
		apuesta_local = Math.round((Math.random()*300000 + 100000) * 100d) / 100d;
		apuesta_visitante = Math.round((Math.random()*300000 + 100000) * 100d) / 100d;
		apuesta_empate = Math.round((Math.random()*150000 + 50000) * 100d) / 100d;
		Apuesta apuestasb = new Apuesta(apuesta_local, apuesta_visitante, apuesta_empate);
		partido.add(new Partido (paises.get(0), paises.get(1), 0, 0, 0, 0, apuestas));
		partido2.add(new Partido (paises2.get(0), paises2.get(1), 0, 0, 0, 0, apuestasb));
	}
	
	public static void MenuPrincipal(LinkedList<Partido> Partidoa, LinkedList<Partido> Partidob, LinkedList<Partido> Partidoc, LinkedList<Partido> Partidod, LinkedList<Partido> Partidoe, LinkedList<Partido> Partidof, LinkedList<Partido> Partidog, LinkedList<Partido> Partidoh, LinkedList<Pais> Grupoa
			, LinkedList<Pais> Grupob , LinkedList<Pais> Grupoc, LinkedList<Pais> Grupod, LinkedList<Pais> Grupoe, LinkedList<Pais> Grupof, LinkedList<Pais> Grupog,  LinkedList<Pais>Grupoh
			, LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Partido> partidoOctavos, LinkedList<Pais> cuartos, LinkedList<Partido> partidoCuartos, LinkedList<Pais> semis,
			LinkedList<Partido> partidoSemis, LinkedList<Pais> finaal, LinkedList<Partido> partidoFinal, LinkedList<Pais> tercerycuarto, LinkedList<Partido> partidoTercer,
			LinkedList<Pais> top4, Encargado encargado) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("\t Bienvenido al Mundial de Qatar 2022 \t\n ¿Que desea realizar? \n1- Quiero simular el mundial completo \n 2 - Quiero decidir los datos de los partidos por mi cuenta");
		int op= entrada.nextInt();
		String seguir;
		switch(op) {
		case 1:
			//Jugar todos los partidos de los grupos.
			System.out.println("Comienza la simulacion de los partidos del grupo A");
			jugarPartido(Partidoa, Grupoa, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo B");
			jugarPartido(Partidob, Grupob, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo C");
			jugarPartido(Partidoc, Grupoc, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo D");
			jugarPartido(Partidod, Grupod, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo E");
			jugarPartido(Partidoe, Grupoe, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo F");
			jugarPartido(Partidof, Grupof, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo G");
			jugarPartido(Partidog, Grupog, op);
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Comienza la simulacion de los partidos del grupo H");
			jugarPartido(Partidoh, Grupoh, op);
			
			//Ordenar paises y grupos de acuerdo a sus puntos y diferencias de goles.
			Comparator <Pais> comp = Comparator.comparing(Pais::getPuntos).thenComparing(Pais::getDiferencia_goles).thenComparing(Pais::getGoles_favor);
			Collections.sort(paises, comp.reversed());
			Collections.sort(Grupoa, comp.reversed());
			Collections.sort(Grupob, comp.reversed());
			Collections.sort(Grupoc, comp.reversed());
			Collections.sort(Grupod, comp.reversed());
			Collections.sort(Grupoe, comp.reversed());
			Collections.sort(Grupof, comp.reversed());
			Collections.sort(Grupog, comp.reversed());
			Collections.sort(Grupoh, comp.reversed());
			
			
			
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("Asi quedan los grupos de forma ordenada. Los dos primeros pasaran a la siguiente etapa.");
			verRankingGrupo(paises, op);
			System.out.println(" ");
			
			System.out.println("Finalizo la etapa de fase de grupos, desea seguir con la simulacion? \n Si o No.");
			entrada.nextLine();
			seguir = entrada.nextLine();
			if (seguir.equalsIgnoreCase("si")) {
				avanzarFasePrimeros(octavos, Grupoa, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupob, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoc, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupod, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoe, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupof, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupog, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoh, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoa, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupob, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoc, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupod, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoe, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupof, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupog, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoh, partidoOctavos);	
				System.out.println("Estos son los partidos de Octavos de final.");
				System.out.println(partidoOctavos);
				System.out.println("\nA contianuacion los resultados de los partidos: ");
				partidosEliminatorias(partidoOctavos, cuartos, null, op);
				System.out.println("Finalizo la etapa de octavos de final, desea seguir con la simulacion? \n Si o No.");
				seguir = entrada.nextLine();
				if (seguir.equalsIgnoreCase("si")) {
					armadoCuartos(partidoCuartos, cuartos);
					System.out.println("Finalizaron los octavos de final, a continuacion tenemos los partidos de Cuartos de final.");
					System.out.println(partidoCuartos);
					System.out.println("\nLos resultados de los partidos son los siguientes: ");
					partidosEliminatorias(partidoCuartos,semis, null, op);
					System.out.println("Finalizo la etapa de cuartos de final, desea seguir con la simulacion? \n Si o No.");
					seguir = entrada.nextLine();
					if (seguir.equalsIgnoreCase("si")) {
						armadoSemis(partidoSemis, semis);
						System.out.println("Finalizaron los Cuartos de final, a continuacion tenemos los partidos de Semifinal.");
						System.out.println(partidoSemis);
						System.out.println("\nLos resultados de los partidos son los siguientes: ");
						partidosEliminatorias(partidoSemis, finaal, tercerycuarto, op);
						System.out.println("Finalizo la etapa de semifinales, desea seguir con la simulacion? \n Si o No.");
						seguir = entrada.nextLine();
						if (seguir.equalsIgnoreCase("si")) {
							armadoFinalyTercer(finaal, tercerycuarto, partidoFinal, partidoTercer);
							System.out.println("Finalizaron las Semifinales, a continuacion tenemos los partidos de la Final y el tercer y cuarto puesto.");
							System.out.println("Final: " + partidoFinal);
							System.out.println("Tercer y cuarto puesto: " + partidoTercer);
							System.out.println("\nLos resultados de los partidos son los siguientes: ");
							partidosEliminatoriasFinales(partidoFinal, top4, op);
							partidosEliminatoriasFinales(partidoTercer, top4, op);
							int puesto=1;
							System.out.println("El top 4 de la final queda formado de la siguiente manera");
							for (int i=0; i < top4.size();i++) {
								System.out.println(puesto + " - " + top4.get(i));
								puesto++;
							}
							System.out.println("\nEl campeon es: " + top4.get(0));
							System.out.println("Finalizo la simulacion del mundial\nSi desea saber las estadisticas especificas de un equipo durante todo el mundial.");
							do {
								System.out.println("Ingrese a continuacion el nombre del equipo, de lo contrario el programa finalizara.");
								seguir = entrada.nextLine();
								for (Pais pais : paises) {
									if (pais.getNombre().equalsIgnoreCase(seguir)) {
										System.out.println("Nombre\tPuntos\tPJ\tPG\tPP\tPE\tGF\tGC\tDG\tGoles Totales\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPj() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles() + "\t" + pais.getCant_gol());
									}
								}
							System.out.println("Desea preguntar las estadisticas especificas de otro equipo?");
							seguir = entrada.nextLine();
							} while(seguir.equalsIgnoreCase("si"));
							
						}
					}
					
				}
				
			}
			
			
			
			break;
		case 2:
			//Acceso
			if (encargado.acceder()) {
				entrada.nextLine();
			do {				
				//Jugar todos los partidos de los grupos.
				System.out.println("\t GRUPO A");
				jugarPartido(Partidoa, Grupoa, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO B");
				jugarPartido(Partidob, Grupob, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO C");
				jugarPartido(Partidoc, Grupoc, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO D");
				jugarPartido(Partidod, Grupod, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO E");
				jugarPartido(Partidoe, Grupoe, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO F");
				jugarPartido(Partidof, Grupof, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO G");
				jugarPartido(Partidog, Grupog, op);
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("\t GRUPO H");
				jugarPartido(Partidoh, Grupoh, op);
				
				//Ordenar paises y grupos de acuerdo a sus puntos y diferencias de goles.
				Comparator <Pais> compar = Comparator.comparing(Pais::getPuntos).thenComparing(Pais::getDiferencia_goles).thenComparing(Pais::getGoles_favor);
				Collections.sort(paises, compar.reversed());
				Collections.sort(Grupoa, compar.reversed());
				Collections.sort(Grupob, compar.reversed());
				Collections.sort(Grupoc, compar.reversed());
				Collections.sort(Grupod, compar.reversed());
				Collections.sort(Grupoe, compar.reversed());
				Collections.sort(Grupof, compar.reversed());
				Collections.sort(Grupog, compar.reversed());
				Collections.sort(Grupoh, compar.reversed());
				
				
				
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("Finalizo la etapa de fase de grupos. Los dos primeros pasaran a la siguiente etapa.");
				verRankingGrupo(paises, op);
				System.out.println(" ");
				
				System.out.println("A continuacion seguimos con los octavos de final.");
				avanzarFasePrimeros(octavos, Grupoa, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupob, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoc, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupod, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoe, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupof, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupog, partidoOctavos);
				avanzarFasePrimeros(octavos, Grupoh, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoa, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupob, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoc, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupod, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoe, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupof, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupog, partidoOctavos);
				avanzarFaseSegundos(octavos, Grupoh, partidoOctavos);	
				System.out.println("Estos son los partidos de Octavos de final.");
				System.out.println(partidoOctavos);
				partidosEliminatorias(partidoOctavos, cuartos, null, op);
				
				armadoCuartos(partidoCuartos, cuartos);
				System.out.println("Finalizaron los octavos de final, a continuacion tenemos los partidos de Cuartos de final.");
				System.out.println(partidoCuartos);
				partidosEliminatorias(partidoCuartos,semis, null, op);
				
				
				armadoSemis(partidoSemis, semis);
				System.out.println("Finalizaron los Cuartos de final, a continuacion tenemos los partidos de Semifinal.");
				System.out.println(partidoSemis);
				partidosEliminatorias(partidoSemis, finaal, tercerycuarto, op);
				
				armadoFinalyTercer(finaal, tercerycuarto, partidoFinal, partidoTercer);
				System.out.println("Finalizaron las Semifinales, a continuacion tenemos los partidos de la Final y el tercer y cuarto puesto.");
				System.out.println("Final: " + partidoFinal);
				System.out.println("Tercer y cuarto puesto: " + partidoTercer);
				partidosEliminatoriasFinales(partidoFinal, top4, op);
				partidosEliminatoriasFinales(partidoTercer, top4, op);
				int puesto=1;
				System.out.println("El top 4 de la final queda formado de la siguiente manera");
				for (int i=0; i < top4.size();i++) {
					System.out.println(puesto + " - " + top4.get(i));
					puesto++;
				}
				System.out.println("\nEl campeon es: " + top4.get(0));
				System.out.println("Finalizo el mundial Qatar 2022 \nSi desea saber las estadisticas especificas de un equipo durante todo el mundial.");
				do {
					System.out.println("Ingrese a continuacion el nombre del equipo, de lo contrario el programa finalizara.");
					seguir = entrada.nextLine();
					for (Pais pais : paises) {
						if (pais.getNombre().equalsIgnoreCase(seguir)) {
							System.out.println("Nombre\tPuntos\tPJ\tPG\tPP\tPE\tGF\tGC\tDG\tGoles Totales\n" + pais.getAbr() + "\t" + pais.getPuntos() + "\t" + pais.getPj() + "\t" + pais.getPg() + "\t" + pais.getPp() + "\t" + pais.getPe() + "\t" + pais.getGoles_favor() + "\t" + pais.getGoles_contra() + "\t" + pais.getDiferencia_goles() + "\t" + pais.getCant_gol());
						}
					}
					System.out.println("Desea preguntar las estadisticas especificas de otro equipo?");
					seguir = entrada.nextLine();
				} while(seguir.equalsIgnoreCase("si"));
				
				
			System.out.println("Desea realizar otra carga de datos de un nuevo mundial?");
			seguir = entrada.nextLine();
			} while(seguir.equalsIgnoreCase("si"));
			} 				
			break;
			default:
				System.out.println("Opcion incorrecta, por favor elija una opcion correcta la proxima vez.");
				break;
		}
	}		
}



	



