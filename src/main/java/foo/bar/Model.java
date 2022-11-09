package foo.bar;

/**
 *  Abstraction for model.
 */
public class Model {
    // --- Attributes ---
    int final LIST_SIZE = 10;
    /**
     *  List of polygons to render.
     */
    private ArrayList<Polygons> polygons = new ArrayList<>(LIST_SIZE);

    // --- Methods ---
    /**
     *  Add polygons to list
     *  @param polygon
     */
    public void add(Polygon polygon) {
        this.polygons.add(polygon);
    }
}
