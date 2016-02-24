package mlpiii.questao1;

public class TesteFatura {
	public static void main(String[] args) {
		Fatura fat = new Fatura("021.395", "Parafusos", 350,  0.7) ;
		System.out.printf("Valor da fatura: R$%.2f", fat.getValorFatura());
	}
}
