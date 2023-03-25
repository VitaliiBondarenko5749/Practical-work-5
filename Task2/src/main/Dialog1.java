package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import algebra.DoubleVector;

public class Dialog1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }

        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};

        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);





        /*
        JFrame дозволяє сформувати основне вікно додатку. Усі інші візуальні компоненти
        поміщаються всередину цього вікна
        */
        JFrame frame = new JFrame("Перше візуальне застосування");
        frame.setSize(300, 200);



        /*
        Container - клас для візуальних класів-контейнерів, тобто візуальних компонент, які
        можуть усередині себе містити інші візуальні компоненти.

        JLabel - клас для створення міток
        */
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));

        container.add(new JLabel("v1*v2 = " + v1.mult(v2)));
        container.add(new JLabel("v1*v2=" + DoubleVector.mult(v1, v2)));
        container.add(new JLabel("v1*v3=" + v1.mult(v3)));

        container.add(new JLabel("Додавання векторів"));
        container.add(new JLabel("v1+v2 = " + v1.add(v2)));
        container.add(new JLabel("v1+v2=" + DoubleVector.add(v1, v2)));
        container.add(new JLabel("v1+v3=" + v1.add(v3)));

        container.add(new JLabel("Віднімання векторів"));
        container.add(new JLabel("v1-v2 = " + v1.sub(v2)));
        container.add(new JLabel("v1-v2=" + DoubleVector.sub(v1, v2)));
        container.add(new JLabel("v1-v3=" + v1.sub(v3)));

        container.add(new JLabel("Множення вектора на число 10"));
        container.add(new JLabel(DoubleVector.mulByNumber(v1, 10)));
        container.add(new JLabel(DoubleVector.mulByNumber(v2, 10)));
        container.add(new JLabel(DoubleVector.mulByNumber(v3, 10)));

        WindowListener windowCloser = new WindowAdapter() {
            public void closeWindow(WindowEvent windowEvent){
                System.exit(0);
            }
        };

        frame.addWindowListener(windowCloser);
        frame.setVisible(true);
    }
}
