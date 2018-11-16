
public class Uber {

	private double calcularDistancia(Local a, Local b) {
		if (a.getKm() > b.getKm()) {
			return a.getKm() - b.getKm();
		} else {
			return b.getKm() - a.getKm();
		}
	}

	public double calcularPreco(Motorista m, Local a, Local b) {
		int base = 10;
		return base + calcularDistancia(a, b) + (0.2 * calcularTempo(m, a, b));
	}

	public double calcularTempo(Motorista m, Local a, Local b) {
		return calcularDistancia(a, b) / m.getVelocidade() * 60;
	}

	public void avaliarMotorista(Passageiro p, Motorista m, double d) {
		m.setNota(d);
		System.out.println("O passageiro " + p.getNome() + " deu nota: " + d);
		System.out.println("Nova média do motorista " + m.getNome() + " é: " + m.getNota());
	}

	public void iniciarCorrida(Passageiro p, Motorista m, Local a, Local b) {

/*		if (m.isOcupado() == true) { 									// nunca vai estar ocupado nesse caso, mas futuramente com threads, quem sabe...
			System.out.println("O motorista está ocupado no momento!");
		} else if (p.isOcupado() == true) {
			System.out.println("O passageiro já está em uma corrida!");
		} else {     
*/		//	m.setOcupado(true);
		//	p.setOcupado(true);
			System.out.println("Corrida iniciada para " + p.getNome());
			System.out.println("Motorista: "+ m.getNome() +"     Custo: "+ calcularPreco(m, a, b));
			System.out.println("De "+a.getNome()+" para "+ b.getNome());
			int j = ((int) calcularTempo(m, a, b))/10;

			for (int i = 0; i < j; i++) {
				System.out.print(".");
			}
			
			System.out.println("Corrida Finalizada");
			System.out.println();
		//	m.setOcupado(false);
		//	p.setOcupado(false);
			
		}
	}
