
abstract class Piece {

    public boolean isWhite;
    public Position position;
    public String type;

    public Piece(boolean isWhite, Position position) {
        this.isWhite = isWhite;
        this.position = position;
    }

    public abstract boolean movePieceValid(Position newPos, Board board);

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position newPosition) {
        this.position = newPosition;
    }

    public boolean getWhite() {
        return this.isWhite;
    }
    

    
}
