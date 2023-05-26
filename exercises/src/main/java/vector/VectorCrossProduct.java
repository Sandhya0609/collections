package vector;

import java.util.Vector;

//Vector Cross Product
//Write a method in the Vector class that calculates the cross product of two vectors.
// The cross product of two 3D vectors results in a new vector that is perpendicular
// (orthogonal) to both input vectors.
public class VectorCrossProduct {

    public Vector CrossProduct(Vector<Double> v1, Vector<Double> v2) {
        Vector<Double> v3 = new Vector<>();
        Double x = (v1.get(1) * v2.get(2)) - (v1.get(2) * v2.get(1));
        Double y = (v1.get(0) * v2.get(2)) - (v1.get(2) * v2.get(0));
        Double z = (v1.get(0) * v2.get(1)) - (v1.get(1) * v2.get(0));
        v3.add(0, x);
        v3.add(1, y);
        v3.add(2, z);
        return v3;
    }

//example vectors: a=3i-3j+k,b=4i+9j-2k
    public static void main(String[] args) {

        Vector<Double> v1=new Vector();
        v1.add(3.0);
        v1.add(-3.0);
        v1.add(1.0);
        Vector<Double> v2=new Vector();
        v2.add(4.0);
        v2.add(9.0);
        v2.add(2.0);

        VectorCrossProduct crossProduct=new VectorCrossProduct();

        //Cross product method calling
       Vector<Double> result=crossProduct.CrossProduct(v1,v2);

        System.out.println("The Cross product of the given two vectors is: "+result.get(0)+"i+"+result.get(1)+"j+"+result.get(2)+"k");


    }

}

