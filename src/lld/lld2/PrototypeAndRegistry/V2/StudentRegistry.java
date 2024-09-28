package lld.lld2.PrototypeAndRegistry.V2;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentsMap = new HashMap<>();
    public void register(String key, Student s){
        studentsMap.put(key, s);
    }
    public Student get(String key){
        return studentsMap.get(key);
    }

}
