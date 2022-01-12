/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class FlujoDeDatos12App {

	public static void main(String[] args) {
		
		String contra = "Password";
		String dia = "";
		int intents = 3;
				
		do{
			dia = JOptionPane.showInputDialog("Cual es la contrasenya?");
			
			if(dia.equals(contra)) {
				System.out.println("Enhorabuena");
				break;
			}else {
				intents--;
			}
			
		}while(intents!=0 || dia.equals(contra));
		
		if(intents == 0) {
			System.out.println("Te has quedado sin intentos");
		}
	}

}
