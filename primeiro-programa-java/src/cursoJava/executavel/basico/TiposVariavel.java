package cursoJava.executavel.basico;

public class TiposVariavel {
	
	public static void main(String[] args) {
		int nota1 = 4;
		int nota2 = 10;
		int nota3 = 8;
		int nota4 = 6;
		int qtdSemestres = 4;
		String nome = "joao daniel";
	
		double somaDasMedias = nota1 + nota2 + nota3 + nota4;
		double media = somaDasMedias/qtdSemestres;
		
		System.out.println("o aluno " + nome +" ficou com a media de " + media);
		
	}
}
