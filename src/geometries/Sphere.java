package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere extends RadialGeometry {
    Point3D center;
    // ***************** Constructors ********************** //

    public Sphere( Point3D center) {
        super(0.0);
        this.center = center;
    }

    // ***************** Getters/Setters ********************** //

    public Point3D getCenter() {
        return new Point3D(center);
    }

    @Override
    public Vector getNormal(Point3D p) {

        Vector N = new Vector(center.subtract(p));
        N.normalize();
        return N;
    }

    // ***************** Administration  ******************** //


    // ***************** Operations ******************** //

}
