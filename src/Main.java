public class Main {

    public static void main(String[] args) {
//Problem 1:
        Problem1 sumMultiplesOfThreeAndFive = new Problem1();
        String problem1Solution = sumMultiplesOfThreeAndFive.run();
        System.out.println(problem1Solution + " is the sum of multiples of 3 and 5");

//Problem 2:
        Problem2 evenFibonacciNumbers = new Problem2();
        String problem2Solution = evenFibonacciNumbers.run();
        System.out.println(problem2Solution + " is the sum of the even-valued terms under four million ");

//Problem 3:
        Problem3 largestPrimeFactor = new Problem3();
        String problem3Solution = largestPrimeFactor.run(600851475143L);
        System.out.println(problem3Solution + " is the largest prime factor for the number 600851475143");

//Problem 4:
        Problem4 largestPalindrome = new Problem4();
        String problem4Solution = largestPalindrome.run();
        System.out.println(problem4Solution + " is the largest palindrome made from the product of two 3-digit numbers");


//Problem 5:
        Problem5 problem5 = new Problem5();
        String problem5Solution = problem5.run();
        System.out.println(problem5Solution+" is the smallest number evenly divisible by all numbers from 1 - 20");

    }

}

