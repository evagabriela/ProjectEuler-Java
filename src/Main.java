public class Main {

    public static void main(String[] args) {
//Problem 1:
        Problem1 sumMultiplesOfThreeAndFive = new Problem1();
        String problem1Solution = sumMultiplesOfThreeAndFive.run();
        System.out.println(problem1Solution);

//Problem 2:
        Problem2 evenFibonacciNumbers = new Problem2();
        String problem2Solution = evenFibonacciNumbers.run();
        System.out.println(problem2Solution);

//Problem 3:
        Problem3 largestPrimeFactor = new Problem3();
        String problem3Solution = largestPrimeFactor.run();
        System.out.println(problem3Solution);
    }
}
