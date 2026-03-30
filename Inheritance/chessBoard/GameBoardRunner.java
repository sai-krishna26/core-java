class GameBoardRunner
{
	public static void main(String... args)
	{
		ChessBoard chessBoard = new ChessBoard();
		ChessBoard chessBoard1 = new ChessBoard();

		chessBoard.type="Indoor";
		chessBoard.size=8;
		chessBoard.material="Wood";
		chessBoard.pieces=32;
		chessBoard.mode="Classic";
		chessBoard.check=true;
		chessBoard.players=2;
		chessBoard.color="BlackWhite";

		System.out.println(chessBoard.type);
		System.out.println(chessBoard.size);
		System.out.println(chessBoard.material);
		System.out.println(chessBoard.pieces);
		System.out.println(chessBoard.mode);
		System.out.println(chessBoard.check);
		System.out.println(chessBoard.players);
		System.out.println(chessBoard.color);
		chessBoard.startGame();
		chessBoard.endGame();
		chessBoard.display();

		GameBoard gameBoard = new ChessBoard();
		GameBoard gameBoard1 = new ChessBoard();

		gameBoard.type="Board";
		gameBoard.size=10;
		gameBoard.material="Plastic";

		System.out.println(gameBoard.type);
		System.out.println(gameBoard.size);
		System.out.println(gameBoard.material);
		gameBoard.startGame();
		gameBoard.endGame();

		GameBoard gameBoard2 = new GameBoard();
		GameBoard gameBoard3 = new GameBoard();

		gameBoard2.type="Simple";
		gameBoard2.size=5;
		gameBoard2.material="Cardboard";

		System.out.println(gameBoard2.type);
		System.out.println(gameBoard2.size);
		System.out.println(gameBoard2.material);
		gameBoard2.startGame();
		gameBoard2.endGame();
	}
}