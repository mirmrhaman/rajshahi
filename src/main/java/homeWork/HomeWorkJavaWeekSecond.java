package homeWork;
import java.io.File;
import java.util.HashMap;
/* Problem 5:
     Create a method that will accept 3 int values, a b c,
     as a parameter and return their sum.
     However, if one of the values is the same as another of the values,
     it does not count towards the sum.
     Sample Output Example:
     loneSum(1, 2, 3) → 6
     loneSum(3, 2, 3) → 2
     loneSum(3, 3, 3) → 0
     Method Structure -
     public int loneSum(int a, int b, int c) { }  */
    public class HomeWorkJavaWeekSecond {
        public int loneSum(int a, int b, int c) {
            int sum = 0;
            if ( a != b && a != c ) {sum += a; }
            if ( b != a && b != c ) {sum += b; }
            if ( c != a && c != b ) {sum += c; }
            return sum;
        }
}














/*  Problem 1:
  Create a method that will accept an array of strings as a method parameter,
  return a HashMap<String, Integer> containing a key for every different string in the array,
  always with the value 0.
  Sample Output Example:
  word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
  word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
  word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
  word0(["c", "c", "c", "c"]) → {"c": 0}
  Hints: To validate a key exist in a Hash Map you can use containsKey.
  Method Structure -  public HashMap<String, Integer> word0(String[] strings) {  }
*/

/*

public class HomeWorkJavaWeekSecond {
    public HashMap<String, Integer> word0(String[] strings){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String arr: strings) {
            if(!hashMap.containsKey(arr)) {
                hashMap.put(arr, 0);
            }
        }
        return hashMap;
    }
 }
*/


/*  Problem 2:
    Create a method that will accept an array of strings as a method parameter,
    return a Map<String, Integer> containing a key for every different string in the array,
    and the value is that string's length.
    Sample Output Example:
    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
    Method Structure -
    public HashMap<String, Integer> word0(String[] strings) { }
 */
//public class HomeWorkJavaWeekSecond {
//    public HashMap<String, Integer> problem2(String[] strings){
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        for (String arr: strings) {
//            if(!hashMap.containsKey(arr)) {
//                hashMap.put(arr, arr.length());
//            }
//        }
//        return hashMap;
//    }
//}

/*Problem 3:
    Create a method that will accept a number n as a method parameter,
    create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n maybe 0, in which case just return a length 0 array.
    Sample Output Example:
    fizzArray(4) → [0, 1, 2, 3]
    fizzArray(1) → [0]
    fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    Method Structure -  public int[] fizzArray(int n) { }
 */
//public class HomeWorkJavaWeekSecond {
//    public int [] fizzArray (int n) {
//        int[] array = new int[n];
//        if (n==0) {
//            return array;
//        }
//        for (int i=0; i<n; i++) {
//            array[i] = i;
//        }
//        return array;
//    }
//}




/*  Problem 4:
        Create a method that will return the number of times
        that the string "hi" appears anywhere in the given string.
        The method will accept a String as a parameter.

        Sample Output Example:
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2

        Method Structure -
        public int countHi(String str) { }
 */

//public class HomeWorkJavaWeekSecond {
//    public int countHi(String str) {
//        int counter = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            String name = str.substring(i, i+2);
//            if (name.equals("hi")) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//}




/* Problem 5:
     Create a method that will accept 3 int values, a b c,
     as a parameter and return their sum.
     However, if one of the values is the same as another of the values,
     it does not count towards the sum.
     Sample Output Example:
     loneSum(1, 2, 3) → 6
     loneSum(3, 2, 3) → 2
     loneSum(3, 3, 3) → 0
     Method Structure -
     public int loneSum(int a, int b, int c) { }  */

//public class HomeWorkJavaWeekSecond {
//    public int loneSum(int a, int b, int c) {
//        int sum = 0;
//        if ( a != b && a != c ) {sum += a; }
//        if ( b != a && b != c ) {sum += b; }
//        if ( c != a && c != b ) {sum += c; }
//        return sum;
//    }
//}


