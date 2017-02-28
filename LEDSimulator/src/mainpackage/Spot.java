package mainpackage;

public class Spot {
	private int spot;
	private int[] values;
	
	public enum colorScheme{
		rgb, rgbw, hsv, hsl
	}
	
	public void setSpot(int spot){
		this.spot = spot;
	}
	
	public int getSpot(){
		return spot;
	}
	
	public void setValues(int[] values){
		this.values = values;
	}
	
	public int[] getValues(){
		return values;
	}
}
