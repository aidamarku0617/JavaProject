package Project;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        Scanner scanner=new Scanner(System.in);
        int [] temperatures=new int[7];
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Enter temperature for day" +(i+1)+ ":");
            temperatures [i]= scanner.nextInt();
        }
        int highestTemperature=temperatures[0];
        int lowestTemperature=temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures [i]>highestTemperature){
                highestTemperature=temperatures [i];

            }
           if (temperatures [i]< lowestTemperature ){
               lowestTemperature=temperatures [i];

           }
        }
        System.out.println("Highest temperature for the week: " +highestTemperature);
        System.out.println("Lowest temperature for the week: " +lowestTemperature);
    }
}
