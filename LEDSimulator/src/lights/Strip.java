package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Timer;

import functionality.Main;
import gui.Gui;

public class Strip{
	
	ArrayList<Spot> lights;
	Spot.colorScheme kType;
	Gui gui = Main.gui;
	boolean isEnabled = false;
	int numPixels;
	
	public Strip(int numPixels){
		this.numPixels = numPixels;
		lights = new ArrayList<Spot>(numPixels);
		kType = Spot.colorScheme.rgb;
	}
	public Strip(int numPixels, Spot.colorScheme type){
		this.numPixels = numPixels;
		lights = new ArrayList<Spot>(numPixels);
		kType = type;
		
		switch (type){
		case rgb:
			for(int i=0; i<numPixels; i++){
				RGB led = new RGB(i);
				lights.add(i, led);
			}
			break;
		case rgbw:
			break;
		case hsv:
			break;
		case hsl:
			break;
		default:
			break;
		
		}
	}
	
	// set to simulate the begin() function within the neopixel code
	public void begin(){
		isEnabled = true; 
	}
	
	public void show(){
		for(int i=0; i<numPixels; i++){
			gui.getComponent(i).setBackground(getSpot(i).getColor());//update gui
		}
	}
	
	public void setPixelColor(int spot, Color color){
		lights.get(spot).setValues(color);
	}
	
	public void setPixelColor(int spot, int R, int G, int B){
		Color color = new Color(R,G,B);
		lights.get(spot).setValues(color);
	}

	public Spot getSpot(int spot){
		return lights.get(spot);
	}
	
	public int numPixels(){
		return numPixels;
	}

	
	
}
