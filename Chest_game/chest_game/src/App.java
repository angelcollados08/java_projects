
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Board boardGame = new Board();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are going to play a chess game");
        boardGame.printBoard();
        boolean correcInput1 = false;
        boolean correcInput2 = false;


        while(true){
        while (!correcInput1) {
            System.out.println("Select your piece with the commands from 1-8/1-8 like the example 1/1 to select the first Pawn, you are white bootom");
            String[] resUser = scanner.nextLine().split("/");
            Position posUserPiece = new Position(Integer.parseInt(resUser[0]) - 1, Integer.parseInt(resUser[1]) - 1);
            System.out.println("Select your new position for the piece selected");
            String[] resUserMove = scanner.nextLine().split("/");
            Position posUserMove = new Position(Integer.parseInt(resUserMove[0]) - 1, Integer.parseInt(resUserMove[1]) - 1);
            if (posUserMove.getX() > 8 || posUserMove.getY() > 8 || posUserPiece.getX() > 8 || posUserPiece.getY() > 8) {
                System.out.println("Incorrect values you can not select a number greater than 8");
            } else if (boardGame.getPieceBoard(posUserPiece) == null || !boardGame.getPieceBoard(posUserPiece).getWhite()) {
                System.out.println("You have not selected a Piece or the piece selected is not your color");

            } else if (!boardGame.getPieceBoard(posUserPiece).movePieceValid(posUserMove, boardGame)) {
                System.out.println("You can not move the piece to that place");
            } else {

                boardGame.setBoardPiece(boardGame.getPieceBoard(posUserPiece), posUserMove);
                correcInput1 = true;
            }
        }

        while (!correcInput2) {
        boardGame.printBoard();

            System.out.println("Select your piece with the commands from 1-8/1-8 like the example 1/1 to select the first Pawn");
            String[] resUser = scanner.nextLine().split("/");
            Position posUserPiece = new Position(Integer.parseInt(resUser[0]) - 1, Integer.parseInt(resUser[1]) - 1);
            System.out.println("Select your new position for the piece selected");
            String[] resUserMove = scanner.nextLine().split("/");
            Position posUserMove = new Position(Integer.parseInt(resUserMove[0]) - 1, Integer.parseInt(resUserMove[1]) - 1);
            if (posUserMove.getX() > 8 || posUserMove.getY() > 8 || posUserPiece.getX() > 8 || posUserPiece.getY() > 8) {
                System.out.println("Incorrect values you can not select a number greater than 8");
            } else if (!boardGame.getPieceBoard(posUserPiece).movePieceValid(posUserMove, boardGame)) {
                System.out.println("You can not move the piece to that place");
            } else {
                boardGame.setBoardPiece(boardGame.getPieceBoard(posUserPiece), posUserMove);
                correcInput2 = true;
            }
        }
    }
    }
}
