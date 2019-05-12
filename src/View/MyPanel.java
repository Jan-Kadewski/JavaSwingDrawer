package View;

import Model.MyRectangle;
import Model.State;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class MyPanel extends JPanel {

    State state = null;

    public MyPanel() throws FileNotFoundException {
        state = new State();
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(new Color(125,222,124));
        g.fillRect(
                state.myRectangle.xRect,
                state.myRectangle.yRect,
                state.myRectangle.widthRect,
                state.myRectangle.heightRect
        );


        g.setColor(new Color(state.myOval.colorR,state.myOval.colorG,state.myOval.colorB));
        g.fillOval(
                state.myOval.xOval,
                state.myOval.yOval,
                state.myOval.widthOval,
                state.myOval.heightOval
                );

    }

    //todo
    //narysować koło
    //
}
