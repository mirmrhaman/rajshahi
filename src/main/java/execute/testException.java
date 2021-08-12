package execute;

public class testException {
    public void addNumbers(int[] a, int[] b) {
        try {
            int sum = a[0] + b[0];
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void subtractNumbers(int[] a, int[] b) {
        try {
            int result = a[1] - b[1];
            System.out.println("Subtract = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void multiplyNumbers(int[] a, int[] b) {
        try {
            int result = a[0] * b[0];
            System.out.println("Multiply = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            // "Try Catch" Result shows as : (Here 1st and 3rd are ok but 2nd one have some fault)
        // Sum = 5
        //Index 1 out of bounds for length 1
        //Multiply = 6
        //the error shows the specific line of code and give the results for others.
        // 1:02:00 in 2nd lecture on 8th weeks

    }
}

