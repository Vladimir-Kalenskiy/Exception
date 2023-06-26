package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(test1(0));

//        System.out.println(test2());

        int[] array = new int[]{1,2,3,4,5};
//        test3(array);
    }
    // ArithmeticException
    private static int test1(int a){
        int result;
        return result=10/a;
    }

    // NullPointerException
    private static int test2(){
        String s = null;
        return s.length();
    }

    // ArrayIndexOutOfBoundsException
    private static void test3(int[] arr){
        arr[arr.length+1] = 123;
        }
}
