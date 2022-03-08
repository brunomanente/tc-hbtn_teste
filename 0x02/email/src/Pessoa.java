
public class Pessoa {
	private String emal;
	
	public static boolean emailValid(String email) {
		
		if ((email.contains("@") || email.length() <= 50)){
			return true;
		}
			else {
					return false;
			}
		
	}

}