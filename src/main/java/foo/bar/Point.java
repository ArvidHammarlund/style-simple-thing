package foo.bar;

/**
 *  Abstraction containing cordinates for points in a x-dimensional
 *  space.
 */
public abstract class Point { 
    /**
     *  Return the distance between to points (bird path).
     *      - Does not mutate
     *      - Allows for multi-threading
     *      - Point must belong to same dimension
     *  @param other  Other Point to measure distance to.
     *  @return distance  Distance between points.
     */
    public abstract double distance(Point other);
}

/**
 *  Object containing coordinates for a specific point in 
 *  a 2dimensional space.
 */ 
class Point2D extends Point {
    // --- Attributes ---
    /**
     *  Value on horizontal axis.
     */
    private int x;
    /**
     *  Value on vertical axis.
     */
    private int y; 

    // --- Constructors ---
    /**
     * Constuctor for object Point2d subtype of Point.
     * @param x  Value on horizontal axis.
     * @param y  Value on vertical axis.
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // --- Methods ---
    @Override
    /**
     * {@inheritDoc}
     */
    public double distance(Point other) {
        return 2.2;
    }

    // --- Setters & Getters ---
    /**
     *  @return  value of attr. x.
     */ 
    public int getX() {
        return this.x;
    }
    /**
     *  @return  value of attr. y.
     */ 
    public int getY() {
        return this.y;
    }
} // Point2D
