package View;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.io.FileNotFoundException;

public class Window extends JFrame {

    public Window(int width, int height) throws FileNotFoundException {
        super();
        JFrame frame = new JFrame();
        MyPanel myPanel = new MyPanel();
        frame.setSize(width,height);
        frame.setVisible(true);
        frame.setTitle("Jan_Kadewski_APP");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(myPanel);
    }


}


