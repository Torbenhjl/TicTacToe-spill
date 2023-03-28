package holaaaa;


import java.io.IOException;
public class TicTacToe  {

	
	private char[][] brett;
	private char gjeldenespillerplass;
	
	private void tihi() {
		   try {
		        String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		        ProcessBuilder pb = new ProcessBuilder(
		                "cmd", "/c", "start", url);
		        pb.start();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	
	public char getgjeldenespillerplass() {
	            return gjeldenespillerplass;
	        }
	
	public  TicTacToe() {
		brett = new char[3][3];
		gjeldenespillerplass = 'X';
		lagBrett();
	}
	public boolean placeMark(int row, int col) {
	    // Make sure that row and column are in bounds of the board.
	    if ((row >= 0) && (row < 3)) {
	        if ((col >= 0) && (col < 3)) {
	            if (brett[row][col] == '-') {
	                brett[row][col] = gjeldenespillerplass;
	                return true;
	            }
	        }
	    }
	    return false;
	}

	private void lagBrett() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3;j++) {
				brett[i][j] = '-';
			}
			}
		
	}
	  public void printBoard() {
	        System.out.println("-------------");

	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(brett[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }
	  boolean isBoardFull() {
	        boolean isFull = true;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (brett[i][j] == '-') {
	                    isFull = false;
	                }
	            }
	        }

	        return isFull;
	    }
	  
	   boolean checkForWin() {
		   boolean win = false;
		    
		    // Check rows for a win
		    for (int i = 0; i < 3; i++) {
		        if (checkRowCol(brett[i][0], brett[i][1], brett[i][2])) {
		            win = true;
		            break;
		        }
		    }
		    
		    // Check columns for a win
		    for (int i = 0; i < 3; i++) {
		        if (checkRowCol(brett[0][i], brett[1][i], brett[2][i])) {
		            win = true;
		            break;
		        }
		    }
		    
		    // Check diagonals for a win
		    if (checkRowCol(brett[0][0], brett[1][1], brett[2][2])) {
		        win = true;
		    } else if (checkRowCol(brett[0][2], brett[1][1], brett[2][0])) {
		        win = true;
		    }
		    
		    // If a win is detected, play the Rick Roll video
		    if (win) {
		        System.out.println("Congratulations! Player " + gjeldenespillerplass + " wins!");
		        tihi();
		    }
		    
		    return win;
	        
	    }
	  private boolean checkRowsForWin() {
	        for (int i = 0; i < 3; i++) {
	            if (checkRowCol(brett[i][0], brett[i][1], brett[i][2]) == true) {
	                return true;
	            }
	        }
	        return false;
	    }

	    // Loop through columns and see if any are winners.
	    private boolean checkColumnsForWin() {
	        for (int i = 0; i < 3; i++) {
	            if (checkRowCol(brett[0][i], brett[1][i], brett[2][i]) == true) {
	                return true;
	            }
	        }
	        return false;
	    }
	   
	    // Check the two diagonals to see if either is a win. Return true if either wins.
	    private boolean checkDiagonalsForWin() {
	        return ((checkRowCol(brett[0][0], brett[1][1], brett[2][2]) == true) || (checkRowCol(brett[0][2], brett[1][1], brett[2][0]) == true));
	        
	    }

	    // Check to see if all three values are the same (and not empty) indicating a win.
	    private boolean checkRowCol(char c1, char c2, char c3) {
	        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	    }
	    
	    public void changePlayer() {
	        if (gjeldenespillerplass == 'X') {
	        	gjeldenespillerplass = 'O';
	
	        } else {
	        	gjeldenespillerplass = 'X';
	        }
	        
	        
	        
}
}
