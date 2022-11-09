package foo.bar;

/**
 * Abstraction for polygons with n corners.
 */
public abstract class Polygon {
    // --- Attributes ---
    /**
     *  Coordinates of center of polygon.
     */
    protected Point center;

    // --- Constructors ---
    /**
     * Main constructor.
     * @param center  Point for center of polygon.
     */
    public Polygon(Point center) {
        this.center = center;
    }

    // --- Setters & Getters ---
    /**
     *  @return  object of center point
     */
    public Point getCenter() {
        return this.center;
    }
}


/**
 *  Quadrilateral polygon, ie 4 corners
 */ 
class Quadrilateral extends Polygon {
    // --- Attribute ---
    private int width;

    // --- Constuctor ---
    /**
     * Main constructor.
     * @param center
     * @param width  
     */ 
    public Quadrilateral(Point center, int width) {
        super(center);
        this.width = width;
    }

    // --- Setters & Getters ---
    /**
     *  @return  Value of width.
     */
    public int getWidth() {
        return width;
    }
}

/**
 *  A square polygon.
 */
class Square extends Quadrilateral {
    // --- Constuctor ---
    /**
     * Main constructor.
     * @param center
     * @param width  
     */ 
    public Square(Point center, int width) {
        super(center, width);
    }
}


/**
 *  A rectangle polygon in 2d.
 */
class Rectangle extends Quadrilateral {
    // --- Attribute ---
    private int height;

    // --- Constuctor ---
    /**
     * Main constructor.
     * @param center
     * @param width
     * @param height
     */ 
    public Rectangle(Point center, int width, int height) {
        super(center, width);
        this.height = height;
    }

    // --- Setters & Getters ---
    /**
     *  @return  Value of height.
     */
    public int getHeight() {
        return height;
    }
}


/**
 *  Equilateral Triangle in 2d. 
 */
class Triangle extends Polygon {
    // --- Attribute ---
    /**
     *  Distance to corners from center
     */
    private int distanceToCorners;

    // --- Constuctor ---
    /**
     * Main constuctor.
     * @param center
     * @param distanceToCorners
     */ 
    public Triangle(Point center, int distanceToCorners) {
        super(center);
        this.distanceToCorners;
    }
}






