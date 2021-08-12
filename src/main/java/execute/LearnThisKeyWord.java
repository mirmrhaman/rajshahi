package execute;

public class LearnThisKeyWord {
    int a;
    int b;

//    public void setData(int a, int b) {
//        a = a;
//        b = b;
//    }
//
//    public void showData() {
//        System.out.println("Value of A =" + a);
//        System.out.println("Value of B =" + b);

    // Java get confused because it assign same value in both public class and public void.
        // As a result in terminal it shows Value of A = 0 and Value of B = 0


        public void setData(int a, int b) {
            this.a = a;    // With this 'this.' variable java can understand
            this.b = b;         // which one is the class variable and which one is method variable.
        }

        public void showData() {
            System.out.println("Value of A = " + a);
            System.out.println("Value of B = " + b);

                // Now result showing (Value of A = 2, Value of B = 2
    }
}
