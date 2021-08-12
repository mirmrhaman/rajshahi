package execute;

import java.util.Scanner;

public class ReadDataFromTerminal {
    public void getInputFromUser() {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//        System.out.println("You entered string: " + name);

        // Enter data through terminal and print as
        // (Enter your name: Mathew
        //You entered string: Mathew)

//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        System.out.println("Your entered age is: " + age);

        // Print as -
        /* Enter your name: Mathew
           You entered string: Mathew
           Enter your age: 25
           Your entered age is: 25
        */

//        System.out.print("Enter Product Price: ");
//        double price = input.nextDouble();
//        System.out.println("Your entered price: " + price);

        /* Enter Product Price: 35.25
          Your entered price: 35.25
        */

    // Sum off dynamic value

        System.out.print("Enter value 1: ");
        int value1 = input.nextInt();

        System.out.print("Enter value 2: ");
        int value2 = input.nextInt();

        int sum = value1 + value2;

        System.out.println("My total is: " + sum);  // It is sum off (Enter value 1: 25, Enter value 2: 30, My total is: 55)

        System.out.println("My total is: " + value1 + value2); // It concatenate two values Enter value 1: 5; Enter value 2: 5; My total is: 55


    }
}
