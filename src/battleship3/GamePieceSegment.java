package battleship3;

import java.awt.Image;

/**
 *
 * @author Brandon
 */
public class GamePieceSegment {
    private Coordinate location;
    private Image image;
    private boolean isHit;
    
    
    //--------------------//
    //-- Getter Methods --//
    //--------------------//
    
    public final Coordinate getLocaton(){
        return location;
    }
    
    public final Image getImage(){return image;}
    
    public final boolean isHit(){return isHit;}
    
    //--------------------//
    //-- Setter Methods --//
    //--------------------//
    
    public final void setLocation(Coordinate coordinate){
        if(coordinate == null) throw new IllegalArgumentException("Coordinate may not be null");
        location = coordinate;
    }
    
    //Image may be null for now
    public final void setImage(Image image){
        this.image = image;
    }
    
    //--------------------//
    //-- Action Methods --//
    //--------------------//
    
    public void hit(){isHit = true;}
    
    
}
