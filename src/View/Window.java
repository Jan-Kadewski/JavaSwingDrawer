package View;

import Model.State;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Window extends JFrame {
    public JFrame frame = null;
    State state = null;

    public Window(int width, int height,State state) throws FileNotFoundException {
        super();
        this.state = state;
        frame = new JFrame();

        frame.setSize(width,height);
        frame.setVisible(true);
        frame.setTitle("Jan_Kadewski_APP");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setDrawer(JFrame frame){
        MyPanelDrawer myPanelDrawer = null;
        try {
            myPanelDrawer = new MyPanelDrawer(state);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        frame.add(myPanelDrawer);
    }

    public void setViewer(JFrame frame) throws IOException {
        MyPanelViewer myPanelViewer = new MyPanelViewer(state);
        frame.add(myPanelViewer);
    }
}


