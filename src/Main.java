
public class Main {

	public static void main(String[] args) {
		Uber u = new Uber();

		Passageiro p1 = new Passageiro("Geovanne");
		Passageiro p2 = new Passageiro("Thomás");
		Passageiro p3 = new Passageiro("Morgana");

		Motorista m1 = new Motorista("Matheus", 100);
		Motorista m2 = new Motorista("Breno", 90);
		Motorista m3 = new Motorista("Adriano", 80);

		Local l1 = new Local("Caruaru", 132);
		Local l2 = new Local("Recife", 0);
		Local l3 = new Local("Belo Jardim", 183);

		u.iniciarCorrida(p1, m1, l1, l3);
		u.iniciarCorrida(p1, m2, l1, l2);
		u.iniciarCorrida(p3, m2, l2, l2);
		u.iniciarCorrida(p2, m3, l2, l3);
		u.iniciarCorrida(p2, m2, l2, l3);
		u.avaliarMotorista(p1, m1, 4.7);

	}

}
