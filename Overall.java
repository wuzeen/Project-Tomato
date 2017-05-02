/**
 * Created by WindyIce on 2017/5/2.
 */
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
public class Overall {
    private ArrayList oncePlan=new ArrayList<String>();
    static void getButtonIntoPlan(){

    }//in the main screen press into the plan UI

    static void startNewClock(){

    }//in the plan screen press into the starting new clock UI

    public void addOncePlan(String _aPlan){
        oncePlan.add(_aPlan);
    }

    public ArrayList getOncePlan(){
        return oncePlan;
    }

    public String listToString(){
        String output="";
        for(int i=1;i<=oncePlan.size();++i){
            output+=i+": "+oncePlan.get(i-1);
            output+="\n";
        }
        return output;
    }

    static void clockTrulyStart(){

        Timer timer=new Timer();
        timing _timing=new timing();
        timer.schedule(_timing,1000);  //get timing from _timing.getStringOut()
        if(_timing.getMin()>=25){
            _timing.cancel();
            restingStart();
        }
    }

    static void restingStart(){

        Timer timer=new Timer();
        timing _timing=new timing();
        timer.schedule(_timing,1000);
        if(_timing.getMin()>=5){
            readyToAgain();
        }

    }

    static void readyToAgain(){

    }
}
