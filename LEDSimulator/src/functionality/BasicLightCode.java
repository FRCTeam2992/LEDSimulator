package functionality;

import java.awt.Color;
import java.util.TimerTask;

import lights.*;
/**
 * 
 * @author Jackson Angerdina
 *
 * allows for high level testing, exactly as seen on an arduino with Adafruit neopixels
 * works with only one strip of lights
 * 
 * @todo fix delay() function. doesn't work.
 */
public class BasicLightCode extends TimerTask{

	Strip strip;
	int j = 0;
	
	/*
	 * Color color = new Color(r, g, b); RGB color [0, 255]
	 */
	
	public BasicLightCode(Strip s){
		
		strip = s;
	}
	
	void init(){
		strip.begin();
	}
	
	void loop(){
		j++;
		for(int i=0; i<strip.numPixels(); i++){
			Color color = new Color((i+j+170)%255, (i+j)%255, (i+j + 85)%255);
			strip.setPixelColor(i, color);
		}
		strip.show();
	}

	
	
	
	
	// ignore below -- needed for proper looping of code
	@Override
	public void run() {
		loop();
		
	}
	
	/* 
	private void delay(long milliseconds){
		try {
			this.wait(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
}
