package lights;

import java.awt.Color;

import javax.swing.JPanel;

public class Spot extends JPanel{
	private int spot;
	private int[] values;
	Color color;
	
	public enum colorScheme{
		rgb, rgbw, hsv, hsl
	}
	
	public void setSpot(int spot){
		this.spot = spot;
	}
	
	public int getSpot(){
		return spot;
	}
	
	public void setValues(Color color){
		
		this.color = color;
		this.setBackground(color);
	}
	
	public Color getColor(){
		return color;
	}
}
