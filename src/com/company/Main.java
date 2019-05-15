//asaf levi 212384507 asafleve123@gmail.com
//oriel tangi 209447663 uriel108@madaimas.org.il
package com.company;
import geometries.Triangle;
import primitives.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Point3D p1,p2;
        p1=new Point3D(1,1,1);//use sets of all coordinates
        p2=new Point3D(2,3,3);
        System.out.println("point 1:"+p1+"\npoint2:"+p2);//use tostring+ get of all coordinates
        System.out.println("The distance between p1 and p2: "+ p1.distance(p2));
        Vector v1=new Vector(p1.subtract(p2));
        System.out.println("v1:p2-p1:"+v1);
        if(p1.addVector(v1).equals(p2))
            System.out.println("p1+v1==p2");
        Vector v2=new Vector(p2.subtract(p1));
        System.out.println("v2:p1-p2:"+v2);
        if(v1.add(v2).equals(new Vector()))
            System.out.println("v1+v2 is Vector0");
        System.out.println("v1 length:"+v1.length());
        if(v1.subtract(v2).equals(v1.scale(2)))
            System.out.println("v1-v2==v1*2 ");
        System.out.println("v1*v2:"+v1.dotProduct(v2));
        System.out.println("v1Xv2:"+v1.crossProduct(v2));
        v1.normalize();
        System.out.println("v1 after normalize:"+v1);
        Ray ray = new Ray(p1,v1);
        System.out.println("ray:"+ray);
    }
}
