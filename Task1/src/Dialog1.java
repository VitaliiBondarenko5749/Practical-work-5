import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }

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
        container.add(new JLabel("Hello, привіт"));

        WindowListener windowCloser = new WindowAdapter() {
            public void closeWindow(WindowEvent windowEvent){
                System.exit(0);
            }
        };

        frame.addWindowListener(windowCloser);
        frame.setVisible(true);
    }
}
