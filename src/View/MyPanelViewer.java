package View;

import Model.MyOval;
import Model.MyRectangle;
import Model.State;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class MyPanelViewer extends JPanel {

    MyOval myOval = null;

    public MyPanelViewer(State state) throws IOException {

        String resultFromFile = state.readFromFile();
        Gson g = new Gson();
        myOval = g.fromJson(resultFromFile,MyOval.class);
        repaint();

    }

    public void paint(Graphics g){

        g.setColor(new Color(myOval.colorR,myOval.colorG,myOval.colorB));
        g.fillOval(myOval.xOval,
                   myOval.yOval,
                   myOval.widthOval,
                   myOval.heightOval);
    }
}




/*
*             repaint();
        }

        public void paint(Graphics g){
            //TODO: set color as random number
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
}
*/