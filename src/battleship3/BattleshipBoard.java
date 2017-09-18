package battleship3;

public class BattleshipBoard {
    private static final int DEFAULT_ROW = 10; // 'J'
    private static final int DEFAULT_COL = 14; 
    
    private final int rowCount;
    private final int colCount;
    private final GamePiece[][] board;
    
    public BattleshipBoard(){
        this(DEFAULT_ROW,DEFAULT_COL);
    }
    
    public BattleshipBoard(int rowCount, int colCount){
        if(rowCount < 1 || colCount < 1 || rowCount > 24 || colCount > 24)
            throw new IllegalArgumentException("Row and Column Count must be between 1-24");
        this.rowCount = rowCount; this.colCount = colCount;
        board = new GamePiece[rowCount][colCount];
    }
    
    public final void placeGamePieceOnBoard(GamePiece piece){
        for(GamePieceSegment segment : piece.getSegmentArray()){
            Coordinate c = segment.getLocaton();
            board[c.getArrayRow()][c.getArrayCol()] = piece;
        }
    }
    
    public final int getRowCount(){return rowCount;}
    public final int getColCount(){return colCount;}
}
