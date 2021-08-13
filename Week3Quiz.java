public class Week3Quiz {

    // public static void main(String[] args) {
    //     String firstName = "Tom";
    //     String lastName = "Sawyer";
    //     System.out.println(createFullName(firstName, lastName));
    // }

    // public static String createFullName(String first, String last) {
    //     return first + " " + last;
    // }

    // public static void main (String[] args) {

    //     int base = 3;
    //     int exponent = 4;
    //     System.out.println(intToTheExponent(base, exponent));
    // }
    
    // public static int intToTheExponent(int num, int powerOf) {
    //     int total = num;
    //         for (int i = 0; i < powerOf - 1; i++) {
    //             total = num * total;
    //         }
    //         return total;
    // }

    public static void main(String[] args) {

        String word = "Hello";
        int numTimes = 3;
        System.out.println(wordNumTimes(word, numTimes));
    }

    public static String wordNumTimes(String phrase, int repeatTimes) {
        String completedString = new String();
        for (int i = 0; i < repeatTimes; i++) {
            completedString += phrase;
        }
        return completedString;
    }
}