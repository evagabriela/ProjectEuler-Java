/**
 * Created by gzamudio on 5/29/14.
 */

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */


public class Problem9 {
    public String run() {
        int solution = productOfPythagorean();
        return String.valueOf(solution);
    }

    public boolean isPythagorean(int num1, int num2, int num3) {
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            return true;
        } else if (num1 > num2 && num2 > num3) {
            return true;
        } else if (Math.pow(num1, 2) + Math.pow(num1, 2) == Math.pow(num3, 2)) {
            return true;
        } else {
            return false;
        }
    }

    public int productOfPythagorean() {
        int num1 = 0, num2 = 0, num3 = 0;
        int sum = 1000;
        boolean found = false;
        for (num1 = 1; num1 < sum / 3; num1++) {
            for (num2 = num1; num2 < sum / 2; num2++) {
                num3 = sum - num1 - num2;

                if (num1 * num1 + num2 * num2 == num3 * num3) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return num1 * num2 * num3;
    }
}
