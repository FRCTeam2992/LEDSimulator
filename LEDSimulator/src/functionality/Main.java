package functionality;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import gui.Gui;
import lights.Strip;
import lights.Spot.colorScheme;

/**
 * 
 * @author Jackson Angerdina
 *
 * LED Simulator -- designed to allow easy testing of LED code. Based around Adafruit NeoPixel lights and the respective code.
 */
public class Main {
	
	public static int numPixels = 70;
	
	public static Strip strip;
	public static Gui gui;
	public static DefaultFunction dFunction;
	public static Updater updater;
	/*
	 * change if you want greater control over program
	 * custom -- greater control
	 * high -- basic control
	 */
	public static Level lev = Level.high;
	
	
	public static enum Level{
		custom, high
	}
	public static void main(String[] args) {
		
		gui = new Gui(numPixels);
		gui.GuiInit();
		gui.GuiRun();
		strip = new Strip(numPixels, colorScheme.rgb);
		JFrame frame = new JFrame();
		frame.setSize(Constants.kWidth, Constants.kHeight);
		frame.add(gui);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		setFunction();
		
		gui.setVisible(true);
			
		frame.setVisible(true);
		
		
	}
	
	public static void setFunction(){
		if(lev == Level.custom){
			dFunction = new DefaultFunction(strip, 5);
			dFunction.init();
		} else {
			updater = new Updater(strip);
			updater.run();
		}
		
	}
	
}
