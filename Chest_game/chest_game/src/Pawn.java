
public class Pawn extends Piece {

    public boolean firstMove;

    public Pawn(boolean isWhite, Position position) {
        super(isWhite, position);
        this.firstMove = true;
        this.type = "PAWN";
    }

    @Override
    public boolean movePieceValid(Position newPos, Board board) {
        Piece pieceBoard = board.getPieceBoard(newPos);
        int diffPostX = newPos.getX() - this.getPosition().getX();
        int diffPostY = newPos.getY() - this.getPosition().getY();
        if (diffPostY == 0 && diffPostX == 1 && pieceBoard == null) {
            return true;
        } else if (this.firstMove && diffPostY == 0 && diffPostX == 2 && pieceBoard == null) {
            this.firstMove = false;
            return true;
        } else if ( diffPostY == 1 && Math.abs(diffPostX) == 1 && pieceBoard != null) {
            return true;
        } else {
            return false;
        }
    }

}
