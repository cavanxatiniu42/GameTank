package models;


import constants.Images;
public class MapDemo {
	/**
	 * Init a map with items
	 */
	public static void main(String[] args) {
		Map map = new Map(1);
		
		Game game = new Game(map);
		game.setVisible(true);

//		Item iRock = new Item(Images.ROCK, 2*20, 1*20, 20);
//		Item iTank = new Item(Images.TANK_BLUE_DOWN, 4*20, 5*20, 20);
//		Item iTree = new Item(Images.TREE, 3*20, 7*20, 20);

	}
}
