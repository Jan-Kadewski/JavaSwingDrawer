package Model;

import java.awt.*;

public class State {
    //GLOBAL
    int scale = 1;
    int xWindow;
    int yWindow;

    public MyRectangle myRectangle;
    public State(){
        myRectangle = new MyRectangle(
                                (int) Math.floor(Math.random()*200 +100),
                                (int) Math.floor(Math.random()*200 +100),
                                (int) Math.floor(Math.random()*400 +100),
                                (int) Math.floor(Math.random()*400 +100),
                                 scale
                                );

    }
}


