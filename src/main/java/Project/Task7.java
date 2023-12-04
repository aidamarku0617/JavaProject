package Project;

public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        int num=10;
        int firstTerm=0;
        int secondTerm=1;
        System.out.println("First " +num +"terms of Fibonacci series");

        for (int i = 0; i <=num; i++) {
            System.out.print(firstTerm +" ");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
