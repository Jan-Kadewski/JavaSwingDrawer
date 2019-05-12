package View;

import Model.MyRectangle;
import Model.State;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    State state = null;

    public MyPanel() {
        state = new State();
        repaint();
    }

    public void paint(Graphics g){

        g.fillRect(
                state.myRectangle.xRect,
                state.myRectangle.yRect,
                state.myRectangle.widthRect,
                state.myRectangle.heightRect
        );


    }

    //todo
    //narysować koło
    //
}
