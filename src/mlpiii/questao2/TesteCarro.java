package mlpiii.questao2;

public class TesteCarro {
	public static void main(String[] args) {

		Carro c = new Carro("Vermelho", "Enzo", 0, 310);
		c.ligar();
		c.acelerar(150);
		c.acelerar(-100);
		System.out.println("Velocidade Atual: " + c.getVelocidadeAtual() + " km/h");

	}
}
