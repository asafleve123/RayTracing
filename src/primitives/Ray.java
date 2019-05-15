package primitives;


/**
 * Javadoc formatted documentation
 */
public class Ray {
    private Point3D p0;
    private Vector direction;


    // ***************** Constructors ********************** //
    public Ray(Point3D p0, Vector direction) {
        this.setP0(p0);
        this.setDirection(direction);
    }
    public Ray(Ray other) {
        this.setP0(other.p0);
        this.setDirection(other.direction);
    }

    // ***************** Getters/Setters ********************** //
    public Point3D getP0() {
        return new Point3D(p0);
    }

    public void setP0(Point3D p0) {
        this.p0 =new Point3D(p0);
    }

    public Vector getDirection() {
        return new Vector(direction);
    }

    public void setDirection(Vector direction) {
        this.direction = new Vector(direction);
    }

    // ***************** Administration  ******************** //
    /**
     * Javadoc formatted documentation
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Ray)) return false;
        Ray ray = (Ray) o;
        return getP0().equals(ray.getP0()) &&
                getDirection().equals(ray.getDirection());
    }
    /**
     * Javadoc formatted documentation
     */
    @Override
    public String toString() {
        return "Ray{" +
                "p0=" + getP0() +
                ", direction=" + getDirection() +
                '}';
    }



    // ***************** Operations ******************** //
}
