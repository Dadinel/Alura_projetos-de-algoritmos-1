package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {
		Produto precos[] = {
				new Produto("Lamborghini", 1000000),
				new Produto( "Jipe", 46000),
				new Produto( "Brasília", 16000),
				new Produto( "Smart", 46000),
				new Produto( "Fusca", 17000)
		};

		int maisBarato = 0;

		maisBarato = buscaMenor(precos, 0, precos.length - 1);

		System.out.println(maisBarato);
		System.out.println("O carro " + precos[maisBarato].getNome()
				+ ", é o mais barato, e custa "
				+ precos[maisBarato].getPreco());
		
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;

		for (int atual = inicio; atual <= termino; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}

		return maisBarato;
	}
}