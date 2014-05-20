/**
 * Created by gzamudio on 5/20/14.
 */
public class Problem3 {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?

    public String run() {
        long number = 600851475143L;

        Long result =  PrimeFactors(number);

        return Long.toString(result);
    }

    private static long PrimeFactors(long x){
/*   Prime factors are prime numbers that multiply together can make the original number
        //        Prime number can be divided evenly only by 1 or itself and it
        must be a whole number greater than 1:

 */
        int i;
        for(i = 2; i <= x; i++){

            if(x % i == 0){

                x  = x/i;
                i--;
            }
        }
        return i;
    }
}
