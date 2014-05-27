/**
 * Created by gzamudio on 5/23/14.
 */

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class Problem7 {

    public String run() {
        String solution =  String.valueOf(primeNumberOfPosition(10001));
        return String.valueOf(solution);
    }

    protected int primeNumberOfPosition(int positionNumber){
        int count = 1;
        int number = 1;

        while (count < positionNumber) {
            number = number + 2;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    protected boolean isPrime(int number) {

    boolean prime = true;
    int limit = (int) Math.sqrt ( number );

    for ( int i = 2; i <= limit; i++ )
    {

        if (number % i == 0){
            prime = false;
            break;
        }
    }
    return prime;
    }
}
