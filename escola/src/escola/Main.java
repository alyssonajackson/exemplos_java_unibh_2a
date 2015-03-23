package escola;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]){
		Aluno a1 = new Aluno("José", 123, 1);
	
		System.out.println("Maria: " + a1.getNome());
		ArrayList<Disciplina> disciplinas = a1.getDisciplinas();
		
		for(int i = 0; i < disciplinas.size(); i++){
			disciplinas.get(i).addNota(10D + new Double(i));
			disciplinas.get(i).addNota(20D + new Double(i));
			disciplinas.get(i).addNota(30D + new Double(i));
		}
		
		a1.listaDisciplinas();
		
		System.out.println("-----");
		
		Aluno a2 = new Aluno("José", 456, 2);
		
		System.out.println("Nome: " + a2.getNome());
		disciplinas = a2.getDisciplinas();
		
		for(int i = 0; i < disciplinas.size(); i++){
			disciplinas.get(i).addNota(12D + new Double(i));
			disciplinas.get(i).addNota(23D + new Double(i));
			disciplinas.get(i).addNota(34D + new Double(i));
		}
		
		a2.listaDisciplinas();
	}
	
}