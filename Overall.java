/**
 * Created by WindyIce on 2017/5/2.
 */
import java.util.ArrayList;
public class Overall {
    private long Created;
    private boolean restEnough=true;
    private ArrayList<String> oncePlan=new ArrayList<String>();
    private ArrayList<String> finishedPlan=new ArrayList<String>();

    private int minute=0;
    private int second=0;
    public Overall(){
        Created=System.currentTimeMillis();
    }

    public boolean checkFocus(){
        long periodReal=System.currentTimeMillis()-Created;
        long periodWrite=(minute*60+second)*1000;
        if(periodReal-periodWrite<=2000){
            return true;
        }
        else return false;
    }

    public void removeOncePlan(int i){
        String out=oncePlan.remove(i);
        finishedPlan.add(out);
    }
    public void setMinSec(int m,int s){
        minute =m;
        second=s;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public boolean checkCanWork(){
        return restEnough;
    }
    public void getButtonIntoPlan(){

    }//in the main screen press into the plan UI

    public void startNewClock(){
        if(!restEnough){
            notRestEnoughYet();
        }
        else{

        }
    }//in the plan screen press into the starting new clock UI

    public void addOncePlan(String _aPlan){
        oncePlan.add(_aPlan);
    }

    public ArrayList getFinishedPlan(){
        return finishedPlan;
    }

    public void writePlanIn(userData user){
        for(int i=0;i<finishedPlan.size();++i){
            user.addPlan(finishedPlan.get(i));
        }
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

    public void notRestEnoughYet(){

        getButtonIntoPlan();
    }

    public void clockTrulyStart(){
        while(true){
            ++second;
            if(second>=60){
                second=0;
                ++minute;
                if(minute>=25){
                    restEnough=false;
                    break;
                }
            }
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
        restingStart();
    }

    public void restingStart(){
        while(true){
            ++second;
            if(second>=60){
                second=0;
                ++minute;
                if(minute>=5){
                    restEnough=true;
                }
                if(minute>=10) break;
            }
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
        getButtonIntoPlan();
    }

}
