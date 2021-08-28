package game;

import javax.swing.JButton;

public class CreacionDeTablero {
	private TableroLogica tb;
	private JButton matrizButton[][];
	private int ubicaciones[][];
	private int cantidadBotones;
	private int filas;
	private int columnas;

	public CreacionDeTablero(int filas, int columnas) {
		this.tb = new TableroLogica(filas, columnas);
		if (filas == 4 && columnas == 4) {
			this.matrizButton = this.creacionMatrizButtonIntermedio();
			this.ubicaciones= this.ubicacionesIntermedio();
			this.cantidadBotones=16;
			this.filas=filas;
			this.columnas=columnas;
		}
		if (filas == 3 && columnas == 3) {
			this.matrizButton = this.creacionMatrizButtonFacil();
			this.ubicaciones= this.ubicacionesFacil();
			this.cantidadBotones=9;
			this.filas=filas;
			this.columnas=columnas;
		}
		if (filas == 5 && columnas == 5) {
			this.matrizButton = this.creacionMatrizButtonDificil();
			this.ubicaciones= this.ubicacionesDificil();
			this.cantidadBotones=25;
			this.filas=filas;
			this.columnas=columnas;
		}
	}

	
	
	///-------------------METODOS PARA EL TABLERO EN MODO INTERMEDIO--------------------
	private JButton[][] creacionMatrizButtonIntermedio() {
		JButton btn0_0 = new JButton("New button");
		JButton btn0_1 = new JButton("New button");
		JButton btn0_2 = new JButton("New button");
		JButton btn0_3 = new JButton("New button");
		JButton btn1_0 = new JButton("New button");
		JButton btn1_1 = new JButton("New button");
		JButton btn1_2 = new JButton("New button");
		JButton btn2_0 = new JButton("New button");
		JButton btn1_3 = new JButton("New button");
		JButton btn2_1 = new JButton("New button");
		JButton btn2_2 = new JButton("New button");
		JButton btn2_3 = new JButton("New button");
		JButton btn3_0 = new JButton("New button");
		JButton btn3_1 = new JButton("New button");
		JButton btn3_2 = new JButton("New button");
		JButton btn3_3 = new JButton("New button");
		JButton[][] matriz = { { btn0_0, btn0_1, btn0_2, btn0_3 }, { btn1_0, btn1_1, btn1_2, btn1_3 },
				{ btn2_0, btn2_1, btn2_2, btn2_3 }, { btn3_0, btn3_1, btn3_2, btn3_3 } };
		return matriz;
	}

	private int[][] ubicacionesIntermedio() {
		int ubicaciones[][] = { { 10, 47, 89, 23 }, { 117, 47, 89, 23 }, { 227, 47, 89, 23 }, { 335, 47, 89, 23 },
				{ 10, 81, 89, 23 }, { 117, 81, 89, 23 }, { 227, 81, 89, 23 }, { 335, 81, 89, 23 }, { 10, 115, 89, 23 },
				{ 117, 115, 89, 23 }, { 227, 115, 89, 23 }, { 335, 115, 89, 23 }, { 10, 149, 89, 23 },
				{ 117, 149, 89, 23 }, { 227, 149, 89, 23 }, { 335, 149, 89, 23 } };
		return ubicaciones;
	}
	
	//-------------------------------FIN DE MÉTODOS PARA EL TABLERO EN INTERMEDIO-------------------------------
	
	
	
	
	///-------------------METODOS PARA EL TABLERO EN MODO FÁCIL--------------------
		private JButton[][] creacionMatrizButtonFacil() {
			JButton btn0_0 = new JButton("New button");
			JButton btn0_1 = new JButton("New button");
			JButton btn0_2 = new JButton("New button");
			JButton btn1_0 = new JButton("New button");
			JButton btn1_1 = new JButton("New button");
			JButton btn1_2 = new JButton("New button");
			JButton btn2_0 = new JButton("New button");
			JButton btn2_1 = new JButton("New button");
			JButton btn2_2 = new JButton("New button");
	
			JButton[][] matriz = { { btn0_0, btn0_1, btn0_2}, { btn1_0, btn1_1, btn1_2 },
					{ btn2_0, btn2_1, btn2_2} };
			return matriz;
		}

		private int[][] ubicacionesFacil() {
			int ubicaciones[][] = { 
					{ 46, 38, 89, 23 }, { 157, 38, 89, 23 }, { 282, 38, 89, 23 },
					{ 46, 101, 89, 23 }, {157, 101, 89, 23 }, { 282, 101, 89, 23 },
					{ 46, 155, 89, 23 }, { 157, 155, 89, 23 }, { 282, 155, 89, 23 }
					 };
			return ubicaciones;
		}
		
		//-------------------------------FIN DE MÉTODOS PARA EL TABLERO EN FÁCIL-------------------------------
	
	
		///-------------------METODOS PARA EL TABLERO EN MODO DIFICIL--------------------
		private JButton[][] creacionMatrizButtonDificil() {
			JButton btn0_0 = new JButton("New button");
			JButton btn0_1 = new JButton("New button");
			JButton btn0_2 = new JButton("New button");
			JButton btn0_3 = new JButton("New button");
			JButton btn0_4 = new JButton("New button");
			JButton btn1_0 = new JButton("New button");
			JButton btn1_1 = new JButton("New button");
			JButton btn1_2 = new JButton("New button");
			JButton btn1_3 = new JButton("New button");
			JButton btn1_4 = new JButton("New button");
			JButton btn2_0 = new JButton("New button");
			JButton btn2_1 = new JButton("New button");
			JButton btn2_2 = new JButton("New button");
			JButton btn2_3 = new JButton("New button");
			JButton btn2_4 = new JButton("New button");
			JButton btn3_0 = new JButton("New button");
			JButton btn3_1 = new JButton("New button");
			JButton btn3_2 = new JButton("New button");
			JButton btn3_3 = new JButton("New button");
			JButton btn3_4 = new JButton("New button");
			JButton btn4_0 = new JButton("New button");
			JButton btn4_1 = new JButton("New button");
			JButton btn4_2 = new JButton("New button");
			JButton btn4_3 = new JButton("New button");
			JButton btn4_4 = new JButton("New button");
			JButton[][] matriz = {
					{ btn0_0, btn0_1, btn0_2, btn0_3, btn0_4 }, { btn1_0, btn1_1, btn1_2, btn1_3, btn1_4 },
					{ btn2_0, btn2_1, btn2_2, btn2_3, btn2_4 }, { btn3_0, btn3_1, btn3_2, btn3_3, btn3_4 },
					{ btn4_0, btn4_1, btn4_2, btn4_3, btn4_4 }};
			return matriz;
		}

		private int[][] ubicacionesDificil() {
			int ubicaciones[][] = {
					{ 22, 27, 67, 23 }, { 99, 27, 67, 23}, { 176, 27, 67, 23 }, { 253, 27, 67, 23 }, { 330, 27, 67, 23 },
					{ 22, 61, 67, 23 }, {99, 61, 67, 23}, {176, 61, 67, 23}, { 253, 61, 67, 23 }, { 330, 61, 67, 23 },
					{ 22, 95, 67, 23 }, { 99, 95, 67, 23}, { 176, 95, 67, 23 }, { 253, 95, 67, 23 }, { 330, 95, 67, 23 },
					{ 22, 129, 67, 23 }, { 99, 129, 67, 23}, { 176, 129, 67, 23 }, { 253, 129, 67, 23 }, { 330, 129, 67, 23 },
					{ 22, 163, 67, 23 }, { 99, 163, 67, 23}, { 176, 163, 67, 23 }, { 253, 163, 67, 23 }, { 330, 163, 67, 23 },
					};
			return ubicaciones;
		}
		
		//-------------------------------FIN DE MÉTODOS PARA EL TABLERO EN DIFICIL-------------------------------
	
	
	
	
	public TableroLogica getTablero() {
		return this.tb;
	}
	
	public JButton[][] getMatrizButton() {
		return this.matrizButton;
	}

	
	public int[][] getUbicaciones(){
		return this.ubicaciones;
	}
	
	public int cantidadDeBotones() {
		return this.cantidadBotones;
	}
	
	public int getFilas() {
		return this.filas;
	}
	
	public int getColumnas() {
		return this.columnas;
	}
}

