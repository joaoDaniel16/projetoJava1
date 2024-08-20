package cursoJava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("informe quantidade de carros ");
		String pessoas = JOptionPane.showInputDialog("informe quantidade de pessoas ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		JOptionPane.showMessageDialog(null, "a divisao é : " + divisao + " e soubrou "+ resto);
	}
}
