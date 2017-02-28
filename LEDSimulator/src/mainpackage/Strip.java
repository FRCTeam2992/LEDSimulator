package mainpackage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Strip extends TimerTask{
	ArrayList<Spot> lights;
	Spot.colorScheme kType;
	boolean isEnabled = false;
	
	public Strip(int numPixels, Spot.colorScheme type){
		lights = new ArrayList<Spot>(numPixels);
		kType = type;
		
		switch (type){
		case rgb:
			for(int i=0; i<numPixels; i++){
				RGB led = new RGB(i);
				lights.set(i, led);
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
	
	
	public void setPixelColor(int spot, int[] values){
		lights.get(spot).setValues(values);
	}
	
	public void begin(){
		new Timer().scheduleAtFixedRate(this, 0, 1);//1 millisecond intervals by default
		isEnabled = true;
	}
	
	public synchronized void show(){
		
	}
	
	public void delay(int milliseconds) throws InterruptedException{
		this.wait(milliseconds);
	}


	@Override
	public void run() {
		
	}
	
}
