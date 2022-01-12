/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class FlujoDeDatos10App {

	public static void main(String[] args) {
		
		String entrada1 = JOptionPane.showInputDialog("Quantes vendes vols indtoduir?");
		int numeroVentas = Integer.parseInt(entrada1);
		
		numeroVentas += 1;
		
		for(int i=1; i<numeroVentas; i++) {
			String entrada = JOptionPane.showInputDialog("Quin es el valor de la venda numero " + i);
			double resultat = Double.parseDouble(entrada);
			
			System.out.println(resultat);
			
		}
		
	}

}
