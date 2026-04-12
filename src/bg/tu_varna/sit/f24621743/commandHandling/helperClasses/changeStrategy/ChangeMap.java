package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import java.util.HashMap;
import java.util.Map;

public class ChangeMap {
    private Map<String,ChangeEvent> map = new HashMap<>();

    public ChangeMap() {
        map.put("date", new ChangeDate());
        map.put("starttime", new ChangeStartTime());
        map.put("endtime", new ChangeEndTime());
        map.put("name", new ChangeName());
        map.put("note", new ChangeNote());
    }

    public ChangeEvent get(String option){
        return map.get(option);
    }
}
