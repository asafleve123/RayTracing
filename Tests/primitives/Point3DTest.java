package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void subtract() {
        Point3D p1 = new Point3D(1,2,3);
        Vector v = new Vector(new Point3D(2,4,12));

        Point3D result = p1.subtract(v);

        assertEquals(new Point3D(-1.0,-2.0,-9.0),result);
    }

    @Test
    void addVector() {
        Point3D p1 = new Point3D(1,2,3);
        Vector v = new Vector(new Point3D(2,4,12));

        Point3D result = p1.addVector(v);

        assertEquals(new Point3D(3.0,6.0,15.0),result);
    }
}