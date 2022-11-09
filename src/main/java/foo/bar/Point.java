package foo.bar;

/**
 *  Abstraction for point in n-dimensional spcae.
 */
public abstract class Point { 
    
}


/**
 *  Object for point in 1-dimensional space. 
 */
class Point1D extends Point {
    // --- Attributes ---
    /**
     *  Value on horizontal axis.
     */
    protected int x;

    // --- Constructors ---
    /**
     * Main constructor.
     * @param x  Value on horizontal axis.
     */
    public Point1D(int x) {
        this.x = x;
    }

    // --- Setters & Getters ---
    /**
     *  @return  value of attr. x.
     */ 
    public int getX() {
        return this.x;
    }
}


/**
 *  Object for point in 2-dimensional space. 
 */ 
class Point2D extends Point1D {
    // --- Attributes ---
    /**
     *  Value on vertical axis.
     */
    private int y; 

    // --- Constructors ---
    /**
     * Main constructor.
     * @param x  value on horizontal axis.
     * @param y  Value on vertical axis.
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // --- Setters & Getters ---
    /**
     *  @return  value of attr. y.
     */ 
    public int getY() {
        return this.y;
    }
}


