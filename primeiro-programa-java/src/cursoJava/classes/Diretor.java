package cursoJava.classes;

public class Diretor extends Pessoa{
	private String registroEducacao;
	private int tempoEducacao;
	private String titulacao;
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoEducacao() {
		return tempoEducacao;
	}
	public void setTempoEducacao(int tempoEducacao) {
		this.tempoEducacao = tempoEducacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoEducacao=" + tempoEducacao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", idade=" + idade + "]";
	}
	@Override
	public double salario() {
		
		return 3900.50;
	}
	
	
	

}
