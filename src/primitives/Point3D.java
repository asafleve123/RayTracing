package primitives;

import static java.lang.StrictMath.sqrt;

/**
 * Javadoc formatted documentation
 */
public class Point3D extends Point2D {
    public static final Point3D ZERO = new Point3D(0,0,0);

    private Coordinate z;


    // ***************** Constructors ********************** //
    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        super(x, y);
        this.setZ(new Coordinate(z));
    }
    public Point3D(){this.setZ(Coordinate.ZERO);}
    public Point3D(Point3D other) {
        super(other);
        this.setZ(other.getZ());
    }

    public Point3D(double x, double y, double z) {
        this(new Coordinate(x), new Coordinate(y), new Coordinate(z));
    }

    // ***************** Getters/Setters ********************** //
    public Coordinate getZ() {
        return new Coordinate(z);
    }

    public void setZ(Coordinate z) {
        this.z = new Coordinate(z);
    }


    // ***************** Administration  ******************** //

    /**
     * Javadoc formatted documentation
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Point3D)) return false;
        if (!super.equals(o)) return false;
        Point3D point3D = (Point3D) o;
        return getZ().equals(point3D.getZ());
    }

    /**
     * Javadoc formatted documentation
     */
    @Override
    public String toString() {
        return "(" +
                getX() +
                "," + getY() +
                "," + getZ() +
                ')';
    }

    // ***************** Operations ******************** //
    public Vector subtract(Point3D other) {
        return new Vector(new Point3D(other.getX().subtract(this.getX()), other.getY().subtract(getY()), other.getZ().subtract(getZ())));
    }
    public double distancePower2(Point3D other) {
        double deltaX = Util.uscale(Util.usubtract(other.x.get(), x.get()), Util.usubtract(other.x.get(), x.get()));
        double deltaY = Util.uscale(Util.usubtract(other.y.get(), y.get()), Util.usubtract(other.y.get(), y.get()));
        double deltaZ = Util.uscale(Util.usubtract(other.z.get(), z.get()), Util.usubtract(other.z.get(), z.get()));
        double result = Util.uadd(Util.uadd(deltaX, deltaY), deltaZ);
        if (Util.isZero(result)) {
            return 0.0;
        } else if (Util.isOne(result)) {
            return 1.0;
        }
        return result;
    }
    public double distance (Point3D other){
            return sqrt(distancePower2(other));
    }
    public Point3D addVector (Vector vector){
            return new Point3D(x.add(vector.getHead().x), y.add(vector.getHead().y), z.add(vector.getHead().z));
        }

    public Point3D subtract(Vector vector) {
        return new Point3D(x.subtract(vector.getHead().x), y.subtract(vector.getHead().y), z.subtract(vector.getHead().z));
    }
}







