package game;

import java.util.Random;
public class TableroLogica {

	private Boolean tablero[][];
	private Random random;
	
	public TableroLogica() {
		this.random = new Random();
		this.tablero = new Boolean[4][4];
		this.cargarEstados();
	}

	// Debe modificarse para que sea al azar
	private void cargarEstados() {
		for (int fila = 0; fila < 4; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				tablero[fila][columna] = random.nextBoolean();
				//tablero[fila][columna] = true;
			}
		}
		/*
		tablero[1][0] = false;
		tablero[0][1] = false;
		tablero[1][1] = false;
		tablero[1][2] = false;
		tablero[2][1] = false;
		*/
	}

	public void reiniciarTablero() {
		this.cargarEstados();
	}
	
	public boolean haGanado() {
		for(int fila=0; fila<4; fila++) {
			for(int col=0; col<4; col++) {
				if(!this.tablero[fila][col]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void cambiarEstados(int fila, int columna) throws IllegalArgumentException {
		
		//Chequeo que la fila y la columna contengan valores válidos
		verificarValorFilaoColumna(fila);
		verificarValorFilaoColumna(columna);
		
		this.tablero[fila][columna] = !this.tablero[fila][columna];
		
		if(fila<3) {
			this.tablero[fila+1][columna] = !this.tablero[fila+1][columna];
		}
		if(fila>0) {
			this.tablero[fila-1][columna] = !this.tablero[fila-1][columna];
		}
		if(columna>0) {
			this.tablero[fila][columna-1] = !this.tablero[fila][columna-1];
		}
		if(columna<3) {
			this.tablero[fila][columna+1] = !this.tablero[fila][columna+1];
		}

		
	}
	
	public boolean devolverEstado(int fila, int columna) {
		return this.tablero[fila][columna];
	}
	
	private void verificarValorFilaoColumna(int i) {
		if(i<0) {
			throw new IllegalArgumentException("Valor de fila inválido: "+ i);
		}
		if(i>3) {
			throw new IllegalArgumentException("Valor de fila inválido: "+ i);
		}
	}
	

}
