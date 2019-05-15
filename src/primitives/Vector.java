package primitives;

/**
 * Javadoc formatted documentation
 */
public class Vector {
    public static final Vector ZERO = new Vector(Point3D.ZERO);
    private Point3D head;


    // ***************** Constructors ********************** //
    public Vector(Point3D head) {
        this.setHead(head);
    }
    public Vector(Vector other) { this.setHead(other.head); }
    public Vector(){this.setHead(new Point3D());}

    // ***************** Getters/Setters ********************** //
    public Point3D getHead() {
        return new Point3D(head);
    }
    public void setHead(Point3D head) {
        this.head = new Point3D(head);
    }


    // ***************** Administration  ******************** //
    /**
     * Javadoc formatted documentation
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null) return false;
        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        return getHead().equals(vector.getHead());
    }

    /**
     * Javadoc formatted documentation
     */
    @Override
    public String toString() {
        return "Vector{" +
                "head=" + getHead() +
                '}';
    }
    // ***************** Operations ******************** //
    public Vector add(Vector vector) {
        Vector result=new Vector();
        result.head.setX(this.head.getX().add(vector.head.getX()));
        result.head.setY(this.head.getY().add(vector.head.getY()));
        result.head.setZ(this.head.getZ().add(vector.head.getZ()));
        return result;
    }
    public Vector subtract(Vector vector) {
        Vector result=new Vector();
        result.head.setX(this.head.getX().subtract(vector.head.getX()));
        result.head.setY(this.head.getY().subtract(vector.head.getY()));
        result.head.setZ(this.head.getZ().subtract(vector.head.getZ()));
        return result;
    }
    public Vector scale(double num) {
        Vector result=new Vector();
        result.head.setX(this.head.getX().scale(num));
        result.head.setY(this.head.getY().scale(num));
        result.head.setZ(this.head.getZ().scale(num));
        return result;
    }
    public double length() {
        return this.head.distance(new Point3D());
    }
    public void normalize(){
        double length=this.length();
        if(length==0)
            throw new ArithmeticException();
        this.head.setX(new Coordinate(this.head.getX().get()/length));
        this.head.setY(new Coordinate(this.head.getY().get()/length));
        this.head.setZ(new Coordinate(this.head.getZ().get()/length));

    }
    public double dotProduct(Vector v){
        double x1 =this.head.getX().get();
        double x2 =v.head.getX().get();
        double scaleX=Util.uscale(x1,x2);

        double y1 =this.head.getY().get();
        double y2 =v.head.getY().get();
        double scaleY=Util.uscale(y1,y2);

        double z1 =this.head.getZ().get();
        double z2=v.head.getZ().get();
        double scaleZ=Util.uscale(z1,z2);

        return Util.uadd(Util.uadd(scaleX,scaleY),scaleZ);
    }
    public Vector crossProduct(Vector v){
        double x1 =this.head.getX().get();
        double x2 =v.head.getX().get();

        double y1 =this.head.getY().get();
        double y2 =v.head.getY().get();

        double z1 =this.head.getZ().get();
        double z2=v.head.getZ().get();

        return new Vector(new Point3D(Util.usubtract(Util.uscale(y1,z2),Util.uscale(y1,z2)),
                Util.usubtract(Util.uscale(z1,x2),Util.uscale(x1,z2)),
                Util.usubtract(Util.uscale(x1,y2),Util.uscale(y1,x2))));
    }

}
