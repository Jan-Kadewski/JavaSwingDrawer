package Model;

public class MyRectangle {

    public int widthRect;
    public int heightRect;
    public int xRect;
    public int yRect;
    public int colorR;
    public int colorG;
    public int colorB;

    MyRectangle(int width,int height,int x,int y,int R,int G,int B){
        this.widthRect = width; // TODO: FILL *SCALE
        this.heightRect = height;
        this.xRect = x;
        this.yRect = y;
        this.colorR = R;
        this.colorG = G;
        this.colorB = B;
    }

    public MyRectangle getRect(){
        return this;

    }
}
