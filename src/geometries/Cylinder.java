package geometries;

import primitives.Ray;

public class Cylinder extends Tube {

    double high;
    // ***************** Constructors ********************** //

    public Cylinder(double radius, Ray ray, double high) {
        super(radius, ray);
        this.high = high;
    }


    // ***************** Getters/Setters ********************** //

    public double getHigh() {
        return high;
    }

    // ***************** Administration  ******************** //


    // ***************** Operations ******************** //
}
