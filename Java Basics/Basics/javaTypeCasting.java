/*

import java.util.*;
//public class javaTypeCasting {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float a = 25.0f;      // float a = 25.0f (25.0 without f is double )
//        int b = (int)a;
//        System.out.println(b);
//    }
//    
}

*/


import java.util.*;
public class javaTypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = 5;
        byte b = 25;
        char ch = 'c';
        char c = 'c';
        int FinalValue = (short)(a + b + c);
        int asciivalue = (int)(c);
       
        System.out.println("final value is (c ascii value + 25 + 5) :"+FinalValue);
        System.out.println("final value is :"+asciivalue);

    }
    
}