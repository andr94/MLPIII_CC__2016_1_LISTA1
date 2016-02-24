package mlpiii.questao2;

public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private boolean ligado;

	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public boolean ligar() {
		return ligado = true;
	}

	public void acelerar(int aceleracao) {
		if (!ligado)
			System.out.println("Veiculo desligado");
		else if (aceleracao > 0) {
			for (int i = 0; i < aceleracao; i++) {
				velocidadeAtual++;
				if (velocidadeAtual == velocidadeMaxima) {
					System.out.println("Velocidade maxima atingida!");
					break;
				}
			}
		} else if (aceleracao < 0) {
			for (int i = -aceleracao; i > 0; i--) {
				velocidadeAtual--;
				if (velocidadeAtual == 0) {
					System.out.println("Carrou parou");
					break;
				}
			}
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
