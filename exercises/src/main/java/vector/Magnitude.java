package vector;

import java.util.Vector;
//Magnitude of vector

    public class Magnitude {

        // method to calculate the sum of the squares of vector elements
        public Double calMagnitude(Vector<Double> v) {
            Double result = (v.get(0) * v.get(0)) + (v.get(1) * v.get(1)) + (v.get(2) * v.get(2));
            return result;
        }

        public static void main(String[] args) {

            Vector<Double> myData=new Vector<>();

            //vector is a=1x+2y+3z
            myData.add(1.0);
            myData.add(2.0);
            myData.add(3.0);

    Magnitude magnitude =new Magnitude();
            Double result= magnitude.calMagnitude(myData);

            //Calling Math.sqrt method
            System.out.println("Magnitude of the given vector is: "+Math.sqrt(result));

        }

    }

