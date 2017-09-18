package battleship3;

import java.awt.Image;

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
    
    //Can Throw Array Index Out Of Bounds 
    public final void placeGamePieceOnBoard(GamePiece piece){
        for(GamePieceSegment segment : piece.getSegmentArray()){
            Coordinate c = segment.getLocaton();
            board[c.getArrayRow()][c.getArrayCol()] = piece;
        }
    }
    
    public final int getRowCount(){return rowCount;}
    public final int getColCount(){return colCount;}
    
    //Future GUI should not need to know about GamePiece object only that the board can 
    //be diplayed via this method
    public final Image[][] getBoardDisplay(){
        Image[][] display = new Image[rowCount][colCount];
        for(int row=0; row < rowCount; row++){
            for(int col=0; col< colCount; col++){
                Coordinate coordinate = new Coordinate();
                coordinate.setArrayRow(row); coordinate.setArrayCol(col);
                Image segmentImage = board[row][col].getSegmentAt(coordinate).getImage();
                display[row][col] = segmentImage;
            }//end of col loop
        }//end of row loop
        return display;
    }
}
