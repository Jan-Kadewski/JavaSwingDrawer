package Model;

public class MyRectangle {

    public int scale;
    public int widthRect;
    public int heightRect;
    public int xRect;
    public int yRect;

    MyRectangle(int width,int height,int x,int y,int scale){
        this.widthRect = width;
        this.heightRect = height;
        this.xRect = x;
        this.yRect = y;
        this.scale = scale;
    }

    public MyRectangle getRect(){
        return this;

    }
}
