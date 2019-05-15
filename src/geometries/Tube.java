package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Tube extends RadialGeometry {
protected Ray ray;
// ***************** Constructors ********************** //

public Tube(double radius, Ray ray) {
        super(radius);
        this.ray = new Ray(ray);
        }

// ***************** Getters/Setters ********************** //

public Ray getRay() {
        return new Ray(ray);
        }

    @Override
    public Vector getNormal(Point3D p) {
        return null;
    }

// ***************** Administration  ******************** //


        // ***************** Operations ******************** //
        }
