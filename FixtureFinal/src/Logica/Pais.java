package Logica;

import java.util.Comparator;

public class Pais{
	private String nombre;
	private int cant_gol ;
	private boolean clasificado;
	private String grupo;
	private int puntos;
	private int pg;
	private int pp;
	private int pe;
	private int pj;
	private int goles_favor;
	private int goles_contra;
	private int diferencia_goles;
	private String abr;
	public Pais(String nombre, int cant_gol, boolean clasificado, String grupo, int puntos, int pg, int pp, int pe, int pj, String abr, int goles_favor,int goles_contra, int diferencia_goles) {
		super();
		this.nombre = nombre;
		this.cant_gol = goles_favor;
		this.clasificado = clasificado;
		this.grupo = grupo;
		this.puntos = puntos;
		this.pg = pg;
		this.pp = pp;
		this.pe = pe;	
		this.abr = abr;
		this.goles_favor = goles_favor;
		this.goles_contra = goles_contra;
		this.diferencia_goles = diferencia_goles;
	}
	public int getGoles_favor() {
		return goles_favor;
	}
	public void setGoles_favor(int goles_favor) {
		this.goles_favor = goles_favor;
	}
	public int getGoles_contra() {
		return goles_contra;
	}
	public void setGoles_contra(int goles_contra) {
		this.goles_contra = goles_contra;
	}
	public int getDiferencia_goles() {
		return diferencia_goles;
	}
	public void setDiferencia_goles(int diferencia_goles) {
		this.diferencia_goles = diferencia_goles;
	}
	public String getAbr() {
		return abr;
	}
	public void setAbr(String abr) {
		this.abr = abr;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public int getPe() {
		return pe;
	}
	public void setPe(int pe) {
		this.pe = pe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCant_gol() {
		return cant_gol;
	}
	public void setCant_gol(int cant_gol) {
		this.cant_gol = cant_gol;
	}
	public boolean isClasificado() {
		return clasificado;
	}
	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int getPj() {
		return pj;
	}
	public void setPj(int pj) {
		this.pj = pj;
	}
	@Override
	public String toString() {
		return nombre;
	}


	
	
}
