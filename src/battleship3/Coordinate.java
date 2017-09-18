package battleship3;

/**
 * Class solely exists to help keep x and y points correctly matched to synonyms names
 * Examples x = col, x = numbers (Battleship) 
 *          y = row, y = Letters (Battleship)
 * Also if using a multi-demential array x and y would be -1;
 * @author Brandon
 */
public class Coordinate {
    private static final int MAX_RANGE = 24;
    private static final int MIN_RANGE = 1; 
    private static final int A_INT = ((int) 'A');
    private static final String OUT_OF_RANGE_MSG = " is out of range " + MIN_RANGE + "-" + MAX_RANGE;
    
    private int x;
    private int y;
    
    public Coordinate(String battleShipString){
        setViaBattleShipString(battleShipString);
    }
    
    public Coordinate(int x, int y){
        setX(x); setY(y);
    }
    
    //--------------------//
    //-- Getter Methods --//
    //--------------------//
    
    public final int getX(){return x;}
    public final int getY(){return y;}
    
    public final int getCol(){return x;}
    public final int getRow(){return y;}

    public final int getArrayX(){return x-1;}
    public final int getArrayY(){return y-1;}
    
    public final int getArrayCol(){return x-1;}
    public final int getArrayRow(){return y-1;}
    
    public final String getBattleShipString(){
        String c = "";
        c += ((char)(A_INT + (y-1)));
        c += x;
        return c;
    }
    
    //--------------------//
    //-- Setter Methods --//
    //--------------------//
    
    public final void setX(int x){
        if(x > MAX_RANGE || x < MIN_RANGE) throw new IllegalArgumentException("X" + OUT_OF_RANGE_MSG);
        this.x = x;
    }
    
    public final void setY(int y){
        if(y > MAX_RANGE || y < MIN_RANGE) throw new IllegalArgumentException("Y" + OUT_OF_RANGE_MSG);
        this.y = y;
    }
    
    public final void setViaBattleShipString(String letterNumber){
        if(letterNumber == null || !letterNumber.matches("[A-Z][0-9]{1,2}")) 
               throw new IllegalArgumentException("String May Not Be Null Or Empty and must A# or A##");
        
        int y = letterNumber.charAt(0)-A_INT+1;
        int x = Integer.parseInt(letterNumber.substring(1));
        
        setX(x); setY(y);
    }
    
}
