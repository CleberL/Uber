
public class Motorista {

	private String nome;
	//private boolean ocupado;
	private double nota = 0;
	private int count = 0;
	private int velocidade;

	public Motorista(String nome, int velocidade) {
		this.nome = nome;
	//	this.ocupado = false;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

/*	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
*/
	public double getNota() {
		return nota;
	}

	public void setNota(double d) {
		if (d >= 0 && d <= 5) {
			this.count++;
			this.nota = (this.nota + d) / count;
		} else {
			System.out.println("A nota precisa estar entre 0 e 5");
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
