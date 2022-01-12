/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class FlujoDeDatos5App {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introduce el numero");
		double numero = Double.parseDouble(entrada);
		
		if(numero % 2 == 0) {
			System.out.println("El numero és divisble entre dos");
		}else {
			System.out.println("El numero NO és divisble entre dos");
		}

	}

}
