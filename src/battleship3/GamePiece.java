
package battleship3;

/**
 * A GamePiece is a collection of segments that is placed on the board
 * Child Classes should decided how those segments are validated and created
 * @author Brandon
 */
public abstract class GamePiece {
    private String name; 
    private GamePieceSegment[] segments;
    
    public GamePiece(String name, GamePieceSegment[] segments){
       setName(name); setSegments(segments);
    }
    
    //--------------------//
    //-- Getter Methods --//
    //--------------------//
    
    public final String getName(){return name;}
    
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
    
    //--------------------//
    //-- Setter Methods --//
    //--------------------//
    
    public final void setSegments(GamePieceSegment[] segments){
        if(segments == null || segments.length <= 0)
            throw new IllegalArgumentException("A Game Piece must have at least 1 segment");
        this.segments = segments;
    }
    
    public final void setName(String name){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Name may not be null or empty");
        this.name = name;
    }
}
