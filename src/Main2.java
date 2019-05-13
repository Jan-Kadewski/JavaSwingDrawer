import java.util.Timer;
import java.util.TimerTask;

public class Main2 {

    public static void main(String[] args) {

        TimerTask repeatedTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        };
        Timer timer = new Timer("Timer");

        long delay  = 1000L;
        long period = 1000L;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);

    }
}
