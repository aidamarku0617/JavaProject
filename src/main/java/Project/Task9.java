package Project;

public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?

        int [] numbers={4,6,2,8,12};
        int max=numbers[0];
        int secondMax=Integer.MIN_VALUE;
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]>max){
                secondMax=max;
                max=numbers[i];
            } else if (numbers[i]>secondMax && numbers[i]!=max) {
                secondMax=numbers[i];
            }
        }
        System.out.println("Second largest number "+secondMax);
    }
}
