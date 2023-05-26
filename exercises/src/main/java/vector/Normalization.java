package vector;

import java.util.Vector;

//Write a method in the Vector class that normalizes a vector. Normalizing a vector
// involves dividing each of its elements by its magnitude,
// resulting in a unit vector (a vector with a magnitude of 1).
public class Normalization {
    public Double calMagnitude(Vector<Double> v) {
        Double result = (v.get(0) * v.get(0)) + (v.get(1) * v.get(1)) + (v.get(2) * v.get(2));
        return result;
    }

    public static void main(String[] args) {
        Vector<Double> myData = new Vector<>();
        myData.add(2.0);
        myData.add(3.0);
        myData.add(4.0);

        Normalization normalization = new Normalization();
        Double r = normalization.calMagnitude(myData);
        System.out.println("Magnitude of vector:" + Math.sqrt(r));


        }

    }

