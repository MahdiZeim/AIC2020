package Client;

import Client.Model.BaseUnit;
import Client.Model.Path;
import Client.Model.World;

import java.util.ArrayList;
import java.util.List;

public class Utl {
    public List<BaseUnit> choosingHand(World world){
        List<BaseUnit> allUnits = world.getAllBaseUnits();
        List<BaseUnit> myHand = new ArrayList<>();

        for(BaseUnit baseUnit : allUnits) {
            if(baseUnit.getTypeId() == 0 ||
                    baseUnit.getTypeId() == 1 ||
                        baseUnit.getTypeId() == 2 ||
                            baseUnit.getTypeId() == 6 ||
                                baseUnit.getTypeId() == 7) {
                myHand.add(baseUnit);
            }
        }
        System.out.println(myHand.size());
        return  myHand;
    }

    public BaseUnit unitSelector(World world, List<BaseUnit> currentHand){
        return currentHand.get(0);
    }
    public Path pathSelector(World world){
        return null;
    }
}
