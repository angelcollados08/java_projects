
public class Queen extends Piece {

    public Queen(boolean isWhite, Position position) {
        super(isWhite, position);
        this.type = "QUEEN";

    }

    @Override
    public boolean movePieceValid(Position newPos, Board board) {
        int diffPostX = newPos.getX() - this.getPosition().getX();
        int diffPostY = newPos.getY() - this.getPosition().getY();
        if (diffPostX == 0 && Math.abs(diffPostY) >= 1) {
            return canMoveRook(diffPostX, diffPostY, board);
        } else if (Math.abs(diffPostX) >= 1 && diffPostY == 0) {
            return canMoveRook(diffPostX, diffPostY, board);
        } else if (Math.abs(diffPostY) >= 1 && Math.abs(diffPostY) == Math.abs(diffPostX)) {
            return canMoveBishop(diffPostX, diffPostY, board);
        } else {
            return false;
        }
    }

    public boolean canMoveRook(int newPosx, int newPosY, Board board) {
        Position inc;
        if (newPosx != 0) {
            for (int x = 1; x < Math.abs(newPosx); x++) {
                if (newPosx > 0) {
                    inc = new Position(x + this.getPosition().getX(), 0);
                } else {
                    inc = new Position((-1) * x + this.getPosition().getX(), 0);
                }
                if (board.getPieceBoard(inc) != null) {
                    return false;
                }
            }
            inc = new Position(newPosx + this.position.getX(), 0);
            if (board.getPieceBoard(inc) == null || board.getPieceBoard(inc).isWhite != this.isWhite) {
                return true;
            } else {
                return false;
            }
        } else {
            for (int y = 1; y < newPosY; y++) {
                if (newPosY > 1) {
                    inc = new Position(0, y + this.position.getY());
                } else {
                    inc = new Position(0, y * (-1) + this.position.getY());
                }
                if (board.getPieceBoard(inc) != null) {
                    return false;
                }
            }
            inc = new Position(0, newPosY + this.position.getY());
            if (board.getPieceBoard(inc) == null || board.getPieceBoard(inc).isWhite != this.isWhite) {
                return true;
            } else {
                return false;
            }
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
