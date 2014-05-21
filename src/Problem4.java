import java.util.ArrayList;

/**
 * Created by gzamudio on 5/21/14.
 */
public class Problem4 {
    /*
A palindromic number reads the same both ways.
ex: The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

    public String run() {
        ArrayList<Integer> palindromeList = palindromeNumber();

        int max = palindromeList.get(0);

        for (int i = 1; i < palindromeList.size(); i ++){
            if (palindromeList.get(i) > max){
               max = palindromeList.get(i);
            }
        }
        String maxNumber = String.valueOf(max);

        return maxNumber;
    }

    protected ArrayList<Integer> palindromeNumber(){

        ArrayList<Integer> palindrome = new ArrayList<Integer>();
        int a;

        for (int i = 999; i > 100; i--){
            for (int j = 999; j > 100; j--){
                a = i * j;

                if (isPaling(a)){
                    palindrome.add( i * j);
                }
            }
        }
        return palindrome;
    }

    protected boolean isPaling(int number) {

        String numberString = String.valueOf(number);

        String reverse = "";
        int length = numberString.length();

        for( int i = length - 1 ; i >= 0 ; i-- ) {
            reverse = reverse + numberString.charAt(i);
        }

        if (reverse.equals(numberString)){

            return true;
        }
        return false;
    }


}
