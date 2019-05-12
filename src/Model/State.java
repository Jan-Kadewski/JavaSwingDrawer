package Model;


import javafx.scene.shape.Path;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class State {
    final String PATH_TO_FILE = "drewObjects.txt";
    //GLOBAL
    int scale = 1;
    int xWindow;
    int yWindow;

    public MyRectangle myRectangle;
    public MyOval myOval;

    public State() throws FileNotFoundException {
        myRectangle = new MyRectangle(
                                (int) Math.floor(Math.random()*200 +100),
                                (int) Math.floor(Math.random()*200 +100),
                                (int) Math.floor(Math.random()*400 +100),
                                (int) Math.floor(Math.random()*400 +100),
                                (int)Math.floor(Math.random()*255), //R
                                (int)Math.floor(Math.random()*255), //G
                                (int)Math.floor(Math.random()*255)  //B

        );

        myOval = new MyOval(
                (int)Math.floor(Math.random()*500 +100),
                (int)Math.floor(Math.random()*500 +100),
                (int)Math.floor(Math.random()*600 +100),
                (int)Math.floor(Math.random()*600 +100),
                (int)Math.floor(Math.random()*255), //R
                (int)Math.floor(Math.random()*255), //G
                (int)Math.floor(Math.random()*255)  //B
        );
            saveToFile();
    }


    void saveToFile() throws FileNotFoundException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(PATH_TO_FILE);
            out.println(this.myOval.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            out.close();
        }
    }


    ArrayList<String> readFromFile(){
        Path path = (Path) Paths.get(PATH_TO_FILE);
        Charset charset = Charset.forName("Utf-8");
        ArrayList<String> lines = null;
        try{
            lines = (ArrayList<String>) Files.readAllLines((java.nio.file.Path) path, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return lines;
    }
}


