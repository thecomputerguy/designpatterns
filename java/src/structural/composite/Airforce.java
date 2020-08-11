import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce implements IAlliancePart {
    List<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart airplane) {
        planes.add(airplane);
    }

    @Override
    public int getPersonnel() {
        Iterator<IAlliancePart> iterator = planes.iterator();
        int personnnel = 0;
        // We iterator over the entire air force which can
        // contain leaf nodes (planes) or other composites
        // (air forces). This iteration is an example of an
        // internal iterator.
        while (iterator.hasNext()) {
            personnnel += iterator.next().getPersonnel();
        }

        return personnnel;
    }
}