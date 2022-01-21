package Examples.E012;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        employeeMap.put(35, "Mark");
        employeeMap.put(40, "John");
        employeeMap.put(23, "Michael");
        employeeMap.put(31, "Jim");
        employeeMap.put(25, "Kevin");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
            if (employee.getValue().equals("Mark")) {
                linkedHashMap.put(employee.getKey(), employee.getValue());
            }
        }

        System.out.println("Filtered Map: " + linkedHashMap);
    }

    static Map<Integer, String> employeeMap = new HashMap<>();


}
