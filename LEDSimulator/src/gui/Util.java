package gui;

public class Util {

	public static int[] calcSize(int numBoxes){
		int[] size = new int[2]; // [0] is width, [1] height
		size[0] = 1;
		size[1] = numBoxes;
		for(int i=1; i<=numBoxes; i++){
			if(checkDivision(numBoxes, i)){
				
			}
		}
		
		return null;
	}
	
	private static boolean checkDivision(int numBoxes, int i){
		boolean isSquare;
		int boxesLeft = numBoxes;
		while(boxesLeft >i){
			boxesLeft -= i;
		}
		if(boxesLeft==0){
			isSquare = true;
		} else {
			isSquare = false;
		}
		return isSquare;
	}
}
