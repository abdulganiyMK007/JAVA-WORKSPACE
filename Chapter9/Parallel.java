package Chapter9;

import java.util.ArrayList;

public class Parallel extends Circuit {

    private ArrayList<Circuit> RList;

    public Parallel() {
        RList = new ArrayList<>();
    }

    public void addResistance(Circuit cct) {
        RList.add(cct);
    }

    public double getResistance() {
        double totalR = RList.get(0).getResistance();
        double nextR = 0;

        for (int i = 1; i < RList.size(); i++) {
            nextR = RList.get(i).getResistance();
            totalR = (totalR * nextR) / (totalR + nextR);    
        }
        
        return totalR;
    }

    public String toString() {
        String values = "";
        for (int i = 0; i < RList.size() - 1; i++) {
            values += RList.get(i) +",";
        }

        values += RList.get(RList.size() - 1);
        return super.toString() + "[value=" + values + "]";
    }
    
}
