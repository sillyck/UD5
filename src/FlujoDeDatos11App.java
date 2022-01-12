/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class FlujoDeDatos11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Que dia de la semana quieres saber?");
		
		switch(dia) {
			case "Lunes":
				System.out.println("Hoy es dia laborable");
				break;
			case "Martes":
				System.out.println("Hoy es dia laborable");
				break;
			case "Miercoles":
				System.out.println("Hoy es dia laborable");
				break;
			case "Jueves":
				System.out.println("Hoy es dia laborable");
				break;
			case "Viernes":
				System.out.println("Hoy es dia laborable");
				break;
			case "Sabado":
				System.out.println("Hoy no es dia laborable");
				break;
			case "Domingo":
				System.out.println("Hoy no es dia laborable");
				break;
		}
		
	}

}
