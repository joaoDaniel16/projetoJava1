package cursoJava.executavel.basico;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("informe quantidade de carros ");
		String pessoas = JOptionPane.showInputDialog("informe quantidade de pessoas ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "deseja ve o resultado da divisao?");
		
		
		System.out.println(resposta);
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "a divisao é : " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "deseja ve o resto da divisao?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "a resto é : " + resto);
		}
	
	}
}
