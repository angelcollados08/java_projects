
public class Board {

    private  Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            Rook newRookWhite;
            Rook newRookBlack;
            Knight newKnightWhite;
            Knight newKnightBlack;
            Bishop newBishopWhite;
            Bishop newBishopBlack;
            Queen newQueenWhite;
            Queen newQueenBlack;
            King newKingWhite;
            King newKingBlack;
            Position posWhite = new Position(1, i);
            Position posBlack = new Position(6, i);
            Pawn newPawnWhite = new Pawn(true, posWhite);
            Pawn newPawnBlack = new Pawn(false, posBlack);
            this.board[1][i] = newPawnWhite;
            this.board[6][i] = newPawnBlack;
            switch (i) {
                case 0:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newRookWhite = new Rook(true, posWhite);
                    newRookBlack = new Rook(false, posBlack);
                    this.board[0][i] = newRookWhite;
                    this.board[7][i] = newRookBlack;
                    break;
                case 1:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newKnightWhite = new Knight(true, posWhite);
                    newKnightBlack = new Knight(false, posBlack);
                    this.board[0][i] = newKnightWhite;
                    this.board[7][i] = newKnightBlack;
                    break;
                case 2:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newBishopWhite = new Bishop(true, posWhite);
                    newBishopBlack = new Bishop(false, posBlack);
                    this.board[0][i] = newBishopWhite;
                    this.board[7][i] = newBishopBlack;
                    break;
                case 3:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newQueenWhite = new Queen(true, posWhite);
                    newQueenBlack = new Queen(false, posBlack);
                    this.board[0][i] = newQueenWhite;
                    this.board[7][i] = newQueenBlack;
                    break;
                case 4:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newKingWhite = new King(true, posWhite);
                    newKingBlack = new King(false, posBlack);
                    this.board[0][i] = newKingWhite;
                    this.board[7][i] = newKingBlack;
                    break;
                case 5:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newBishopWhite = new Bishop(true, posWhite);
                    newBishopBlack = new Bishop(false, posBlack);
                    this.board[0][i] = newBishopWhite;
                    this.board[7][i] = newBishopBlack;
                    break;
                case 6:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newKnightWhite = new Knight(true, posWhite);
                    newKnightBlack = new Knight(false, posBlack);
                    this.board[0][i] = newKnightWhite;
                    this.board[7][i] = newKnightBlack;
                    break;
                case 7:
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    posWhite = new Position(0, i);
                    posBlack = new Position(7, i);
                    newRookWhite = new Rook(true, posWhite);
                    newRookBlack = new Rook(false, posBlack);
                    this.board[0][i] = newRookWhite;
                    this.board[7][i] = newRookBlack;
                    break;
            }
        }
    }

    public Piece getPieceBoard(Position pos) {
        return this.board[pos.getX()][pos.getY()];
    }

    public void printBoard() {
        for (int x = 0; x < 8; x++) {
            System.out.println(" _  _  _  _  _  _  _  _");
            for (int y = 0; y < 8; y++) {
                System.out.print("|");
                if (this.board[x][y] == null) {
                    System.out.print(" |");
                } else {
                    switch (this.board[x][y].getClass().getName()) {
                        case "Pawn":
                            System.out.print("P|");
                            break;
                        case "Knight":
                            System.out.print("K|");
                            break;
                        case "Rook":
                            System.out.print("R|");
                            break;
                        case "Bishop":
                            System.out.print("B|");
                            break;
                        case "Queen":
                            System.out.print("Q|");
                            break;
                        case "King":
                            System.out.print("X|");
                            break;
                    }
                }

            }
            System.out.println();
            System.out.println(" -  -  -  -  -  -  -  -");
        }
    }

    public Piece[][] getBoard(){
        return  this.board;
    }

    public void setBoardPiece(Piece newPiece, Position newPosPiece){
        this.board[newPiece.getPosition().getX()][newPiece.getPosition().getY()] = null;
        this.board[newPosPiece.getX()][newPosPiece.getY()] = newPiece;
        newPiece.setPosition(newPosPiece);

    }
}
