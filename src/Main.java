import View.Window;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main extends JComponent{

    public static void main(String[] args) throws FileNotFoundException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("it works");
        final int WIDTH = (screenSize.width)/2;
        final int HEIGHT = screenSize.height;
        Window windowDrawer = new Window(WIDTH,HEIGHT);
        windowDrawer.setDrawer(windowDrawer.frame);

        Window windowViewer = new Window(WIDTH,HEIGHT);
        windowViewer.frame.setLocation(screenSize.width,HEIGHT);

        }




}




