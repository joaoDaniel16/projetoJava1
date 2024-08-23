package cursoJava.classes;

import java.util.Objects;

public class Disciplina {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	private String diciplica1;
	private String diciplica2;
	private String diciplica3;
	private String diciplica4;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public String getDiciplica1() {
		return diciplica1;
	}
	public void setDiciplica1(String diciplica1) {
		this.diciplica1 = diciplica1;
	}
	public String getDiciplica2() {
		return diciplica2;
	}
	public void setDiciplica2(String diciplica2) {
		this.diciplica2 = diciplica2;
	}
	public String getDiciplica3() {
		return diciplica3;
	}
	public void setDiciplica3(String diciplica3) {
		this.diciplica3 = diciplica3;
	}
	public String getDiciplica4() {
		return diciplica4;
	}
	public void setDiciplica4(String diciplica4) {
		this.diciplica4 = diciplica4;
	}
	
	
	
	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ ", diciplica1=" + diciplica1 + ", diciplica2=" + diciplica2 + ", diciplica3=" + diciplica3
				+ ", diciplica4=" + diciplica4 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(diciplica1, diciplica2, diciplica3, diciplica4, nota1, nota2, nota3, nota4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(diciplica1, other.diciplica1) && Objects.equals(diciplica2, other.diciplica2)
				&& Objects.equals(diciplica3, other.diciplica3) && Objects.equals(diciplica4, other.diciplica4)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}
	
	
}
