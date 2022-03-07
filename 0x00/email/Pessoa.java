
public class Pessoa {
	private String emal;
	
	public static boolean emailValid(String emal) {
		
		if ((emal.contains("@") || emal.length() <= 50)){
			return true;
		}
			else {
					return false;
			}
		
	}

}
