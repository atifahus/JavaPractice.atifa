package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class IteratorPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> dessertMap= new HashMap<>();

        dessertMap.put("IceCream", 10);
        dessertMap.put("Chocolate",3);
        dessertMap.put("PanCake", 5);
        dessertMap.put("cake", 30);
        dessertMap.put("Chai",1);

        //method 1 using keySet(). only using key
        Iterator<String> it=dessertMap.keySet().iterator();

        while (it.hasNext()) {
            String item=it.next();
            Integer price= dessertMap.get(item);

            System.out.println(item+" "+price);

        }
        System.out.println("-----------------");
        //method 2 using entryKey(). it is pair
        Iterator<Map.Entry<String,Integer>> it2=dessertMap.entrySet().iterator();

        while (it2.hasNext()) {

           Map.Entry<String,Integer> menu= it2.next();
         //   System.out.println(menu);

            System.out.println(menu.getKey()+ " "+ menu.getValue()); //using getKey() and getValue() will let us customize

        }





    }
}
