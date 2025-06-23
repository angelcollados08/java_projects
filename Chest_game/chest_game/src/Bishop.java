
public class Bishop extends Piece {

    public Bishop(boolean isWhite, Position position) {
        super(isWhite, position);
        this.type = "BISHOP";

    }

    @Override
    public boolean movePieceValid(Position newPos, Board board) {
        int diffPostX = newPos.getX() - this.getPosition().getX();
        int diffPostY = newPos.getY() - this.getPosition().getY();
        if (Math.abs(diffPostY) >= 1 && Math.abs(diffPostY) == Math.abs(diffPostX)) {
            return canMoveBishop(diffPostX, diffPostY, board);
        } else {
            return false;
        }

    }

    public boolean canMoveBishop(int newPosx, int newPosY, Board board) {
        Position inc;
        for (int x = 1; x < Math.abs(newPosx); x++) {
            if (newPosx > 0) {
                if (newPosY > 0) {
                    inc = new Position(x + this.position.getX(), this.position.getY() + x); 
                }else {
                    inc = new Position(x + this.position.getX(), this.position.getY() - x);
                }
            } else {
                if (newPosY > 0) {
                    inc = new Position(this.position.getX() -x, this.position.getY() + x); 
                }else {
                    inc = new Position(this.position.getX() -x, this.position.getY() - x);
                }
            }
            if (board.getPieceBoard(inc) != null) {
                return false;
            }
        }
        inc = new Position(newPosx + this.position.getX(), newPosY + this.position.getY());
        if (board.getPieceBoard(inc) == null || board.getPieceBoard(inc).isWhite != this.isWhite) {
            return true;
        } else {
            return false;
        }

    }

}
