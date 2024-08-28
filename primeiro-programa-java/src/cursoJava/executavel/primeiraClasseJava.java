package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class primeiraClasseJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		
		for (int i = 0; i <= 1; i++) {
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
		
		
		
		while(verificador) {
			
			String disciplina = JOptionPane.showInputDialog("digite o nome da disciplina");
			
			Disciplina disciplinas = new Disciplina();
			
			disciplinas.setDisciplina(disciplina);
			
			if(disciplinas.getDisciplina()!=null) {
				String nota = JOptionPane.showInputDialog("digite a nota da disciplina");
				
				disciplinas.setNota(Integer.valueOf(nota));
				aluno1.getDisciplinas().add(disciplinas);
				
			}else {
				verificador = false;
			}
				
		}
		
		
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
		
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("joao")) {
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
		
		
		
	
	}
	
}
