package numbers;
import java.util.ArrayList;

import java.util.Scanner;
@SuppressWarnings("Unused")
public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner sc = new Scanner(System.in);
        String intro = """
                Welcome to Amazing Numbers!
                
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - separate the parameters with one space;
                - enter 0 to exit.
                """;
        System.out.println(intro);
        System.out.print("Enter a request: ");
        System.out.println();
        String name =  sc.nextLine();
        String[] arr = name.split(" ");

        long n = Long.parseLong(arr[0]);
        if(n!=0&&n==Math.floor(n)){
            do{
                int m = arr.length;
                if (m==1){
                    anthony(n);
                }else if (m>1){

                }
                System.out.print("Enter a request: ");
                System.out.println();
                name =  sc.nextLine();
                arr = name.split(" ");

                n = Long.parseLong(arr[0]);
                int a = Integer.parseInt(arr[1]);
                if (a!=Math.floor(a)){
                    System.out.println("The second parameter should be a natural number.");
                    break;
                }
                if (n==0) {
                    System.out.println("Goodbye!");
                    break;
                }

            }while (n!=0);
        }else if(n==0){
            System.out.println("Goodbye!");
        }else {
            System.out.println("The first parameter should be a natural number or zero.");
        }
        //anthony(sc);
    }

    public static boolean containsZero(long n){
        boolean isDuck = false;
        String value = String.valueOf(n);
        String [] arrValue = value.split("");
        for (String s : arrValue) {
            if (s.equals("0")) {
                isDuck = true;
                break;
            }
        }

        return isDuck;
    }
    public static String reverseString(long n){
        String value = String.valueOf(n);
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        return sb.toString();
    }
    public static boolean isPalindromic(long n,String newValue){
        boolean isTrue = false;
        String value = String.valueOf(n);
        if (value.equals(newValue)){
            isTrue = true;
        }
       return isTrue;
    }
    public static void anthony(long n){
            //long n =0;
            boolean isEven= false;
            boolean isGapful = false;
            boolean isOdd= false;
            boolean isBuzz = false;
            boolean isDuck = false;
            boolean isPalindrome = false;
        if (n>=1 ){
            System.out.printf("Properties of %d",n);
            System.out.println();
            if(n%2==0){

                System.out.println();
                isEven=true;
                System.out.printf("        even: %b",isEven);
                System.out.println();
                System.out.printf("        odd: %b",isOdd);
                System.out.println();
            }else{
                isOdd=true;
                System.out.printf("        even: %b",isEven);
                System.out.println();
                System.out.printf("         odd: %b",isOdd);
                System.out.println();
            }
            if((n%7==0)||(n%10==7)){
                isBuzz =true;
            }
            System.out.printf("        buzz: %b",isBuzz);
            System.out.println();
            isDuck = containsZero(n);
            System.out.printf("        duck: %b", isDuck);
            System.out.println();
            String newValue = reverseString(n);
            isPalindrome = isPalindromic(n, newValue);
            System.out.printf(" palindromic: %b", isPalindrome);
            System.out.println();
            isGapful = isGrapeful(n);
            System.out.printf("      gapful: %b", isGapful);
            System.out.println();

        }
    }

    public static boolean isGrapeful(long n){
        boolean isTrue = false;
        String value = String.valueOf(n);
        String [] arrValue = value.split("");
        int x = arrValue.length;
        int [] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = value.charAt(i) - '0';
        }
        int a = arr[0];
        int b = arr[arr.length-1];
        int result = Integer.parseInt("" + a + b);
        if (x>=3&& n%result==0){
            isTrue = true;
        }
        return isTrue;
    }

}
