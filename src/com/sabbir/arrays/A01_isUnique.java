package com.sabbir.arrays;

public class A01_isUnique {
    public static void main(String[] args) {
        String str = "sabbir";
        //System.out.println(isUnique1(str));
        System.out.println(isUnique(str));

    }

    public static boolean isUnique1(String str){

        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 1; j < strArray.length-1; j++) {
                if(i==j){
                    continue;
                }
                if(strArray[i] == strArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isUnique(String str){
        boolean[] char_set = new boolean[128];
        System.out.println(char_set);

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("At index: "+i +" - val: "+val+" char_set[val]: "+  char_set[val]);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
