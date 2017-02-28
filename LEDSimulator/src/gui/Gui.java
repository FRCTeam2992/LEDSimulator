package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JPanel{
	int num;
	
	public Gui(int numPixels){
		num = numPixels;
	}
	
	public void GuiInit(){
		Util.calcSize(num);
	}
}
