package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane implements Geometry {
    Point3D p;
    Vector normal;
    // ***************** Constructors ********************** //

    public Plane(Point3D p, Vector normal) {
        this.p = new Point3D(p);
        this.normal = new Vector(normal);
    }
    @Override
    public Vector getNormal(Point3D p)
    {
        return getNormal();
    }
    public Plane(Point3D p1,Point3D p2,Point3D p3)
    {
        Vector U = new Vector(p1.subtract(p2));
        Vector V = new Vector(p1.subtract(p3));
        Vector n = new Vector(U.crossProduct(V));

        n.normalize();
        n.scale(-1);


        //setP(p1);
        //setN(n);
        this.p=new Point3D(p1);
        this.normal=new Vector(n);
    }

    // ***************** Getters/Setters ********************** //

    public Point3D getP() {
        return new Point3D(p);
    }

    public Vector getNormal() {
        return new Vector(normal);
    }

    // ***************** Administration  ******************** //


    // ***************** Operations ******************** //

}
