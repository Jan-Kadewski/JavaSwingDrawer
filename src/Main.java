import Model.State;
import View.Window;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends JComponent{

    public static void main(String[] args) throws IOException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        State state = new State();

        System.out.println("it works");
        final int WIDTH = (screenSize.width)/2;
        final int HEIGHT = screenSize.height;

        Window windowDrawer = new Window(WIDTH,HEIGHT,state);
        windowDrawer.setDrawer(windowDrawer.frame);

        Window windowViewer = new Window(WIDTH,HEIGHT,state);
        windowViewer.setViewer(windowViewer.frame);
        windowViewer.frame.setLocation(screenSize.width,HEIGHT);


        }




}




