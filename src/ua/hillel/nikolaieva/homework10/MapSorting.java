package ua.hillel.nikolaieva.homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class MapSorting {

    public static void main(String[] args) {

        City dnipro = new City("Dnipro");
        City odesa = new City("Odesa");
        City kyiv = new City("Kyiv");
        City sumy = new City("Sumy");
        City ternopil = new City("Ternopil");
        City chernihiv = new City("Chernihiv");

        Map<String, City> cityPostalCodes = new HashMap<>();
        LinkedHashMap<String, City> sortedMap = new LinkedHashMap<>();
        ArrayList<City> list = new ArrayList<>();

        cityPostalCodes.put("49000", dnipro);
        cityPostalCodes.put("65000", odesa);
        cityPostalCodes.put("01501", kyiv);
        cityPostalCodes.put("40000", sumy);
        cityPostalCodes.put("46003", ternopil);
        cityPostalCodes.put("14021", chernihiv);

        System.out.println(cityPostalCodes);

        for (Map.Entry<String, City> entry : cityPostalCodes.entrySet()) {
            list.add(entry.getValue());
        }

        var cityComparator = new Comparator<City>() {
            public int compare(City city1, City city2) {
                String city1Name = city1.toString();
                String city2Name = city2.toString();

                return city1Name.compareTo(city2Name);
            }
        };

        list.sort(cityComparator);

        for (City city : list) {
            for (Entry<String, City> entry : cityPostalCodes.entrySet()) {
                if (entry.getValue().equals(city)) {
                    sortedMap.put(entry.getKey(), city);
                }
            }
        }
        System.out.println(sortedMap);

    }

}


