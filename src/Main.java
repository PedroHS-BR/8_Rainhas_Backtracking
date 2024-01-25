
public class Main {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciarTabuleiro();
		boolean casoBase = true;
		int resoluções = 0;
		
		for (int i = 0; i < 92; i++) {
			while (tabuleiro.getQtdRainhas() < 8) {
				while (casoBase && tabuleiro.getQtdRainhas() < 8) {
					casoBase = tabuleiro.inserirRainha(0);
				}
	
				if(tabuleiro.getQtdRainhas() < 8) {
	
					tabuleiro.backTrancking();
					casoBase = true;
				}
			}
			resoluções++;
			System.out.println("\n" + resoluções);
			
			tabuleiro.imprimirTabuleiroLimpo();
			tabuleiro.backTrancking();
		}
		
	}
}
