package functionality;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import lights.Strip;

/**
 * example of base function for 
 */
public class DefaultFunction extends TimerTask{
	
	int numPixels;
	int j;
	int delay = 1; // default to 1 ms
	Strip s;
	Timer timer = new Timer();
	double newDelay;
	
	public DefaultFunction(Strip s) {
		this.s = s;
		numPixels = s.numPixels();
	}
	public DefaultFunction(Strip s, int delay) {
		
		j=0;
		this.delay = delay;
		this.s = s;
		numPixels = s.numPixels();
	}
	
	public void setDelay(int delay){
		newDelay = delay;
	}
	
	public void init(){
		timer.scheduleAtFixedRate(this, 0, delay);
	}
	
	public void run(){
		j++;
		for(int i=0; i<numPixels; i++){
			Color color = new Color(255,((i+j) * 255 / numPixels/2)%255 ,((i+j) * 255 / numPixels/2)%255);
			s.setPixelColor(i, color);
		}
		s.show();
	}
	
	
}
