/**
 * Created by gzamudio on 5/23/14.
 */

/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

//   Step 1: Find the squares of the first ten natural numbers
//   Step 2: Find the sum of the first ten natural numbers
    public int sumOfTheSquaresOfFirstTenNaturalNumbers(){
//        answer: 385
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i * i;
        }
        return sum;
    }


//   Step 3: Find the square of the sum of the ten natural numbers (from step 3)
    public int squareOfTheSumOfTheFirstTenNaturalNumbers(){
//    answer: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i;
        }

        int squareOfTheSumTotal = sum * sum;
        return squareOfTheSumTotal;
    }

//   Step 4: Find the difference between both of them
    public int differenceBetweenBoth(){
         int differenceResult = squareOfTheSumOfTheFirstTenNaturalNumbers() - sumOfTheSquaresOfFirstTenNaturalNumbers();
        return differenceResult;
    }

    public String run(){

        int number = differenceBetweenBoth();

        return String.valueOf(number);
    }


}
