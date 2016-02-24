package mlpiii.questao3;

public class FabricaDeCarro {

	private static FabricaDeCarro instance;

	public String toString() {
		if (instance != null) {
			return ("Unica instacia de fabrica de carro");
		} else {
			return ("Nehuma instanca");
		}
	}

	static {

	}

	private FabricaDeCarro() {

	}

	public static FabricaDeCarro getInstance() {
		if (instance == null) {
			inicializaInstancia();
		}
		return instance;
	}

	private static synchronized void inicializaInstancia() {
		if (instance == null) {
			instance = new FabricaDeCarro();
		}
	}
}