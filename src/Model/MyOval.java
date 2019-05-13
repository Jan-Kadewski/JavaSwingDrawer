package Model;

import com.google.gson.Gson;

public class MyOval {

    public int widthOval;
    public int heightOval;
    public int xOval;
    public int yOval;
    public int colorR;
    public int colorG;
    public int colorB;


/*
    @Override
    public String toString() {
        return   "{" +
                "\"widthOval\":" + widthOval + ","+
                "\"heightOval\":" + heightOval + ","+
                "\"xOval\":" + xOval + ","+
                "\"yOval\":" + yOval + ","+
                "\"colorR\":" + colorR + ","+
                "\"colorG\":" + colorG + ","+
                "\"colorB\":" + colorB +
                "}";
    }
*/
        public String toStringJson(){
            Gson g = new Gson();
            return g.toJson(this);
        }
    MyOval(int width, int height, int x, int y, int R, int G, int B){
        this.widthOval = width;
        this.heightOval = height;
        this.xOval = x;
        this.yOval = y;
        this.colorR = R;
        this.colorG = G;
        this.colorB = B;
    }

    public MyOval getOval(){
        return this;
    }

}
