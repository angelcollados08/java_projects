public class Board {
    
    final int ROW_COUNT,COL_COUNT;
    private Cell [][] cells;

    public Board(int rowCount, int colCount){
        this.ROW_COUNT = rowCount;
        this.COL_COUNT = colCount;
        cells = new Cell[ROW_COUNT][COL_COUNT];
        for (int i = 0 ; i < ROW_COUNT; i++){
            for (int j = 0; j < COL_COUNT; j++) {
                cells[i][j] = new Cell(i, j);
                cells[i][j].setCellType(CellType.EMPTY);
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells)
    {
        this.cells = cells;
    }

    public void generateFood(){
        System.out.println("Going to generate food");
        int row = 0, column = 0;
        while (true) { 
            row = (int)(Math.random() * ROW_COUNT);
            column = (int)(Math.random() * COL_COUNT);
            if (cells[row][column].getCellType() != CellType.SNAKE_NODE);
            break;
        }
        cells[row][column].setCellType(CellType.FOOD);
        System.out.println("Food is generated at: " + row
                           + " " + column);
    }
}
