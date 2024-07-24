package Chapter9;

import java.util.ArrayList;

public class Serial extends Circuit {

    private ArrayList<Circuit> RList;

    public Serial() {
        RList = new ArrayList<>();
    }

    public void addResistance(Circuit cct) {
        RList.add(cct);
    }

    public double getResistance() {
        double totalR = 0;

        for (int i = 0; i < RList.size(); i++) {
            totalR += RList.get(i).getResistance();
        }

        return totalR;
    }

    public String toString() {
        String values = "";
        for (int i = 0; i < RList.size() - 1; i++) {
            values += RList.get(i) + ",";
        }

        values += RList.get(RList.size() - 1);
        return super.toString() + "[value=" + values + "]";
    }

}
