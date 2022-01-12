/**
 * @author Jordi Ribellas Ramos
 */
import javax.swing.*;
public class FlujoDeDatos4App {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introduce el radio del circulo");
		double numero = Double.parseDouble(entrada); //Aqui ya tenemos la entrada en formato double.
		
		double resultat = Math.PI * Math.pow(numero, 2);
		
		System.out.println(resultat);
	}

}
