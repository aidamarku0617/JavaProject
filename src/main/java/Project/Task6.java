package Project;

public class Task6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?

        int num=29;
        boolean isPrime=true;

        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;

                }
            }
        }
        if(isPrime){
            System.out.println(num+" Is a prime number");

        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
