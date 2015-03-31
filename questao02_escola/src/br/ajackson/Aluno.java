package br.ajackson;

public abstract class Aluno {
	
	private String nome;
	private String serie;
	private int matricula;
	
	private Materia portugues = new Materia("Português");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Materia getPortugues() {
		return portugues;
	}

	public void setPortugues(Materia portugues) {
		this.portugues = portugues;
	}
	
	

}