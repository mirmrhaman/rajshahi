package execute;

public class LearnRecursion {
    // sum of a range of numbers
    // Input = 10
    // Sum = 1+2+3+4+5+6+7+8+9+10=55

    public int sumRangeOfNumbers(int k) {  //2 -- 1   decremented
        if (k > 0) {
            return k + sumRangeOfNumbers(k - 1); // 2 + 1 + 0 result =3
        } else {
            return 0;
        }    // 1:36:48 time
    }
}
