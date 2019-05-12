package View;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.io.FileNotFoundException;

public class Window extends JFrame {
    public JFrame frame = null;
    public Window(int width, int height) throws FileNotFoundException {
        super();
        frame = new JFrame();
        frame.setSize(width,height);
        frame.setVisible(true);
        frame.setTitle("Jan_Kadewski_APP");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setDrawer(JFrame frame){
        MyPanelDrawer myPanelDrawer = null;
        try {
            myPanelDrawer = new MyPanelDrawer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        frame.add(myPanelDrawer);
    }
}


