package algebra;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoubleVector {
    private double[] vector = null;

    public DoubleVector(double[] vector){
        this.vector = vector;
    }

    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector){
        return mult(this, anotherVector);
    }

    public static double mult(DoubleVector a, DoubleVector b){
        double s = 0;

        for ( int i = 0; i < a.vector.length; i++ ){
            s += a.vector[i] * b.vector[i];
        }

        return s;
    }

    // Додавання векторів
    public String add(DoubleVector anotherVector){
        return  add(this, anotherVector);
    }

    public static String add(DoubleVector a, DoubleVector b){
        if(a.vector.length != b.vector.length){
            return "";
        }

        double[] resVector = new double[a.vector.length];

        for (int i = 0; i < resVector.length; ++i){
            resVector[i] = a.vector[i] + b.vector[i];
        }

        return getArrayItems(resVector);
    }

    // Віднімання векторів
    public String sub(DoubleVector anotherVector){
       return sub(this, anotherVector);
    }

    public static String sub(DoubleVector a, DoubleVector b){
        if(a.vector.length != b.vector.length){
            return "";
        }

        double[] resVector = new double[a.vector.length];

        for (int i = 0; i < resVector.length; ++i){
            resVector[i] = a.vector[i] - b.vector[i];
        }

        return getArrayItems(resVector);
    }

    // Виведення елементів масиву
    private static String getArrayItems(double[] arr){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; ++i){
            stringBuilder.append(arr[i] + ", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

    // Множення вектора на число
    public static String mulByNumber(DoubleVector a, double number){
        if(a.vector.length <= 0){
            return "";
        }

        double[] resVector = new double[a.vector.length];

        for (int i = 0; i < resVector.length; ++i){
            resVector[i] = a.vector[i] * number;
        }

        return getArrayItems(resVector);
    }
    
    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};

        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);

        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));

        System.out.println("Додавання векторів");

        v1.add(v2);
        DoubleVector.add(v1, v2);
        v1.add(v3);

        System.out.println("Віднімання векторів");

        v1.sub(v2);
        DoubleVector.sub(v1, v2);
        v1.sub(v3);

        System.out.println("Множення вектора на число 10");

        DoubleVector.mulByNumber(v1, 10);
        DoubleVector.mulByNumber(v2, 10);
        DoubleVector.mulByNumber(v3, 10);
    }
}
