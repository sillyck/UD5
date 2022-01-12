/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class FlujoDeDatos6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21; 
		
		String entrada = JOptionPane.showInputDialog("Introduce el precio del producto");
		double numero = Double.parseDouble(entrada);
		
		double resultat = numero*IVA;
		
	}

}
