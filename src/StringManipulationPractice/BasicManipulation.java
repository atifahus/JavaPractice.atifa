package StringManipulationPractice;

public class BasicManipulation {
    public static void main(String[] args) {
        String str ="This is String Manipulation Practice Class";
        String str1 ="This is String manipulation Practice Class";

        System.out.println(str.length());
        System.out.println(str.charAt(8));      //gives value to specific index. 0-41

        System.out.println(str.indexOf('s'));   //tell the position of s. 1st position of 's'
        //when Sting has multiple same char
        System.out.println(str.indexOf('s',5)); //this is hard code
        System.out.println(str.indexOf('s',str.indexOf('s')+1)); //2nd position od 's'

        System.out.println(str.indexOf("Manipulation")); //it will give the position of 1st char
        System.out.println(str.indexOf("Java")); //if it is not in String, it will give -1 position

        //String Comparison
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        //SubStrings
        System.out.println(str.substring(8,27));

        //trim
        String s= "    Hello World   "; //here we have before space, mid space, after space
        System.out.println(s.trim());  //trim method removes only before space and after space

        System.out.println(s.replace(" ","")); //to remove/replace mid space to no space

        String date="11-17-2023";
        System.out.println(date.replace("-","/"));

        //concat
        String s1="Practice";
        System.out.println(s1.concat("s")); //add at the end

    }


}
