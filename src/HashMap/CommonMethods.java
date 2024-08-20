package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CommonMethods {

    public static void main(String[] args) {
        HashMap<String, Double> dessertMap= new HashMap<>();

       //put() method to add key and value
        dessertMap.put("IceCream", 10.99);
        dessertMap.put("Chocolate",3.99);
        dessertMap.put("PanCake", 5.99);
        dessertMap.put("cake", 30.99);

        System.out.println(dessertMap);

        //get() method to get the value of the key
      /*  System.out.println("Enter:");
        Scanner p=new Scanner(System.in);
        String name=p.next();
         System.out.println(dessertMap.get(name));*/

         System.out.println(dessertMap.get("PanCake"));
        System.out.println(dessertMap.get(30.99)); //

        //containsKey() to check if that key exists. it will return true/false

        System.out.println(dessertMap.containsKey("cake"));
        System.out.println(dessertMap.containsKey("IceCream"));

        //containsValue() to check if value exists. will return true/false
        System.out.println(dessertMap.containsValue(5.99));
        System.out.println(dessertMap.containsValue(2));

        //putIfAbsent() will add new storage if not created before
        dessertMap.putIfAbsent("crepe", 2.99);
        System.out.println(dessertMap);

        dessertMap.putIfAbsent("cake", 2.99); //if the key already exists, no change will happen
        System.out.println(dessertMap);

        //replace() to replace the value
        dessertMap.replace("IceCream", 1.99);
        System.out.println("After using replace method: "+ dessertMap);

        //remove() to delete a storage
        dessertMap.remove("crepe");
        System.out.println("After removing remove method: "+dessertMap);

    }
}
