package cursoJava.executavel.basico;

public class OperadorLogico {

	public static void main(String[] args) {
		// operacoes logicas

		int nota1 = 8;
		int nota2 = 6;
		int nota3 = 7;
		int nota4 = 0;
		int qtdSemestres = 4;

		double somaDasNotas = nota1 + nota2 + nota3 + nota4;
		double media = somaDasNotas / qtdSemestres;

		if (media >= 7) {
			// System.out.println("aprovado com media " + media);
		} else {
			// System.out.println("reprovado com media " + media);
		}

		// *operador ternario* serve para microvalidacoes

		String saidaResultado;

		saidaResultado = media >= 7 ? "aluno aprovado" : "aluno reprovado";

		// System.out.println(saidaResultado);

		// *operacoes logicas alinhadas* operacao dentro de operacao

		if (media >= 5) {
			if (media >= 7) {
				// System.out.println("aluno aprovado direto");
			} else {
				// System.out.println("aluno em recuperacao");
			}
		} else {
			// System.out.println("aluno reprovado");
		}
		// switch case
		int dia = 1;
		switch (dia) {
		case 1:
			// System.out.println("domingo");
			break;
		case 2:
			// System.out.println("segunda");
			break;
		case 3:
			// System.out.println("terca");
			break;
		case 4:
			// System.out.println("quarta");
			break;
		case 5:
			// System.out.println("quinta");
			break;
		case 6:
			// System.out.println("sexta");
			break;
		case 7:
			// System.out.println("sabado");
			break;
		default: // System.out.println("error");
			break;
		}

	}

}
