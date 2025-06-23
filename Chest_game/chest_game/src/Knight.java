public class Knight extends Piece {

    public Knight(boolean isWhite, Position position) {
        super(isWhite, position);
        this.type = "KNIGHT";

    }

    @Override
    public boolean movePieceValid(Position newPos, Board board) {
        Piece pieceBoard = board.getPieceBoard(newPos);
        int diffPostX = newPos.getX() - this.getPosition().getX();
        int diffPostY = newPos.getY() - this.getPosition().getY();

        if ( Math.abs(diffPostY) == 2 && Math.abs(diffPostX) == 1 && (pieceBoard == null || pieceBoard.getWhite() != this.isWhite)){
            return true;
        }else if ( Math.abs(diffPostX) == 2 && Math.abs(diffPostY) == 1 && (pieceBoard == null || pieceBoard.getWhite() != this.isWhite)) {
            return true;
        }else{
            return false;
        }
    }
    
}
