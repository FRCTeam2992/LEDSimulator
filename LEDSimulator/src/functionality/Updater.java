package functionality;

import java.util.Timer;

import lights.*;

public class Updater{
	
	Timer time = new Timer();
	Strip s;
	
	public Updater(Strip s){
		this.s = s;
	}
	
	public void run(){
		time.scheduleAtFixedRate(new BasicLightCode(s), 0, Constants.delay);
	}

	
}
