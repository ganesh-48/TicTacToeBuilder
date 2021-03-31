package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");

		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		printGameBoard(gameBoard);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter (1-9):");
		int position = scan.nextInt();
		System.out.println(position);
		
		playGame(gameBoard, position, "player" );
		printGameBoard(gameBoard);
	}
	//created a tic tac toe game board
	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void playGame(char[][] gameBoard, int position , String user) {
		char letter = ' ';
		
		if(user.equals("player")) {
			letter = 'X';
		}else if(user.equals("computer")){
			letter = 'O';
		}
		switch(position) {
		case 1:
			gameBoard[0][0] = letter;
			break;
		case 2:
			gameBoard[0][2] = letter;
			break;
		case 3:
			gameBoard[0][4] = letter;
			break;
		case 4:
			gameBoard[2][0] = letter;
			break;
		case 5:
			gameBoard[2][2] = letter;
			break;
		case 6:
			gameBoard[2][4] = letter;
			break;
		case 7:
			gameBoard[4][0] = letter;
			break;
		case 8:
			gameBoard[4][2] = letter;
			break;
		case 9:
			gameBoard[4][4] = letter;
			break;
			default:
				break;
		}
		//printGameBoard(gameBoard);
	
	}
}
