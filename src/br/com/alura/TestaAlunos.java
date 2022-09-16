package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
//		Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Daniel Oliveira");
		alunos.add("Alberto Alcanta");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Alcanta");
		
		boolean danielEstaMatriculado = alunos.contains("Daniel Oliveira");
		alunos.remove("Sergio Lopes");
		System.out.println(danielEstaMatriculado);

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
			
			
		}


		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println();
	
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
	


}
