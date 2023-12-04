package Project;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of even
        // and odd numbers for that array.
        int [][] array={{3,8,9,6},
                        {4,5,6,7},
                        {9,6,5,4}
        };
        int evenSum=0;
        int oddSum=0;

        for(int[] row:array){
            for(int num:row){

                if(num%2==0){
                    evenSum=evenSum+num;
                }else {
                    oddSum=oddSum+num;
                }
            }
        }
        System.out.println("Sum of even numbers: " +evenSum);
        System.out.println("Sum of odd numbers: " +oddSum);
    }
}
