package com.sabbir.arrays;

public class A04_reverseString {
    /**
     * option 1
     * <p>
     * Get char at each index and addit in temp string.
     *
     * @param inputString
     * @return
     */
    public static String reverseString(String inputString) {
        if (inputString == null || inputString.isEmpty() || inputString.length() < 2) {
            return inputString;
        }
        String tempString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char tempChar = inputString.charAt(i);
            tempString = tempChar + tempString;
        }
        return tempString;
    }

    /**
     * option 2
     * <p>
     * convert the string into char array, then run for loop in reverse order to sore the array.
     *
     * @param inputString
     * @return
     */
    public static String reverseString2(String inputString) {
        if (inputString == null || inputString.isEmpty() || inputString.length() < 2) {
            return inputString;
        }
        char[] tempCharArray = inputString.toCharArray();
        StringBuilder resversString = new StringBuilder();
        for (int i = tempCharArray.length - 1; i >= 0; i--) {
            char tempChar = inputString.charAt(i);
            resversString.append(tempChar);
        }
        return resversString.toString();
    }

    /**
     * option 3
     * <p>
     * use StringBuilder in build reverse method.
     *
     * @param inputString
     * @return
     */
    public static String reverseString3(String inputString) {
        if (inputString == null || inputString.isEmpty() || inputString.length() < 2) {
            return inputString;
        }
        StringBuilder reverString = new StringBuilder();
        return reverString.append(inputString).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Sabbir"));
        System.out.println(reverseString2("Sabbir"));
        System.out.println(reverseString3("Sabbir"));
    }
}
