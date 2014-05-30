
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class Problem10 {

    public String sumOfPrimeNumbersBelowSolution(long number) {
        long solution = sumOfPrimeNumbersBelow(number);
        return String.valueOf(solution);
    }

    public long sumOfPrimeNumbersBelow(long number) {
        long sum = 0;

        for (long i = 2; i < number; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPrime(long number) {
            boolean prime = true;
            long limit = (long) Math.sqrt ( number );

            for ( long i = 2; i <= limit; i++ ) {
                if (number % i == 0){
                    prime = false;
                    break;
                }
            }
            return prime;
        }
}
