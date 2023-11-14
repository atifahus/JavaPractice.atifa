package Quiz2;
/*Write a Java class Square with following features: Instance variables :
length of type float.
width of type float
Instance methods:  public float calculatePerimeter(): This method calculate perimeter of sqaure.*/
public class Square {

    //declaring Instance variables
    float length;
    float width;

    //Instance method to calculate perimeter of sqaure
    public float calculatePerimeter(float length,float width){
    float perimeter=length*width;
    return perimeter;
    }

    public static void main(String[] args) {
        Square square=new Square();
        System.out.println("Perimeter of Square is: "+ square.calculatePerimeter(2.5f,2.5f));
    }



}
