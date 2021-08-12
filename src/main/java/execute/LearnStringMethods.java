package execute;

public class LearnStringMethods {
    public void learnIndexOf() {
        String myStr = "Hello planet earth, you are a great planet";
        //System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("e", 5));
    }

    public void learnSubString() {
        String str = "JavaPoint";
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,4));

        String myStr = "Hello planet earth, you are a great planet";
        int indexNumber = myStr.indexOf("earth");
        System.out.println(myStr.substring(indexNumber, indexNumber + 5));
    }

    public void learnLength() {
        String str = "JavaPoint";
        System.out.println(str.length());
    }
    public void learnReplace() {
        String str = "Hello;";
        System.out.println(str.replace('l', 'p'));

        String myStr = "My name is Adam";
        System.out.println(myStr.replaceAll("Adam", "David"));
    }

    public void learnTrim() {
        String myStr = "       Hello World      ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

    }

    public void learnConvertCase() {
        String actualValue = "Hello";
        String expectedValue = "HELLO";

        if (actualValue.equals(expectedValue.toLowerCase())); {
            System.out.println("this is true");
        }
    }

    public void learnCharAt() {
        String str = "Hello";
        char result = str.charAt(0);
        System.out.println(result);
    }

    // Print a word in reverse order
    // Adam -> mada
    //hello ->olleh

    public void printReverseString(String str) {
        // length()
        // Index number
        // Loop
        String reverseWord = "";
        for (int i = str.length()-1; i >=0; i--) {
            char alphabet = str.charAt(i);
            reverseWord += String.valueOf(alphabet);
        }
        System.out.println(reverseWord);
    }
    public void learnValueOf() {
        int value = 10;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10);
    }

    // "My name is Jonathan and I an 20 years old and my salary is $40,000 yearly"

    public void learnFormat() {
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;
        String duration = "yearly";

        //System.out.println("My name is " + name + " and I am " + age + " years old and my salary is $" + salary + " yearly"); //Any of this can be use

        System.out.println(String.format("My name is %s and I an %d years old and my salary is $%d %s", name, age, salary, duration)); // This is peferable method.

    }

    public void learnFormatInArray() {        // This example out of lecture note
        String[] names = { "Jonathan", "Robert", "Oliver"};
        int[] ages = {20, 40, 30};
        int[] salaries = {40000, 50000, 45000};

        for (int i = 0; i< names.length; i++) {
            String sentence = String.format("My name is %s and I am %d years old and my salary is $%d yearly", names[i], ages[i], salaries[i]);
            System.out.println(sentence);
        }
    }

    public void learnContains() {
        String sentence = " My name is Robert";
        System.out.println(sentence.contains("Albert")); // Robert = true, Albert = false
    }

    public void learnSplit() {
        String names = "John, Ali, Mathew, Abraham";
        String[] arrNames= names.split(",");
        for (String name:arrNames) {
            System.out.println("Person Name is: " + name);
        }
    }
    public void learnSplitArray() {
        String sentence = "I live in New York";  // Splitting words based on it's space
        String[] words = sentence.split(" ");

        for (String word: words ) {
            System.out.println("Word is: " + word);
        }

        // York New in live I

        String reverse = "";

        for(int i = words.length -1; i >=0; i--) {
            reverse += words[i] + " ";        // same as reverse = reverse + words[i]
        }
        System.out.println("Reverse Sentence is: " + reverse);
    }


}
