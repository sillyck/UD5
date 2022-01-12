/**
 * @author Jordi Ribellas
 */
public class FlujoDeDatos9App {

	public static void main(String[] args) {
		
		int n=1;
		
		while(n!=101){
			if(n % 2 == 0 || n % 3 == 0) {
				System.out.println(n);
				n += 1;
			}else {
				n += 1;
			}
		}
	}

}
