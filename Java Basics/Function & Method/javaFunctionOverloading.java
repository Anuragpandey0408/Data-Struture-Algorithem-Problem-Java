// function overloading using parameter

public class javaFunctionOverloading {
    // sum of two number(int)
    public static int Sum(int a, int b){
        return a+b;
    }
    // sum of three number (int)
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
    // sum of two float number
    public static float Sum(float a, float b){
        return a + b;
    }
    // multiply of two int number
    public static float Multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("sum of two int value : "+Sum(2,3));
        System.out.println("sum of three int value : "+Sum(5,6,7));
        System.out.println("sum of two float value : "+Sum(2.5f,3.0f));
        System.out.println("multiplication of two int value : "+Multiply(2,3));

    }
}
