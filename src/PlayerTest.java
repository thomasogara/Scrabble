/*
  Code Authors:
  Thomas O'Gara (18379576) (thomas.ogara@ucdconnect.ie)
  Jarrett (18375813 (jarrett.pierse@ucdconnect.ie)
  Daniel (17481174) (daniel.nwabueze@ucdconnect.ie)
 */

public class PlayerTest {

    public static Board gameBoard;
    public static Pool gamePool;

    public static Player player1;
    public static Player player2;

    public static void main(String[] args) {

        // Intialise the game board
        gameBoard = new Board();
        gameBoard.points[0][0].setTile(new Tile('A'));
        gameBoard.points[1][0].setTile(new Tile('B'));
        gameBoard.points[0][1].setTile(new Tile('G'));
        gameBoard.points[0][2].setTile(new Tile('E'));

        System.out.println(gameBoard.points[0][0].getFormedWords());

//
//        // Initialise the game pool
//        gamePool = new Pool();
//
//        // Print the number of tiles in the pool
//        System.out.println("There are " + gamePool.getTilePoolCount() + " tiles currently in the pool!\n");
//
//        // Create player instances
//        player1 = new Player("player 1");
//        player2 = new Player("player 2");
//        System.out.println("Player 1, '" + player1.displayUsername() + "' was created with " + player1.getScore() + " points!");
//        System.out.println("Player 2, '" + player2.displayUsername() + "' was created with " + player2.getScore() + " points!");
//
//        // Refill each respective players' frames ; select 'x' random tiles from the pool for each player
//        System.out.println("Filling Player 1 & Player 2's frames..");
//        player1.getFrame().refill();
//        player2.getFrame().refill();
//        System.out.println("\n");
//
//        // Print the letters in each players test
//        System.out.println("Player 1's Frame: " + player1.getFrame().getLettersAsString());
//        System.out.println("Player 2's Frame: " + player2.getFrame().getLettersAsString());
//
//        // Print the updated tile count in the pool after some were taken out previously
//        System.out.println("There are " + gamePool.getTilePoolCount() + " tiles left in the pool!\n");
//
//        // Reset the pool
//        gamePool.resetPool();
//
//        // Print the updated count of the pool, as the pool should be replenished
//        System.out.println("There are " + gamePool.getTilePoolCount() + " tiles left in the pool!\n");
//
//        // Reset both players' data
//        player1.resetUser();
//        player2.resetUser();
//        System.out.println("Reset both players' data!");
//
//        // Set new usernames for both players
//        player1.setUsername("player 1 new name");
//        player2.setUsername("player 2 new name");
//        System.out.println("Player 1's name has been changed to: " + player1.getUsername());
//        System.out.println("Player 2's name has been changed to: " + player2 .getUsername());
//        System.out.println("\n");
//
//        // Increase the Player 1's score
//        player1.increaseScore(3);
//        System.out.println("Player 1's score has been increased by 3 points. Current score: " + player1.getScore() + "\n");
//
//        // Remove a random tile from Player 1's Frame & print their updated frame
//        Tile randomPlayer1Tile = player1.getFrame().getLetters().get(0);
//        System.out.println("Removing the '" + randomPlayer1Tile.getValue() + "' tile from Player 1's Frame..");
//        player1.getFrame().removeAll("" + randomPlayer1Tile.getValue());
//        System.out.println("Player 1's Frame: " + player1.getFrame().getLettersAsString());

    }


}
