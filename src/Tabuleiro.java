
public class Tabuleiro {
	// private int[][] rainhas;
	private char[][] tabuleiro;
	private int qtdRainhas;

	public Tabuleiro() {
		// this.rainhas = new int[8][2];
		this.tabuleiro = new char[8][8];
		this.qtdRainhas = 0;
	}

	public void iniciarTabuleiro() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tabuleiro[i][j] = '.';
			}
		}
	}

	public void imprimirTabuleiro() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println();
		}
	}

	public boolean inserirRainha() {
		int contador = 0;
		while (contador < 8) {
			if (tabuleiro[qtdRainhas][contador] == '.') {
				tabuleiro[qtdRainhas][contador] = 'M';
				qtdRainhas++;
				this.ataque(qtdRainhas, contador);
				return true;
			} else
				contador++;
		}
		return false;
	}
	
	public void ataque(int a, int b) {
		a--;
		int c = a;
		int d = b;
		//baixo
		while (c < 7) {
			c++;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//cima
		 c = a;
		 d = b;
		while (c > 0) {
			c--;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//direita
		c = a;
		d = b;
		while (d < 7) {
			d++;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//esquerda
		c = a;
		d = b;
		while (d> 0) {
			d--;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//cima direita
		c = a;
		d = b;
		while (c > 0 && d < 7) {
			c--;
			d++;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//baixo direita
		c = a;
		d = b;
		while (c < 7 && d < 7) {
			c++;
			d++;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//cima esquerda
		c = a;
		d = b;
		while (c > 0 && d > 0) {
			c--;
			d--;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		//baixo esquerda
		c = a;
		d = b;
		while (c < 7 && d > 0) {
			c++;
			d--;
			if (tabuleiro[c][d] == '.') tabuleiro[c][d] = (char)(qtdRainhas + 48);
		}
		
		
	}

}
