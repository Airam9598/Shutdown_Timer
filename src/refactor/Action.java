package refactor;

import java.io.IOException;

public class Action {
	private final static String[] method = {"Apagar","Reiniciar","Cierra sesión","Hiberna"};
	public static void execute(String name,boolean forced,String time) {
		String force="";
		if(forced)force="-f";
		if (name.equals(method[0])) {
			try {Runtime.getRuntime().exec("shutdown -s "+ force+" -t "+time);} catch (IOException e) {}
		}else if (name.equals(method[1])) {
			try {Runtime.getRuntime().exec("shutdown -r "+ force+" -t "+time);} catch (IOException e) {}
		}else if (name.equals(method[2])) {
			try {Runtime.getRuntime().exec("shutdown -l");} catch (IOException e) {}
		}else if (name.equals(method[3])) {
			try {Runtime.getRuntime().exec("shutdown -h -t "+time);} catch (IOException e) {}
		}
	}
	
	public static String[] getmethod() {
		return method;
	}

}
