package game;

import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class TableroGrafico {

	private JFrame frame;
	private int cantidadDeIntentos = 10;
	private int record = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroGrafico window = new TableroGrafico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableroGrafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// recuadro intentos
		
		JLabel intentos = new JLabel("Intentos: " + getCantidadDeIntentos());
		intentos.setBounds(218, 11, 78, 22);
		frame.getContentPane().add(intentos); 
		
		// recuadro record
		
		JLabel record = new JLabel("Record: ");
		record.setBounds(306, 15, 68, 14);
		frame.getContentPane().add(record);
		
		// dificultades
		
		JComboBox<String> dificultades = new JComboBox<String>();
		dificultades.setMaximumRowCount(3);
		dificultades.setToolTipText("Dificultades");
		dificultades.setBounds(10, 11, 163, 22);
		dificultades.addItem("Fácil");
		dificultades.addItem("Normal");
		dificultades.addItem("Difícil");
		frame.getContentPane().add(dificultades); 

		//Creo una instancia de la lógica del tablero.
		TableroLogica tb = new TableroLogica();
		
		//-------CREACION DE BOTONES------------
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
		//------FIN DE CREACION DE BOTONES-------
		
		JButton matrizButton[][] = 
			{
					{btn0_0, btn0_1, btn0_2, btn0_3},
					{btn1_0, btn1_1, btn1_2, btn1_3},
					{btn2_0, btn2_1, btn2_2, btn2_3},
					{btn3_0, btn3_1, btn3_2, btn3_3}
			};
		
		
		int ubicaciones[][] = {
				{10, 47, 89, 23},{117, 47, 89, 23},{227, 47, 89, 23}, {335, 47, 89, 23},
				{10, 81, 89, 23},{117, 81, 89, 23},{227, 81, 89, 23}, {335, 81, 89, 23},
				{10, 115, 89, 23},{117, 115, 89, 23},{227, 115, 89, 23},{335, 115, 89, 23},
				{10, 149, 89, 23},{117, 149, 89, 23},{227, 149, 89, 23},{335, 149, 89, 23}
		};
		
		//FUNCION QUE UBICA A LOS BOTONES EN EL FRAME RECIBIENDO SUS UBICACIONES
		ubicarBotones(frame, matrizButton, ubicaciones, tb);
		
		//FUNCION QUE ACTUALIZA EL TEXTO DE CADA BOTON
		actualizarBotones(matrizButton, tb);
		
		//FUNCION QUE AGREGA EL EVENTO A CADA BOTON
		agregarEventos(matrizButton, tb, intentos, record, dificultades);
		

		
	}
	
	//----------FUNCION QUE ESTABLECE EL EVENTO A CADA BOTON-------------
	private void agregarEventos(JButton matrizButton[][], TableroLogica tb, JLabel intentos, JLabel record, JComboBox<String> dificultades ) {
			
		
		for(int fila=0; fila<matrizButton[0].length; fila++) {
			for(int col=0; col<matrizButton[fila].length; col++) {
			
	
				matrizButton[fila][col].addActionListener( new ActionListener()  {
					
					public void actionPerformed(ActionEvent e) {
					
						String nombreBoton = ((JButton) e.getSource()).getName();
						int fila = Integer.parseInt(nombreBoton.charAt(0)+"");
						int columna = Integer.parseInt(nombreBoton.charAt(2)+"");
						System.out.println("fila: "+fila+", columna: "+columna );
						
						// INTENTOS REDUCIDOS
						if(getCantidadDeIntentos()>0) {
							tb.cambiarEstados(fila, columna);
							setCantidadDeIntentos(getCantidadDeIntentos()-1); 
							actualizarBotones(matrizButton, tb);
							// intentos y record modificados en pantalla
							intentos.setText("Intentos: " +  Integer.toString (getCantidadDeIntentos()));
							record.setText("Record: " +  Integer.toString (getCantidadDeIntentos() * 2 ));
							
						}
						System.out.println("Intentos: "+ getCantidadDeIntentos()); 
						
						// PERDISTE
						if(getCantidadDeIntentos()==0) {
							System.out.println("Has perdido!");
							JOptionPane.showMessageDialog(null, "Has perdido!!! Te has quedado sin intentos.");
							System.exit(0);
						}
						
						// GANASTE
						else if(tb.haGanado()) {
							System.out.println("Has ganado!");
							JOptionPane.showMessageDialog(null, "Has Ganado!!!");
							System.exit(0);
						}
						
					}

				});
		
		}
		
	}
	}
	
	
	//----------FUNCION QUE SETEA EL TEXTO DE LOS BOTONES---------
	private void actualizarBotones(JButton matrizButton[][], TableroLogica tb) {
		for(int fila=0; fila<4; fila++) {
			for(int col=0; col<4; col++) {
				matrizButton[fila][col].setText(tb.devolverEstado(fila, col)+"");
				if(tb.devolverEstado(fila, col)) {
					matrizButton[fila][col].setBackground(new Color(0,255,19));
				}else {
					matrizButton[fila][col].setBackground(new Color(255,50,50));
				}
			}
			
		}
	}
	
	//--------FUNCION QUE UBICA A LOS BOTONES EN EL FRAME-------------------
	private void ubicarBotones(JFrame frame, JButton matrizButton[][], int ubicaciones[][], TableroLogica tb) {
		int a=0;
		for(int fila=0; fila<4; fila++) {
			for(int col=0; col<4; col++) {
				matrizButton[fila][col].setBounds(ubicaciones[a][0], ubicaciones[a][1], ubicaciones[a][2], ubicaciones[a][3]);
				frame.getContentPane().add(matrizButton[fila][col]);
				matrizButton[fila][col].setName(fila+"/"+col);
				a++;
			}
		
		}
		
	}
	

	public int getCantidadDeIntentos() {
		return cantidadDeIntentos;
	}

	public void setCantidadDeIntentos(int cantidadDeIntentos) {
		this.cantidadDeIntentos = cantidadDeIntentos;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}
}
