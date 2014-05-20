/**
 * Created by gzamudio on 5/19/14.
 */

//Problem 2:
//Even Fibonacci numbers - Each new term in the Fibonacci sequence is
// generated by adding the previous two terms. By starting with 1 and 2,
// the first 10 terms will be:
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//  By considering the terms in the Fibonacci sequence whose values
// do not exceed four million, find the sum of the even-valued terms.

public class Problem2 {

    public String run() {
        int sum = 0;
        for (int i = 0; ; i++) {
            int fibonacci = Fibonacci(i);
            if (fibonacci > 4000000)
                break;
            if (fibonacci % 2 == 0)
                sum += fibonacci;
        }
        return Integer.toString(sum);
    }

    private static int Fibonacci(int x){
        int a = 0;
        int b = 1;

        for (int i = 0; i < x ; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
