package escola;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private int matricula;
	private int grau; //1 = Primeiro Grau, 2 = Segundo Grau
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	private void adiciona_disciplinas_primeiro_grau(){
		this.disciplinas.add(new Disciplina("Matemática"));
		this.disciplinas.add(new Disciplina("Português"));
		this.disciplinas.add(new Disciplina("História"));
		this.disciplinas.add(new Disciplina("Geografia"));
		this.disciplinas.add(new Disciplina("Ciências"));
	}
	
	private void adiciona_disciplinas_segundo_grau(){
		this.adiciona_disciplinas_primeiro_grau();
		this.disciplinas.add(new Disciplina("Física"));
		this.disciplinas.add(new Disciplina("Química"));
		this.disciplinas.add(new Disciplina("Biologia"));
	}
	
	public Aluno(String nome, int matricula, int grau) {
		this.nome = nome;
		this.matricula = matricula;
		this.grau = grau;
		
		if(this.grau == 1){
			this.adiciona_disciplinas_primeiro_grau();
		}else if(this.grau == 2){
			this.adiciona_disciplinas_segundo_grau();
		}
	}
	
	public void listaDisciplinas(){
		for(int i = 0; i < this.disciplinas.size(); i++){
			Disciplina d = disciplinas.get(i);
			System.out.println(d.getNome() + " (notas: " + d.listaNotas() + ")");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
}