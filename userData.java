/**
 * Created by WindyIce on 2017/5/2.
 */

import java.util.Date;
import java.util.ArrayList;
class Plan{
    private Date now=new Date();
    private String plan_once;
    public Plan(String _plan_once){
        now=new Date();
        plan_once=_plan_once;
    }
}
public class userData {
    private String name;
    private ArrayList plans_in_seriod=new ArrayList<Plan>();

    public void addPlan(String _plan){

        plans_in_seriod.add(_plan);  // May it should be finished?!!!!
    }

    public ArrayList getPlan(){
        return plans_in_seriod;
    }

    public void modifyName(String _name){
        name=_name;
    }

    @Override
    public String toString() {
        String output="";
        output+="name ";
        output+=name+" ";
        output+="plan ";
        for(int i=0;i<plans_in_seriod.size();++i){
            output+=plans_in_seriod.get(i)+" ";
        }
        return output;
    }
}
