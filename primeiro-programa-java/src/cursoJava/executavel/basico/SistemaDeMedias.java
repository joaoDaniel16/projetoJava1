package cursoJava.executavel.basico;

import javax.swing.JOptionPane;

public class SistemaDeMedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeAluno = JOptionPane.showInputDialog("digite o nome do aluno ");
		String nota1 = JOptionPane.showInputDialog("digite a primeira nota do aluno "+ nomeAluno);
		String nota2 = JOptionPane.showInputDialog("digite a segunda nota do aluno "+ nomeAluno);
		String nota3 = JOptionPane.showInputDialog("digite a terceira nota do aluno "+ nomeAluno);
		
		double primeiraNota = Double.parseDouble(nota1);
		double segundaNota = Double.parseDouble(nota2);
		double terceiraNota = Double.parseDouble(nota3);
		
		double somaDasNotas = primeiraNota + segundaNota + terceiraNota;
		
		double media = somaDasNotas / 3;
		
		int resposta = JOptionPane.showConfirmDialog(null, "deseja ve as notas do aluno " + nomeAluno);
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, (
					"a primeira nota foi: " + nota1 +
					" a segunda nota foi: " + nota2 + 
					" a terceira nota foi: " + nota3));
		}
		
		if (media <= 4) {
			JOptionPane.showMessageDialog(null, "o aluno esta reprovado com media " + media);
		} else if(media > 4 && media < 6){
			JOptionPane.showMessageDialog(null, "o aluno esta em recuperacao com media " + media);
		} else if (media >= 6) {
			JOptionPane.showMessageDialog(null, "o aluno esta aprovado com media " + media);
		}
	}

}
