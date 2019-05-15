package primitives;
import static java.lang.StrictMath.sqrt;
/**
 * Javadoc formatted documentation
 */
public class Point2D{
    protected Coordinate x;
    protected Coordinate y;


    // ***************** Constructors ********************** //
    public Point2D(Coordinate x, Coordinate y) {
        this.setX(x);
        this.setY(y);
    }
    public Point2D(Point2D other) {
        this.setX(other.x);
        this.setY(other.y);
    }
    public Point2D() {
        this.setX(Coordinate.ZERO);
        this.setY(Coordinate.ZERO);
    }
    // ***************** Getters/Setters ********************** //
    public Coordinate getX() {
        return new Coordinate(x);
    }

    public void setX(Coordinate x) {
        this.x = new Coordinate(x);
    }

    public Coordinate getY() {
        return new Coordinate(y);
    }

    public void setY(Coordinate y) {
        this.y = new Coordinate(y);
    }

    // ***************** Administration  ******************** //
    /**
     * Javadoc formatted documentation
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Point2D)) return false;
        Point2D point2D = (Point2D) o;
        return x.equals(point2D.getX()) &&
                y.equals(point2D.getY());
    }
    /**
     * Javadoc formatted documentation
     */
    @Override
    public String toString() {
        return "(" +
                  getX() +
                "," + getY() +
                ')';
    }




    // ***************** Operations ******************** //

}
