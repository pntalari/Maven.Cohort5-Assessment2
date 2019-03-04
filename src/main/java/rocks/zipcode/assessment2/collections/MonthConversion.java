package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    private SortedMap<Integer, String> map = new TreeMap<>();

    public void add(Integer monthNumber, String monthName) {
        map.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if (map.containsKey(monthNumber)) {
            return map.get(monthNumber);
        } else
            throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer month = 0;
        if (map.containsValue(monthName)) {
            {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().contains(monthName)) {
                        month = entry.getKey();
                    }
                }
            }
        } else
          month = null;

        return month;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return map.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        return map.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName   - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(monthNumber)) {
                entry.setValue(monthName);
            }
        }
    }
}
