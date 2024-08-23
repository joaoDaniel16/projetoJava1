package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class primeiraClasseJava {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("digite o nome do aluno");
		String dataNascimento = JOptionPane.showInputDialog("digite a data de nascimento do aluno");
		String registroGeral = JOptionPane.showInputDialog("digite o registro geral do aluno");
		String numeroCpf = JOptionPane.showInputDialog("digite o numero de CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("digite o nome da mae do aluno");
		String nomePai = JOptionPane.showInputDialog("digite o nome do pai do aluno");
		String dataMatricula = JOptionPane.showInputDialog("digite a data da matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("digite o nome da escola do aluno");
		String serieMatriculado = JOptionPane.showInputDialog("digite a serie matricualda do aluno");
		String idade = JOptionPane.showInputDialog("digite idade do aluno");
		
		String disciplina1 = JOptionPane.showInputDialog("digite a primeira disciplina do aluno");
		String nota1 = JOptionPane.showInputDialog("digite a primeira nota do aluno");
		
		String disciplina2 = JOptionPane.showInputDialog("digite a segunda disciplina do aluno");
		String nota2 = JOptionPane.showInputDialog("digite a segunda nota do aluno");
		
		String disciplina3 = JOptionPane.showInputDialog("digite a terceira disciplina do aluno");
		String nota3 = JOptionPane.showInputDialog("digite a terceira nota do aluno");
		
		String disciplina4 = JOptionPane.showInputDialog("digite a guarta disciplina do aluno");
		String nota4 = JOptionPane.showInputDialog("digite a quarta nota do aluno");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		aluno1.getDisciplina().setDiciplica1(disciplina1);
		aluno1.getDisciplina().setDiciplica2(disciplina2);
		aluno1.getDisciplina().setDiciplica3(disciplina3);
		aluno1.getDisciplina().setDiciplica4(disciplina4);
		
				
		aluno1.getMediaNota();
		
		System.out.println(aluno1.toString());
		System.out.println(aluno1.getMediaNota());
		System.out.println(aluno1.getResultado());
		
		
		/*
		// equals e hashcode (diferenciar e comparar objetos) //
		Aluno aluno1 = new Aluno();
		aluno1.setNome("joao");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("joao");
		
		
		if(aluno1.equals(aluno2)) {
			System.out.println("os alunos sao iguais");
		}else {
			System.out.println("os alunos sao diferente");
		}
		*/
		
	}
	
}
