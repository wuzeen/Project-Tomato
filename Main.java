/**
 * Created by WindyIce on 2017/5/2.
 */
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Timer timer=new Timer();
        timing _timing=new timing();
        timer.schedule(_timing,1000);

    }
}
