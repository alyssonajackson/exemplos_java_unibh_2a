package br.ajackson;

public class Main {

	public static void main(String args[]) {
		
		Fundamental aluno1 = new Fundamental();
		System.out.println(aluno1.getPortugues().getNome());
		
		aluno1.getPortugues().setNotas(new double[]{10, 20, 30});
		
		aluno1.getPortugues().calcularMedia();
		
	}
	
}
