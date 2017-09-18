
package battleship3;

/**
 * A GamePiece is a collection of segments that is placed on the board
 * @author Brandon
 */
public abstract class GamePiece {
    private GamePieceSegment[] segments;
    
    public GamePiece(){
        segments = new GamePieceSegment[0];
    }
    
    public final int getSegmentCount(){return segments.length;}
    public final GamePieceSegment[] getSegmentArray(){return segments;}
    
    public final GamePieceSegment getSegmentAt(Coordinate coordinate){
        GamePieceSegment target = null;
        for(GamePieceSegment segment : segments){
            if(segment.getLocaton().equals(coordinate)){
                target = segment; break;
            }
        }//end of for loop
        return target;
    }
}
