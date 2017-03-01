package gui;

public class Util {

	public static int[] calcSize(int numBoxes){
		int[] size = new int[2]; // [0] is width, [1] height
		size[0] = 1;
		size[1] = numBoxes;
		for(int i=1; i<=numBoxes; i++){
			int bestscore = numBoxes;
			if(numBoxes%i == 0){
				int newScore =  (numBoxes/i + i - 1);
				if(newScore > bestscore){
					bestscore = newScore;
					size[0] = i;
					size[1] = numBoxes/i;
				}
			}
		}
		
		return size;
	}
	
	
}
