package Client;

import Client.Model.BaseUnit;
import Client.Model.World;

import java.util.ArrayList;
import java.util.List;

public class Utl {
    public List<Integer> chooseHand(){
        ArrayList<Integer> myHand = new ArrayList<Integer>();
        myHand.add(0);
        myHand.add(1);
        myHand.add(2);
        myHand.add(6);
        myHand.add(7);

        return  myHand;
    }

    public BaseUnit unitSelector(World world, List<BaseUnit> currentHand){
        return world.getAllBaseUnits().get(0);
    }
}
