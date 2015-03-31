package br.ajackson;

public class Materia {

	private String nome;
	private double notas[] = new double[3];
	private int faltas;
	
	public Materia(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double calcularMedia(){
		return notas[0] + notas[1] + notas[2] / 3;
	}	
	
}