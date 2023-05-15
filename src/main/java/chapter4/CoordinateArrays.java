package chapter4;

public class CoordinateArrays {

	public static void main(String[] args) {

//		String [][][][] restaurants = new String[90][100][180][100];
//		
//		restaurants[46][69][93][25] = "Bann's Bar and Grill";
//		restaurants[46][72][93][21] = "The Blue Moose on the Lake";
//		restaurants[46][72][93][31] = "Zorbaz";
//		restaurants[45][10][93][46] = "El Rodeo";
//		restaurants[41][51][100][72] = "Pizzeria Uno";
//		
//		System.out.println(restaurants[46][69][93][25]);
		
		String [][] gameGrid = new String[5][5];
		
		gameGrid[4][3] = "Alissa - Ranger";
		gameGrid[4][4] = "Arjhan - Fighter";
		gameGrid[5][4] = "Immeril - Wizard";
		gameGrid[1][3] = "Kat - Rogue";
		gameGrid[2][3] = "Thogrim - Cleric";
		
		System.out.println(gameGrid[4][3]);
		
	}

}
