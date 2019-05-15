package geometries;

/**
 * Javadoc formatted documentation
 */
public abstract class RadialGeometry implements Geometry{

    protected double radius;


    // ***************** Constructors ********************** //
    public RadialGeometry(double radius) {
        this.radius = radius;
    }

    public RadialGeometry(RadialGeometry radialGeometry){
        this.radius=radialGeometry.radius;
    }
    // ***************** Getters/Setters ********************** //
    public double getRadius() {
        return radius;
    }
    // ***************** Administration  ******************** //
    // ***************** Operations ******************** //
}
