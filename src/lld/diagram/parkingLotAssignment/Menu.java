package lld.diagram.parkingLotAssignment;

import java.util.*;

public abstract class Menu {
    public  SectionType sectionType;
    public List<Dish> dishList;
    public abstract void order();
    public abstract void addDish();
    public abstract void removeDish();
    public abstract void updateDish();


}
