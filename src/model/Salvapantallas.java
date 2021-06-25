package model;

public class Salvapantallas {
	private String disco = System.getProperty("user.home").substring(0,System.getProperty("user.home").indexOf(":"))+":\\Windows\\System32\\";
	private String[] salvapantallas= {"Burbujas","Nombre","Mistico","Ribbon"};
	private String[] archivos= {"Bubbles.scr","ssText3d.scr","Mystify.scr","Ribbons.scr"};
	private String Actual;
	public Salvapantallas() {
		this.Actual=salvapantallas[0];
	}
	public String getActual() {
		return Actual;
	}
	public String setActual(int valor) {
		return Actual=salvapantallas[valor];
	}
	public void Active() {
		if(Actual==salvapantallas[0]){
			try{Runtime.getRuntime().exec ("cmd /c "+disco+archivos[1]+" /s");}catch (Exception e){}
		}else if(Actual==salvapantallas[1]){
			try{Runtime.getRuntime().exec ("cmd /c "+disco+archivos[2]+" /s");}catch (Exception e){}
		}else if(Actual==salvapantallas[2]){
			try{Runtime.getRuntime().exec ("cmd /c "+disco+archivos[3]+" /s");}catch (Exception e){}
		}else if(Actual==salvapantallas[3]){
			try{Runtime.getRuntime().exec ("cmd /c "+disco+archivos[4]+" /s");}catch (Exception e){}
		}
		
	}
	public void View(int valor) {
		try{Runtime.getRuntime().exec ("cmd /c "+disco+archivos[valor]+" /s");}catch (Exception e){}
	}
	
}
