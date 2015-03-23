package escola;

import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public Disciplina(String nome, ArrayList<Nota> notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public Disciplina(String nome) {
		this.nome = nome;
	}

	public Double getMedia(){
		
		Double soma = 0D;
		for(int i = 0; i < notas.size(); i++){
			soma += notas.get(i).getValor();
		}
		
		return soma / notas.size();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}	
	
	public String listaNotas(){
		String str_notas = "";
		for(int i = 0; i < notas.size(); i++){
			str_notas += notas.get(i).getValor() + ", ";
		}
		return str_notas;
	}
	
	public void addNota(Double valor){
		this.notas.add(new Nota(valor));
	}
	
	
}