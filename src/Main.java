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
    }
}
