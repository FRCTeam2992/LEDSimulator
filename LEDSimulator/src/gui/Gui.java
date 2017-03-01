package gui;

import javax.swing.*;

import functionality.Constants;

import java.awt.*;
import java.util.ArrayList;

public class Gui extends JPanel{
	int num;
	int[] size;
	
	ArrayList<JPanel> frame;
	
	public Gui(int numPixels){
		num = numPixels;
		frame = new ArrayList<JPanel>();
		size = Util.calcSize(num);
		this.setSize(Constants.kWidth, Constants.kHeight);
		for(int i=0; i<num; i++){
			JPanel item = new JPanel();
			frame.add(i, item);
			
		}
	}
	
	public void GuiInit(){
		
		
	}
	
	public void GuiRun(){
		for(int i=0; i<num; i++){
			this.add(frame.get(i));
			frame.get(i).setVisible(true);
		}
	}
}
