package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice2 {
    public static void main(String[] args) {
         HashMap<String,Integer> grocery= new HashMap<>();

         grocery.put("Tomato",10);
         grocery.put("Banana",4);
         grocery.put("Coffee",6);
         grocery.put("Salad",7);

         Iterator<String> it =grocery.keySet().iterator();
         while (it.hasNext()) {

             String gKey = it.next();
             Integer gValue = grocery.get(gKey);
             System.out.println("We need grocery of: " + gKey + " " + "price is: " + gValue);
         }
             System.out.println("---------------");
             grocery.replace("Coffee",3);

           Iterator<Map.Entry<String,Integer>>it2=  grocery.entrySet().iterator();
           while (it2.hasNext()){

               Map.Entry<String,Integer> kGrocery= it2.next();

               System.out.println("Grocery is: "+kGrocery.getKey()+ " "+"Price: "+kGrocery.getValue());

           }





    }
}
