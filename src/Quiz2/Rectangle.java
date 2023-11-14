package Quiz2;
/*Write a Java class Rectangle with following features: Instance variables :
length of type float.
width of type float
Instance methods:  calculateArea(): This method calculate area of rectangle .*/
public class Rectangle {

    //Declaring Instance variables
     float length=6.8f;
     float width=2.8f;

     //Instance method to calculate area of rectangle
    public void calculateArea(){
        float rect=length*width;
        System.out.println("Area of Rectangle: "+rect);
    }

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.calculateArea();

    }

}
