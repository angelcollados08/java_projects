
public class King extends Piece {

    public King(boolean isWhite, Position position) {
        super(isWhite, position);
        this.type = "KING";

    }

    @Override
    public boolean movePieceValid(Position newPos, Board board) {
        Piece pieceBoard = board.getPieceBoard(newPos);
        int diffPostX = newPos.getX() - this.getPosition().getX();
        int diffPostY = newPos.getY() - this.getPosition().getY();
        if (Math.abs(diffPostX) == 1) {
            if ((Math.abs(diffPostY) == 1 || diffPostY == 0) && (pieceBoard == null || pieceBoard.getWhite() != this.getWhite())) {
                return true; 
            }else {
                return false;
            }
        } else if (diffPostX == 0 && Math.abs(diffPostY) == 1 && (pieceBoard == null || pieceBoard.getWhite() != this.getWhite())) {
                return true;
        } else {
            return false;
        }
    }

}
