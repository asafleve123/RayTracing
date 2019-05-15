package geometries;

import primitives.Point3D;

public class Triangle{
    Point3D p1;
    Point3D p2;
    Point3D p3;
    // ***************** Constructors ********************** //

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {

        this.p1 = new Point3D(p1);
        this.p2 = new Point3D(p2);
        this.p3 = new Point3D(p3);
    }

    // ***************** Getters/Setters ********************** //
    public Point3D getP1() {
        return new Point3D(p1);
    }

    public Point3D getP2() {
        return new Point3D(p2);
    }

    public Point3D getP3() {
        return new Point3D(p3);
    }
    // ***************** Administration  ******************** //


    // ***************** Operations ******************** //

}
