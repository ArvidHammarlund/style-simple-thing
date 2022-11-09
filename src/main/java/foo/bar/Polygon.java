package foo.bar;

/**
 * Abstraction for polygons with aribtrarly amount of corners, joint by
 * edges.
 * Corners consist of Point objects.
 */
public abstract class Polygon {
    // --- Attributes ---
    /**
     *  Coordinates of center of polygon
     */
    protected Point center;

    // --- Constructors ---
    /**
     * Constuctor for object Point2d subtype of Point.
     * @param coordinate  Point for center of polygon.
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
 *  Subtype of polygon in shape of square 
 */
class Square extends Polygon {
    // --- Attribute ---
    private final int width;

    // --- Constuctor ---
    /**
     * Constuctor for object Square subtype of Polygon.
     * @param center
     * @param .
     */ 
    public Square(Point center, int width) {
        super(center);
        this.width = width;
    }
}


/**
 *  Subtype of polygon in shape of rectangle 
 */
class Rectangle extends Polygon {
    // --- Attribute ---
    private final int width;
    private final int height;

    // --- Constuctor ---
    /**
     * Constuctor for object Rectangle subtype of Polygon.
     * @param .
     * @param .
     */ 
    public Rectangle(Point center, int width, int height) {
        super(center);
        this.width = width;
        this.height = height;
    }
}


/**
 *  Subtype of polygon in shape of square 
 */
class Triangle extends Polygon {
    // --- Attribute ---
    private final int width;

    // --- Constuctor ---
    /**
     * Constuctor for object Square subtype of Polygon.
     * @param .
     */ 
    public Triangle(Point center, int width) {
        super(center);
        this.width = width;
    }
}






