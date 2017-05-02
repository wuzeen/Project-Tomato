import java.util.TimerTask;

/**
 * Created by WindyIce on 2017/5/2.
 */
import java.util.TimerTask;
public class timing extends TimerTask{
    private String stringOut;
    private int min,sec=0;
    @Override
    public void run() {
        ++sec;
        if(sec==60) {
            sec = 0;
            ++min;
        }
        String m,s;
        if(min<10) m="0"+min;
        else m=""+min;
        if(sec<10) s="0"+sec;
        else s=""+sec;
        stringOut=m+":"+s;
    }
    public int getMin(){
        return min;
    }
    public int getSec(){
        return sec;
    }

    public String getStringOut(){
        return stringOut;
    }

    @Override
    public String toString() {
        String m,s;
        if(min<10) m="0"+min;
        else m=""+min;
        if(sec<10) s="0"+sec;
        else s=""+sec;
        return m+":"+s;
    }
}
