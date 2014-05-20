/**
 * Created by gzamudio on 5/20/14.
 */
public class Problem3 {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?

    public String run(long number) {
        Long result =  largestPrimeFactor(number);
        return Long.toString(result);
    }

    public long largestPrimeFactor(long number){
/*   Prime factors are prime numbers that multiply together can make the original number
        //        Prime number can be divided evenly only by 1 or itself and it
        must be a whole number greater than 1:

 */
        int i;
        for(i = 2; i <= number; i++){

            if(number % i == 0){

                number  = number/i;
                i--;
            }
        }
        return i;
    }
}
