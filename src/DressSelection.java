import java.util.Scanner;
public class DressSelection {
    public static void main(String[] args) {
        /* Weather: sunny, rainy, cold, Hot
        temperature: -30 to 100 F in double
        Occasion: Picnic, Office Party, Birthday in String
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the Weather (e.g sunny, rainy, cold, Hot) : ");
        String weather= sc.next().toLowerCase();

        System.out.println("Please Enter the Temperature (e.g between -25 to 100 F) : ");
        double temp= sc.nextDouble();

        System.out.println("Please Enter the Occasion (e.g picnic, officeParty, birthday) : ");
        String occasion=sc.next().toLowerCase();

        String dressRecommendation="";

        if(weather .equals("sunny")) {
            if (temp > -25 && temp < 25) {
                if (occasion .equalsIgnoreCase("picnic")) {
                    dressRecommendation = "Wear a jeans, shirt, sweater";
                }
                else if (occasion.equalsIgnoreCase("office Party")) {
                    dressRecommendation="Wear a formal outfit and a coat";
                } else if (occasion.equalsIgnoreCase("birthday")) {
                    dressRecommendation="Wear a dress and jacket";
                }
                else{
                    dressRecommendation="Select an valid occasion";
                }
            } else if (temp > 25 && temp < 60) {
                if (occasion .equals("picnic")) {
                    dressRecommendation = "Wear a jeans, shirt, sweater";
                }
                else if (occasion.equals("officeParty")) {
                    dressRecommendation="Wear a formal sweater dress";
                } else if (occasion.equals("birthday")) {
                    dressRecommendation="Wear a dress and jacket";
                }
                else{
                    dressRecommendation="Select an valid occasion";
                }
            } else if (temp > 60 && temp < 100) {
                if (occasion .equals("picnic")) {
                    dressRecommendation = "Wear a jeans, shirt";
                }
                else if (occasion.equals("office Party")) {
                    dressRecommendation="Wear a formal outfit";
                } else if (occasion.equals("birthday")) {
                    dressRecommendation="Wear a light dress";
                }
                else{
                    dressRecommendation="Select an valid occasion";
                }
            } else {
                dressRecommendation = "Please select a temperature between -25 to 100 degree";
            }
        }
        else if(weather .equals("rainy")) {
                    if (temp > -25 && temp < 25) {
                        dressRecommendation = "Wear a Down Jacket";
                    } else if (temp > 25 && temp < 60) {
                        dressRecommendation = "Wear a jeans, sweater and rain coat";
                    } else if (temp > 60 && temp < 100) {
                        dressRecommendation = "Wear somthing light clothing and bring a umbrella";
                    } else {
                        dressRecommendation = "Please select a temperature between -25 to 100 degree";
                    }
        }
        else if (weather.equals("cold")) {
                        if (temp >-25 && temp <25) {
                            dressRecommendation="Wear a Down Jacket";
                        }
                        else if(temp > 25 && temp <60) {
                            dressRecommendation= "Wear a jeans, sweater and a light Jacket";
                        } else if (temp >60 && temp <100 ) {
                            dressRecommendation="Wear something light clothing";
                        }
                        else {
                            dressRecommendation="Please select a temperature between -25 to 100 degree";
                        }

        }
        else {
            System.out.println("Enter valid entry");
        }
        System.out.println("Your OOTD: "+dressRecommendation);


        }
    }

