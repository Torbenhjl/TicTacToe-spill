package holaaaa;

import java.util.Scanner;

public class TicTacToeGameRunner {
	 	public static void main(String[] args) {
			TicTacToe game = new TicTacToe();
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Tic Tac Toe Game!");

	   
	    while (!game.checkForWin() && !game.isBoardFull()) {
	        game.printBoard();

	        System.out.println(game.getgjeldenespillerplass() + ", enter row (1-3) and column (1-3) to place your mark: ");
	        int row = scanner.nextInt() - 1;
	        int col = scanner.nextInt() - 1;

	        while (!game.placeMark(row, col)) {
	            System.out.println("Invalid move. Try again.");
	            row = scanner.nextInt() - 1;
	            col = scanner.nextInt() - 1;
	        }

	        game.changePlayer();
	    }

	    game.printBoard();

	    if (game.isBoardFull() && !game.checkForWin()) {
	        System.out.println("It's a tie!");
	    } else {
	        game.changePlayer();
	        System.out.println(game.getgjeldenespillerplass() + " wins!");
	        
	    }

	    scanner.close();
		}
		
}
