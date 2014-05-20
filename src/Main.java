public class Main {

    public static void main(String[] args) {
//Problem 1:

        Problem1 sumMultiplesOfthreeAndFive = new Problem1();
        String problem1Result = sumMultiplesOfthreeAndFive.run();
        System.out.println(problem1Result);

//Problem 2:
        Problem2 evenFibonacciNumbers = new Problem2();
        String result = evenFibonacciNumbers.run();
        System.out.println(result);
    }
}
