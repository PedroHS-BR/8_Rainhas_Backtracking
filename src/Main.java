
public class Main {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciarTabuleiro();
		boolean casoBase = true;
		while (casoBase) {
			casoBase = tabuleiro.inserirRainha();
		}
		tabuleiro.imprimirTabuleiro();
	}
}
