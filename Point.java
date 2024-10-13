public class Point {
    // CLASS VARIABLES/FIELDS
    private int x;
    private int y;
    // CONSTRUCTOR: CALLED BY "NEW"
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // GETTER/ACCESSOR METHODS
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // OVERRIDE TOSTRING METHOD
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}