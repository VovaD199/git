package Examples.E012;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static Examples.E012.Main.employeeMap;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        employeeMap.put(35, "Mark");
        employeeMap.put(40, "John");
        employeeMap.put(23, "Michael");
        employeeMap.put(31, "Jim");
        employeeMap.put(36, "Kevin");


        for (Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
            if (employee.getKey() > 30) {
                linkedHashMap.put(employee.getKey(), employee.getValue());
                System.out.println("Filtered Map: " + linkedHashMap);
            }

        }

    }


}
