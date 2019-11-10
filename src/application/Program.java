package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Posição de origem : ");
			ChessPosition source = UI.readChessPosition(input);

			System.out.println();
			System.out.print("Posição de destino: ");
			ChessPosition target = UI.readChessPosition(input);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

		}

	}

}
