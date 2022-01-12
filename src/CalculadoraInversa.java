/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {
		
		double resultat=0;
		
		String n1 = JOptionPane.showInputDialog("Introduce el primer numero");
		double numero1 = Double.parseDouble(n1);
		
		String n2 = JOptionPane.showInputDialog("Introduce el primer numero");
		double numero2 = Double.parseDouble(n2);
		
		String operador = JOptionPane.showInputDialog("Introduce el operador");
		
		switch(operador) {
		
			case "+":
				resultat = numero1 + numero2;
				break;
			case "-":
				resultat = numero1 - numero2;
				break;
			case "*":
				resultat = numero1 * numero2;
				break;
			case "/":
				resultat = numero1 / numero2;
				break;
			case "^":
				resultat = Math.pow(numero1, numero2);
				break;
			case "%":
				resultat = numero1 % numero2;
				break;
		}
		
		System.out.println("El resultat és: " + resultat);
		
	}

}
