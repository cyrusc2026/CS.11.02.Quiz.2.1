public class Main {

    public static void main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.
int resultOne = add(5, 6);
        // print resultOne.
System.out.println (resultOne);
        // call the greeting method and store the result into a variable called resultTwo.
String resultTwo = greeting("Cyrus");
        // print resultTwo.
        System.out.println (resultTwo);
        // call the second add method and store the result into a variable called resultThree.
int resultThree = add(1,2,3,4);
        // print resultThree.
System.out.println (resultThree);
        // call the printCapitalised method.
printCapitalised("abcdefg");
    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }


    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
public static String greeting(String name){
    return ("Bonjour, " + name + "!");
}

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */
public static int add (int numOne, int numTwo, int numThree, int numFour){
    int sumTwo = add(numOne, numTwo);
    int sumThree = add(numThree, sumTwo);
    int sumFour = add(sumThree, numFour);
    return sumFour;
}

    /**
     * printCapitalised
     * @param tobePrinted - a String that the user wishes to be printed in all caps.
     */
public static void printCapitalised (String tobePrinted){
    System.out.println(tobePrinted.toUpperCase());
}



}
