package cursoJava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;
import cursoJava.classes.StatusAluno;

public class primeiraClasseJava {

	public static void main(String[] args) {
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		List<Aluno> alunos = new ArrayList<Aluno>();

		// repeticao para os alunos 
		for (int i = 0; i <= 2; i++) {
		String nome = JOptionPane.showInputDialog("digite o nome do aluno");
		/*String dataNascimento = JOptionPane.showInputDialog("digite a data de nascimento do aluno");
		String registroGeral = JOptionPane.showInputDialog("digite o registro geral do aluno");
		String numeroCpf = JOptionPane.showInputDialog("digite o numero de CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("digite o nome da mae do aluno");
		String nomePai = JOptionPane.showInputDialog("digite o nome do pai do aluno");
		String dataMatricula = JOptionPane.showInputDialog("digite a data da matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("digite o nome da escola do aluno");
		String serieMatriculado = JOptionPane.showInputDialog("digite a serie matricualda do aluno");
		String idade = JOptionPane.showInputDialog("digite idade do aluno");*/
		
		Aluno aluno1 = new Aluno();
		
		boolean verificador = true;
		
		// repeticao para as disciplinas
		while(verificador) {
			
			String disciplina = JOptionPane.showInputDialog("digite o nome da disciplina");
			
			Disciplina disciplinas = new Disciplina();
			
			disciplinas.setDisciplina(disciplina);
			
			if(disciplinas.getDisciplina()!=null) {
				String nota = JOptionPane.showInputDialog("digite a nota da disciplina");
				
				
				disciplinas.setNota(Double.parseDouble(nota));
				aluno1.getDisciplinas().add(disciplinas);
				
			}else {
				verificador = false;
			}
				
		}
			
		/*
		int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina:" );
		
		int continuarRemover = 0;
		if (escolha == 0) {
			while (continuarRemover == 0) {
				
			JOptionPane.showMessageDialog(null, aluno1.mostrarDisciplinas());
			String removerDisciplina = JOptionPane.showInputDialog("selecione a disciplina a remover");
			aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - 1);
			continuarRemover = JOptionPane.showConfirmDialog(null, "deseja remover mais?");
			}	
		}
		*/
		
		aluno1.setNome(nome);
		//System.out.println(aluno1.getNome());
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setIdade(Integer.valueOf(idade));*/
				
		alunos.add(aluno1);
		}
		
		/*
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("passar o nome do aluno")) {
				alunos.remove(aluno);
				break;
			
			}else {
				System.out.println(aluno);
				System.out.println(aluno.getMediaNota());
				System.out.println(aluno.getResultado());
				System.out.println("-----------------------------------");
			}
			
			for (Aluno aluno2 : alunos) {
				System.out.println("sobrou na lista: ");
				System.out.println(aluno2.getNome());
				System.out.println("e suas disciplinas sao:");
				for (Disciplina disciplina : aluno2.getDisciplinas()) {
					System.out.println(disciplina.getDisciplina());
				}
			} 
 
		 }
		 */
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if (aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
				}else if(aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("lista de alunos aprovados");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("resultado :" + aluno.getNome() + " " + aluno.getResultado() 
			+ " com media de : " + aluno.getMediaNota());
		}
		
		System.out.println("lista de alunos em recuperacao");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("resultado :" + aluno.getNome() + " "  + aluno.getResultado() 
			+ " com media de : " + aluno.getMediaNota());
		}
		
		System.out.println("lista de alunos reprovado");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("resultado :" + aluno.getNome() + " " + aluno.getResultado() 
			+ " com media de : " + aluno.getMediaNota());
		}
	}
}
