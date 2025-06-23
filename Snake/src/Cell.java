public class Cell {

    private final int row,col;
    private CellType cellType;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public int getCol(){
        return this.col;
    }

    public int getRow(){
        return this.row;
    }

}
